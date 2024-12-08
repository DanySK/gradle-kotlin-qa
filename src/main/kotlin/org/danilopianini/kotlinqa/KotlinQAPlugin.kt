package org.danilopianini.kotlinqa

import de.aaschmid.gradle.plugins.cpd.Cpd
import de.aaschmid.gradle.plugins.cpd.CpdExtension
import de.aaschmid.gradle.plugins.cpd.CpdPlugin
import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import io.gitlab.arturbosch.detekt.report.ReportMergeTask
import java.util.Properties
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.FileTree
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.registering
import org.gradle.kotlin.dsl.withType
import org.gradle.testing.jacoco.plugins.JacocoPlugin
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.KtlintPlugin
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

/**
 * Entry point for the Kotlin QA Plugin.
 */
open class KotlinQAPlugin : Plugin<Project> {
    @Suppress("UnstableApiUsage")
    override fun apply(project: Project) {
        val versions = Properties()
        val properties =
            requireNotNull(Thread.currentThread().contextClassLoader.getResourceAsStream(VERSIONS)) {
                "The Kotlin QA plugin was unable to load the required resource $VERSIONS. " +
                    "This is most likely a bug, please file an issue at: " +
                    "https://github.com/DanySK/gradle-kotlin-qa/issues/new/choose"
            }
        versions.load(properties)
        project.plugins.withType<KotlinBasePlugin> {
            with(project.plugins) {
                apply(CpdPlugin::class)
                apply(KtlintPlugin::class)
                apply(DetektPlugin::class)
                apply(JacocoPlugin::class)
            }
            val extension = project.extensions.create("kotlinQA", KotlinQAExtension::class.java, project)
            val generator =
                project.tasks.register<GenerateDetektConfiguration>(
                    "generateDefaultDetektConfiguration",
                    extension,
                )
            // Detekt
            project.tasks.withType<Detekt>().configureEach {
                it.dependsOn(generator)
            }
            project.extensions.configure<DetektExtension> {
                parallel = true
                buildUponDefaultConfig = true
                config.from(project.files(extension.detektConfigurationFile))
                ignoreFailures = false
                toolVersion = versions.forLibrary("detekt")
            }
            val reportMergeDetekt by project.tasks.registering(ReportMergeTask::class) {
                output.set(project.layout.buildDirectory.file("reports/detekt/deteket-merge.sarif"))
                input.from(project.tasks.withType<Detekt>().map { it.sarifReportFile })
            }
            project.tasks.withType<Detekt>().configureEach { it.finalizedBy(reportMergeDetekt) }
            // Ktlint
            project.extensions.configure<KtlintExtension> {
                version.set(versions.forLibrary("ktlint"))
                reporters {
                    it.reporter(ReporterType.SARIF)
                }
            }
            // CPD
            project.extensions.configure<CpdExtension> {
                toolVersion = versions.forLibrary("pmd")
            }
            val cpdKotlinCheck =
                project.tasks.register<Cpd>("cpdKotlinCheck") {
                    language = "kotlin"
                    source = project.extensions
                        .findByType<KotlinProjectExtension>()
                        ?.sourceSets
                        ?.flatMap { it.kotlin }
                        ?.map {
                            project.fileTree(it) {
                                include("**/*.kts")
                                include("**/*.kt")
                            }
                        }?.fold(project.files().asFileTree, FileTree::plus)
                        ?: project.files().asFileTree
                    minimumTokenCount = DEFAULT_CPD_TOKENS_FOR_KOTLIN
                    ignoreFailures = false
                }
            // Disable the default cpdCheck to prevent conflict or double execution
            project.tasks.findByName("cpdCheck")?.enabled = false
            // Set warnings as errors
            project.tasks.withType<KotlinCompilationTask<*>>().configureEach {
                it.compilerOptions.allWarningsAsErrors.set(true)
            }
            // JaCoCo
            project.extensions.configure<JacocoPluginExtension> {
                toolVersion = versions.forLibrary("jacoco")
            }
            project.tasks.withType(JacocoReport::class.java) { jacocoReport ->
                jacocoReport.reports {
                    it.xml.required.set(true)
                }
            }
            // Check task wiring, if it exists in this project
            project.tasks.named { it == "check" }.configureEach {
                it.dependsOn(project.tasks.withType<Detekt>(), cpdKotlinCheck)
                it.finalizedBy(project.tasks.withType<JacocoReport>())
            }
        }
    }

    private companion object {
        private const val VERSIONS = "org/danilopianini/kotlinqa/versions.properties"
        private const val DEFAULT_CPD_TOKENS_FOR_KOTLIN = 70

        private fun Properties.forLibrary(key: String): String =
            checkNotNull(get(key)?.toString()) {
                "Unable to read the default version of $key"
            }
    }
}
