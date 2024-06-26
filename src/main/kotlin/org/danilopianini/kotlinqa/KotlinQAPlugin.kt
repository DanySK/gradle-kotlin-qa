package org.danilopianini.kotlinqa

import de.aaschmid.gradle.plugins.cpd.CpdExtension
import de.aaschmid.gradle.plugins.cpd.CpdPlugin
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import java.util.Properties
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.FileTree
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.withType
import org.gradle.testing.jacoco.plugins.JacocoPlugin
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.KtlintPlugin

/**
 * Entry point for the Kotlin QA Plugin.
 */
open class KotlinQAPlugin : Plugin<Project> {

    @Suppress("UnstableApiUsage")
    override fun apply(project: Project) {
        with(project.plugins) {
            apply(CpdPlugin::class)
            apply(KtlintPlugin::class)
            apply(DetektPlugin::class)
            apply(JacocoPlugin::class)
        }
        val extension = project.extensions.create("kotlinQA", KotlinQAExtension::class.java, project)
        val generator = project.tasks.create(
            "generateDefaultDetektConfiguration",
            GenerateDetektConfiguration::class.java,
            extension,
        )
        val checkTask = project.tasks.findByName("check")
        // Detekt
        project.tasks.withType(Detekt::class.java) {
            it.dependsOn(generator)
            checkTask?.dependsOn(it)
        }
        val versions = Properties()
        val properties = requireNotNull(Thread.currentThread().contextClassLoader.getResourceAsStream(VERSIONS)) {
            "The Kotlin QA plugin was unable to load the required resource $VERSIONS. " +
                "This is most likely a bug, please file an issue at: " +
                "https://github.com/DanySK/gradle-kotlin-qa/issues/new/choose"
        }
        versions.load(properties)
        project.extensions.configure<DetektExtension> {
            parallel = true
            buildUponDefaultConfig = true
            config.from(project.files(extension.detektConfigurationFile))
            ignoreFailures = false
            toolVersion = versions.forLibrary("detekt")
        }
        // Ktlint
        project.extensions.configure<KtlintExtension> {
            version.set(versions.forLibrary("ktlint"))
        }
        // CPD
        project.plugins.withType(JavaPlugin::class.java) { _ ->
            project.extensions.configure<CpdExtension> {
                toolVersion = versions.forLibrary("pmd")
            }
            project.tasks.create<de.aaschmid.gradle.plugins.cpd.Cpd>("cpdKotlinCheck") {
                language = "kotlin"
                source = project.extensions.findByType<JavaPluginExtension>()
                    ?.sourceSets
                    ?.flatMap { it.allSource }
                    ?.map {
                        project.fileTree(it) {
                            include("**/*.kts")
                            include("**/*.kt")
                        }
                    }
                    ?.fold(project.files().asFileTree, FileTree::plus)
                    ?: project.files().asFileTree
                minimumTokenCount = DEFAULT_CPD_TOKENS_FOR_KOTLIN
                ignoreFailures = false
                checkTask?.dependsOn(this)
            }
            // Disable the default cpdCheck to prevent conflict or double execution
            project.tasks.findByName("cpdCheck")?.enabled = false
            // Set warnings as errors
            project.tasks.withType(KotlinCompile::class) {
                with(it.compilerOptions) {
                    allWarningsAsErrors.set(true)
                }
            }
        }
        // JaCoCo
        project.extensions.configure<JacocoPluginExtension> {
            toolVersion = versions.forLibrary("jacoco")
        }
        project.tasks.withType(JacocoReport::class.java) { jacocoReport ->
            jacocoReport.reports {
                it.xml.required.set(true)
            }
            checkTask?.finalizedBy(jacocoReport)
        }
    }

    companion object {
        private const val VERSIONS = "org/danilopianini/kotlinqa/versions.properties"
        private const val DEFAULT_CPD_TOKENS_FOR_KOTLIN = 70
        private fun Properties.forLibrary(key: String): String = checkNotNull(get(key)?.toString()) {
            "Unable to read the default version of $key"
        }
    }
}
