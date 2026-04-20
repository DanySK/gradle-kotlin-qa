# Repository Guidelines

Run Kotlin and Gradle work through the wrapper. Use `./gradlew` from the repository root instead of calling a system Gradle binary.

Format Kotlin sources with `./gradlew ktlintFormat` before finishing any code change that touches Kotlin or Gradle Kotlin DSL files.

Validate final changes with `./gradlew build` after formatting. If the build fails, keep fixing code, tests, and build logic until it passes.

Treat dependency or plugin updates as full compatibility work. Do not stop after changing a version string; finish only when `./gradlew build` succeeds with the updated version.

Use warning suppressions only as a last resort. Every suppression must include a short justification next to the suppression site.

Preserve the test fixture projects under `src/test/resources/org/danilopianini/kotlinqa/test/`. When behavior changes require fixture updates, keep each fixture internally consistent so the Gradle TestKit tests still describe a real project.

Keep commit messages compatible with the repository's conventional-commit hook. Use `type(scope): summary`; mark breaking changes as `type(scope)!: summary` and include a `BREAKING CHANGE:` footer when needed.

When release behavior matters, follow the `semantic-release-preconfigured-conventional-commits` mapping already used by the repository: `feat` for minor releases; `fix`, `docs`, `perf`, and `revert` for patch releases; `chore(api-deps)` for minor dependency releases; `chore(core-deps)` for patch dependency releases; `test`, `ci`, `build`, `style`, `refactor`, and other `chore(...)` scopes for non-release maintenance work.

Expect local Git hooks to run `ktlintCheck` on commit. Do not rely on the hook as the only validation step; still run the required format and build commands explicitly before finishing.

Use Node tooling only for release-related changes. If you modify `package.json`, update the lockfile as part of the same change and keep the release workflow consistent with `npx semantic-release`.
