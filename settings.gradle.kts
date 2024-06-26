rootProject.name = "gradle-kotlin-qa"

plugins {
    id("com.gradle.develocity") version "3.17.5"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.0.7"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

gitHooks {
    preCommit {
        tasks("ktlintCheck")
    }
    commitMsg { conventionalCommits() }
    createHooks()
}

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/terms-of-service"
        termsOfUseAgree = "yes"
        uploadInBackground = !System.getenv("CI").toBoolean()
    }
}
