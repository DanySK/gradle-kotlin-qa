package org.danilopianini.kotlinqa

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject

/**
 * A Gradle task that copies the default configuration from the classpath into a target file.
 */
open class GenerateDetektConfiguration @Inject constructor(private val extension: KotlinQAExtension) : DefaultTask() {

    /**
     * The output file (read only, must be configured in the [KotlinQAExtension].
     */
    @OutputFile
    val detektConfigurationFile: Provider<File> = extension.detektConfigurationFile

    /**
     * Copies the default configuration from the classpath into the destination file.
     */
    @TaskAction
    fun generateDetektConfigurationFile() {
        val configuration = Thread.currentThread().contextClassLoader.getResource(detektConfigFile)?.readText()
            ?: throw IllegalStateException(
                "Unable to read $detektConfigFile from the classpath" +
                    ", is this a bug in the Kotlin QA plugin?"
            )
        val workDir = extension.workingDirectory.get()
        if (workDir.mkdirs()) {
            logger.debug("Created folder ${workDir.absolutePath}")
        } else {
            logger.debug("Folder ${workDir.absolutePath} was already existing")
        }
        detektConfigurationFile.get().writeText(configuration)
    }

    companion object {
        private const val detektConfigFile = "org/danilopianini/kotlinqa/detekt.yml"
    }
}
