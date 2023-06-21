package org.danilopianini.kotlinqa.test

import io.github.mirkofelice.api.Testkit
import io.kotest.core.spec.style.StringSpec
import java.io.File

class Tests : StringSpec({

    val projectName = "gradle-kotlin-qa"
    val sep = File.separator
    val baseFolder = Testkit.DEFAULT_TEST_FOLDER + "org${sep}danilopianini${sep}kotlinqa${sep}test$sep"

    fun Testkit.projectTest(folder: String) = this.test(projectName, baseFolder + folder)

    "Test 0" {
        Testkit.projectTest("test0")
    }

    "Test NoSource" {
        Testkit.projectTest("testNoSource")
    }
})
