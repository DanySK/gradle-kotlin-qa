package org.danilopianini.kotlinqa.test

import io.github.mirkofelice.api.Testkit
import io.kotest.core.spec.style.StringSpec
import java.io.File

class Tests : StringSpec({

    val projectName = "gradle-kotlin-qa"
    val sep = File.separator
    val baseFolder = Testkit.DEFAULT_TEST_FOLDER + "org${sep}danilopianini${sep}kotlinqa${sep}test$sep"

    fun Testkit.projectTest(folder: String) = this.test(projectName, baseFolder + folder)

    val tests =
        listOf(
            "test0" to { true },
            "testNoSource" to { true },
            "testKMP" to {
                val javaMajor =
                    JAVA_VERSION
                        .substringBefore('.')
                        .substringBefore('+')
                        .toInt()
                javaMajor >= MIN_JAVA_VERSION_FOR_ANDROID
            },
        )
    for ((testName, predicate) in tests) {
        if (predicate()) {
            testName { Testkit.projectTest(testName) }
        }
    }
}) {
    companion object {
        val JAVA_VERSION =
            checkNotNull(System.getProperty("java.runtime.version")) {
                "Unable to read the Java version, property java.runtime.version is not set"
            }
        const val MIN_JAVA_VERSION_FOR_ANDROID = 17
    }
}
