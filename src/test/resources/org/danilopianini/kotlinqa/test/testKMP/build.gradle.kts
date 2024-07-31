import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0

plugins {
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.kotlin.multiplatform)
}

group = "org.danilopianini"

repositories {
    google()
    mavenCentral()
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
kotlin {
    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    jvmToolchain(17)

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.bundles.kotlin.testing.common)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.bundles.kotlin.testing.common)
                implementation(libs.bundles.kotest.common)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(libs.kotest.runner.junit5)
            }
        }
    }

    js(IR) {
        browser()
        nodejs()
        binaries.library()
//        binaries.executable()
    }

    compilerOptions {
        allWarningsAsErrors = true
        apiVersion = KOTLIN_2_0
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }
}
