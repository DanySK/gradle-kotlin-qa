package org.danilopianini.kotlinqa

import java.io.File
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.property

/**
 * Gradle extension for the Kotlin QA Plugin.
 */
open class KotlinQAExtension(
    project: Project,
) {
    /**
     * The folder where the Detekt configuration will be generated.
     */
    val workingDirectory: Property<File> =
        project.objects.property<File>().apply {
            set(
                project.layout.buildDirectory.asFile
                    .map { File(it, "kotlinqa") },
            )
        }

    /**
     * The name of the generated Detekt configuration file.
     */
    val detektConfigurationFileName: Property<String> =
        project.objects.property<String>().apply {
            set("detekt.yml")
        }

    /**
     * The generated Detekt configuration file. Read only, use [workingDirectory] and [detektConfigurationFileName]
     * to change the value of this property.
     */
    val detektConfigurationFile: Provider<File> =
        workingDirectory.flatMap { workDir ->
            detektConfigurationFileName.map { fileName ->
                project.file("${workDir.absolutePath}${slash}$fileName")
            }
        }

    private companion object {
        private val slash: String = File.separator
    }
}
