package org.danilopianini.kotlinqa.test

import io.github.mirkofelice.api.Testkit
import io.kotest.core.spec.style.StringSpec

class Tests : StringSpec({

    "Test 0" {
        Testkit.test(
            "gradle-kotlin-qa",
            Testkit.DEFAULT_TEST_FOLDER.replace("main", "test") +
                "org/danilopianini/kotlinqa/test/test0",
        )
    }

    "Test NoSource" {
        Testkit.test(
            "gradle-kotlin-qa",
            Testkit.DEFAULT_TEST_FOLDER.replace("main", "test") +
                "org/danilopianini/kotlinqa/test/testNoSource",
        )
    }
})
