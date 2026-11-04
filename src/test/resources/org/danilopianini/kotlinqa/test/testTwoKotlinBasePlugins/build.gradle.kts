import org.jetbrains.kotlin.gradle.plugin.KotlinBaseApiPlugin

plugins {
    kotlin("jvm")
    id("org.danilopianini.gradle-kotlin-qa")
}

/*
 * A second Kotlin base plugin, as `kotlin-dsl` applies on top of the Kotlin JVM plugin.
 * This project does not use `kotlin-dsl` directly because the TestKit plugin classpath is loaded separately
 * from the Kotlin plugin that `kotlin-dsl` brings, so the plugin under test would not see it.
 */
apply<KotlinBaseApiPlugin>()

repositories {
    mavenCentral()
}
