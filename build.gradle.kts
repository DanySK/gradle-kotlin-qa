import org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION as KOTLIN_VERSION

@Suppress("DSL_SCOPE_VIOLATION")
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
inner class ProjectInfo {
    val longName = "Kotlin Quality Assurance Gradle plugin"
    val website = "https://github.com/DanySK/$name"
    val scm = "git@github.com:DanySK/$name.git"
    val pluginImplementationClass = "$group.kotlinqa.KotlinQAPlugin"
    val tags = listOf("kotlin", "static analysis", "quality assurance", "qa")
}
val info = ProjectInfo()

gitSemVer {
    buildMetadataSeparator.set("-")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

tasks.create("copyToolVersions") {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { dependsOn(this@create) }
    val destinationDir = "$buildDir/resources/main/org/danilopianini/kotlinqa/"
    val destination = file("$destinationDir/versions.properties")
    tasks.withType<PublishToMavenRepository> {
        dependsOn(this@create)
        doFirst {
            require(destination.exists()) {
                "File ${destination.path} has not been generated."
            }
        }
    }
    val catalogFile = file("${rootProject.rootDir.absolutePath}/gradle/libs.versions.toml")
    inputs.file(catalogFile)
    outputs.file(destination)
    doLast {
        val buildDir = project.buildDir.absolutePath
        file(destinationDir).mkdirs()
        val catalog = catalogFile.readText()
        val libraries = listOf("detekt", "jacoco", "ktlint", "pmd")
            .map { library ->
                val version = Regex("""^$library\s*=\s*"([\d\w\.\-\+]+)"\s*$""", RegexOption.MULTILINE)
                    .findAll(catalog)
                    .firstOrNull()
                    ?.destructured
                    ?.component1()
                    ?: throw IllegalStateException("No version available for $library in:\n$catalog")
                "$library=$version"
            }
            .joinToString("\n")
        destination.writeText(libraries)
    }
}

multiJvm {
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}

/*
 * By default, Gradle does not include all the plugin classpath into the testing classpath.
 * This task creates a descriptor of the runtime classpath, to be injected (manually) when running tests.
 */
val createClasspathManifest by tasks.registering {
    val outputDir = file("$buildDir/$name")
    inputs.files(sourceSets.main.get().runtimeClasspath)
    outputs.dir(outputDir)
    doLast {
        outputDir.mkdirs()
        file("$outputDir/plugin-classpath.txt").writeText(sourceSets.main.get().runtimeClasspath.joinToString("\n"))
    }
}

tasks.withType<Test> {
    dependsOn(createClasspathManifest)
}

dependencies {
    api(gradleApi())
    api(gradleKotlinDsl())
    api(libs.bundles.kotlin.qa)
    implementation(kotlin("stdlib-jdk8"))
    implementation(libs.kotlin.gradle.plugin.api)
    testImplementation(gradleTestKit())
    testImplementation(libs.konf.yaml)
    testImplementation(libs.classgraph)
    testImplementation(libs.bundles.kotlin.testing)
    testRuntimeOnly(files(createClasspathManifest))
}

// Enforce Kotlin version coherence
configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin" && requested.name.startsWith("kotlin")) {
            useVersion(KOTLIN_VERSION)
            because("All Kotlin modules should use the same version, and compiler uses $KOTLIN_VERSION")
        }
    }
}

kotlin {
    target {
        compilations.all {
            kotlinOptions {
                allWarningsAsErrors = true
                freeCompilerArgs = listOf("-XXLanguage:+InlineClasses", "-Xopt-in=kotlin.RequiresOptIn")
            }
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
        showCauses = true
        showStackTraces = true
        events(*org.gradle.api.tasks.testing.logging.TestLogEvent.values())
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
    repository("https://maven.pkg.github.com/DanySK/${rootProject.name}".toLowerCase(), name = "github") {
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

pluginBundle {
    website = info.website
    vcsUrl = info.website
    tags = info.tags
}

gradlePlugin {
    plugins {
        create("kotlin-qa") {
            id = "$group.${project.name}"
            displayName = info.longName
            description = project.description
            implementationClass = info.pluginImplementationClass
        }
    }
}
