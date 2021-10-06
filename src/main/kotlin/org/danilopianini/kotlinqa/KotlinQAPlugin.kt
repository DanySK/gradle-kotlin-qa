package org.danilopianini.kotlinqa

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.testing.jacoco.plugins.JacocoPlugin
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.KtlintPlugin
import java.util.Properties

/**
 * Entry point for the Kotlin QA Plugin.
 */
open class KotlinQAPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project.plugins) {
            apply(KtlintPlugin::class)
            apply(DetektPlugin::class)
            apply(JacocoPlugin::class)
        }
        val extension = project.extensions.create("kotlinQA", KotlinQAExtension::class.java, project)
        val generator = project.tasks.create(
            "generateDefaultDetektConfiguration",
            GenerateDetektConfiguration::class.java,
            extension
        )
        project.tasks.withType(Detekt::class.java) {
            it.dependsOn(generator)
        }
        val versions = Properties()
        fun Properties.forLibrary(key: String): String =
            get(key)?.toString() ?: throw IllegalStateException("Unable to read the default version of $key")
        versions.load(Thread.currentThread().contextClassLoader.getResourceAsStream(VERSIONS))
        project.extensions.configure<DetektExtension> {
            parallel = true
            buildUponDefaultConfig = true
            config = project.files(extension.detektConfigurationFile)
            ignoreFailures = false
            toolVersion = versions.forLibrary("detekt")
        }
        project.extensions.configure<KtlintExtension> {
            version.set(versions.forLibrary("ktlint"))
        }
        project.extensions.configure<JacocoPluginExtension> {
            toolVersion = versions.forLibrary("jacoco")
        }
        project.tasks.withType(JacocoReport::class.java) { jacocoReport ->
            jacocoReport.reports {
                it.xml.required.set(true)
            }
            project.tasks.findByName("check")?.finalizedBy(jacocoReport)
        }
    }

    companion object {
        private const val VERSIONS = "org/danilopianini/kotlinqa/versions.properties"
    }
}
