package org.danilopianini.kotlinqa

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.jlleitschuh.gradle.ktlint.KtlintPlugin

/**
 * Entry point for the Kotlin QA Plugin.
 */
open class KotlinQAPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project.plugins) {
            apply(KtlintPlugin::class)
            apply(DetektPlugin::class)
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
        project.extensions.configure(DetektExtension::class.java) { detekt ->
            with(detekt) {
                parallel = true
                buildUponDefaultConfig = true
                config = project.files(extension.detektConfigurationFile)
                ignoreFailures = false
            }
        }
    }
}
