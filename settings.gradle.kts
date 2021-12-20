rootProject.name = "gradle-kotlin-qa"
enableFeaturePreview("VERSION_CATALOGS")

plugins {
    id("com.gradle.enterprise") version "3.8"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}
