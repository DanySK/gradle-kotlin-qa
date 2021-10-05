# Kotlin Automated Quality Assurance

This Gradle plugin applies Ktlint and Detekt under the hood.
More static checkers may come in the future.
All checkers' configuration have been customized to match my requirements.

These settings can be changed as you would when configuring the checkers,
this plugin pre-configures them, but does not force anything.

## How to use

```kotlin
plugins {
    id("org.danilopianini.gradle-kotlin-qa") version "<SELECT THE VERSION>"
}
```
