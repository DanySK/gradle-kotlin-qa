import org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION as KOTLIN_VERSION
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    `java-gradle-plugin`
    alias(libs.plugins.dokka)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.gradlePluginPublish)
    alias(libs.plugins.jacoco.testkit)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.publishOnCentral)
    alias(libs.plugins.multiJvmTesting)
    alias(libs.plugins.taskTree)
}

/*
 * Project information
 */
group = "org.danilopianini"
description = "Automated Quality Assurance configuration for Kotlin Projects built with Gradle"

class ProjectInfo {
    val longName = "Kotlin Quality Assurance Gradle plugin"
    val website = "https://github.com/DanySK/$name"
    val vcsUrl = "$website.git"
    val scm = "scm:git:$website.git"
    val pluginImplementationClass = "$group.kotlinqa.KotlinQAPlugin"
    val tags = listOf("kotlin", "static analysis", "quality assurance", "qa")
}
val info = ProjectInfo()

gitSemVer {
    buildMetadataSeparator.set(".")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

val destinationDir = layout.buildDirectory.map {
    file("${it.asFile.absolutePath}/resources/main/org/danilopianini/kotlinqa/")
}
val destination = destinationDir.map { File(it, "versions.properties") }

val copyToolVersions by tasks.registering {
    val catalogFile = file("${rootProject.rootDir.absolutePath}/gradle/libs.versions.toml")
    inputs.file(catalogFile)
    outputs.file(destination)
    doLast {
        file(destinationDir).mkdirs()
        val catalog = catalogFile.readText()
        val libraries =
            listOf("detekt", "jacoco", "ktlint", "pmd").joinToString("\n") { library ->
                val version =
                    Regex("""^$library\s*=\s*"([\d\w\.\-\+]+)"\s*$""", RegexOption.MULTILINE)
                        .findAll(catalog)
                        .firstOrNull()
                        ?.destructured
                        ?.component1()
                        ?: throw IllegalStateException("No version available for $library in:\n$catalog")
                "$library=$version"
            }
        destination.get().writeText(libraries)
    }
}

tasks.withType<KotlinCompilationTask<*>>().configureEach { dependsOn(copyToolVersions) }

tasks.withType<PublishToMavenRepository>().configureEach {
    dependsOn(copyToolVersions)
    doFirst {
        val destinationFile = destination.get()
        require(destinationFile.exists()) {
            "File ${destinationFile.path} has not been generated."
        }
    }
}

multiJvm {
    jvmVersionForCompilation = oldestJavaSupportedByGradle
    maximumSupportedJvmVersion = latestJavaSupportedByGradle
}

dependencies {
    api(gradleApi())
    api(gradleKotlinDsl())
    api(libs.bundles.kotlin.qa)
    implementation(kotlin("stdlib-jdk8"))
    implementation(libs.kotlin.gradle.plugin.api)
    testImplementation(libs.apache.commons.lang3)
    testImplementation(libs.classgraph)
    testImplementation(libs.konf.yaml)
    testImplementation(libs.bundles.kotlin.testing)
}

/*
 * The following lines are a workaround for
 * https://github.com/gradle/gradle/issues/16603.
 * The issue is related to the Gradle Daemon getting terminated by the Gradle Testkit,
 * and the JaCoCo agent not waiting for it.
 */
inline fun <reified T : Task> Project.disableTrackState() {
    tasks.withType<T>().configureEach {
        doNotTrackState("Otherwise JaCoCo does not work correctly")
    }
}

disableTrackState<Test>()
disableTrackState<JacocoReport>()

// Enforce Kotlin version coherence
configurations.matching { it.name != "detekt" }.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin" && requested.name.startsWith("kotlin")) {
            useVersion(KOTLIN_VERSION)
            because("All Kotlin modules should use the same version, and compiler uses $KOTLIN_VERSION")
        }
    }
}

kotlin {
    compilerOptions {
        allWarningsAsErrors = true
    }
}

tasks.withType<Test> {
    mustRunAfter(tasks.generateJacocoTestKitProperties)
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
        showCauses = true
        showStackTraces = true
        events(
            *org.gradle.api.tasks.testing.logging.TestLogEvent
                .values(),
        )
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}

tasks.jacocoTestReport {
    reports {
        // Used by Codecov.io
        xml.required.set(true)
    }
}

signing {
    if (System.getenv()["CI"].equals("true", ignoreCase = true)) {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
    }
}

/*
 * Publication on Maven Central and the Plugin portal
 */
publishOnCentral {
    projectLongName.set(info.longName)
    projectDescription.set(description ?: TODO("Missing description"))
    projectUrl.set(info.website)
    scmConnection.set(info.scm)
    repository("https://maven.pkg.github.com/DanySK/${rootProject.name}".lowercase(), name = "github") {
        user.set("danysk")
        password.set(System.getenv("GITHUB_TOKEN"))
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                developers {
                    developer {
                        name.set("Danilo Pianini")
                        email.set("danilo.pianini@gmail.com")
                        url.set("http://www.danilopianini.org/")
                    }
                }
            }
        }
    }
}

gradlePlugin {
    plugins {
        website.set(info.website)
        vcsUrl.set(info.vcsUrl)
        create("") {
            id = "$group.${project.name}"
            displayName = info.longName
            description = project.description
            implementationClass = info.pluginImplementationClass
            tags.set(info.tags)
        }
    }
}
