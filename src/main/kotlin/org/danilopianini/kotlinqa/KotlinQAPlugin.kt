package org.danilopianini.kotlinqa

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectories
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.property
import org.jlleitschuh.gradle.ktlint.KtlintPlugin
import java.io.File
import java.io.Serializable
import java.lang.IllegalStateException
import javax.inject.Inject

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

open class GenerateDetektConfiguration @Inject constructor(private val extension: KotlinQAExtension) : DefaultTask() {

    @OutputFile
    val detektConfigurationFile: Provider<File> = extension.detektConfigurationFile

    @TaskAction
    fun generateDetektConfigurationFile() {
        val configuration = Thread.currentThread().contextClassLoader.getResource(detektConfigFile)?.readText()
            ?: throw IllegalStateException(
                "Unable to read $detektConfigFile from the classpath" +
                        ", is this a bug in the Kotlin QA plugin?"
            )
        val workDir = extension.workingDirectory.get()
        if(workDir.mkdirs()) {
            logger.debug("Created folder ${workDir.absolutePath}")
        } else {
            logger.debug("Folder ${workDir.absolutePath} was already existing")
        }
        detektConfigurationFile.get().writeText(configuration)
    }

    companion object {
        private val detektConfigFile = "org/danilopianini/kotlinqa/detekt.yml"
    }
}

open class KotlinQAExtension(project: Project) : Serializable {

    val workingDirectory: Property<File> = project.objects.property<File>().apply {
        set(project.file("${project.buildDir.absolutePath}${slash}kotlinqa"))
    }

    val detektConfigurationFileName: Property<String> = project.objects.property<String>().apply {
        set("detekt.yml")
    }

    val detektConfigurationFile: Provider<File> = workingDirectory.flatMap { workDir ->
        detektConfigurationFileName.map { fileName ->
            project.file("${workDir.absolutePath}${slash}$fileName")
        }
    }

    companion object {
        private const val serialVersionUID = 1L
        private val slash: String = File.separator
    }
}
