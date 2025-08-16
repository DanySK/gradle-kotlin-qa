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
    jvmToolchain(17)
    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
    js(IR) {
        browser()
        nodejs()
        binaries.library()
    }

    compilerOptions {
        allWarningsAsErrors = true
        apiVersion = KOTLIN_2_0
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }
}
