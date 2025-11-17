plugins {
    kotlin("jvm") version "2.2.21"
    id("org.danilopianini.gradle-kotlin-qa")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}
