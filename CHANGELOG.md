## [0.36.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.35.0...0.36.0) (2023-03-04)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.0 ([c069cfe](https://github.com/DanySK/gradle-kotlin-qa/commit/c069cfe79356774823f14bf26030e21fa6f851b7))


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.3.1 ([531103f](https://github.com/DanySK/gradle-kotlin-qa/commit/531103fafe23692a7a4866a34bbbe1143c2ae60c))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.155 ([9881427](https://github.com/DanySK/gradle-kotlin-qa/commit/98814274d0680eb0d1c420f625d468782e29bd46))
* **deps:** update plugin com.gradle.enterprise to v3.12.4 ([2e58704](https://github.com/DanySK/gradle-kotlin-qa/commit/2e5870445efad12264bd6540171d0c8abc47c14d))
* **deps:** update plugin gitsemver to v1.1.2 ([a6d0dbd](https://github.com/DanySK/gradle-kotlin-qa/commit/a6d0dbd780ec67cb8d0e1194ea879f0fdba52cc5))

## [0.35.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.34.2...0.35.0) (2023-02-25)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.55.0 ([f301577](https://github.com/DanySK/gradle-kotlin-qa/commit/f3015772857dadc19096f75ab9da0856fd4774f6))

## [0.34.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.34.1...0.34.2) (2023-02-24)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.26 ([167c020](https://github.com/DanySK/gradle-kotlin-qa/commit/167c02033292da378a856fdf5c1e3b02cbdef1aa))


### Dependency updates

* **core-deps:** update dependency gradle to v7.6.1 ([8313319](https://github.com/DanySK/gradle-kotlin-qa/commit/8313319e4bedbd310ebf4a17ba06e9a5a80d5f72))
* **deps:** update plugin gitsemver to v1.1.1 ([dea9d33](https://github.com/DanySK/gradle-kotlin-qa/commit/dea9d33d1af20043ecaa392a8ebde165c350e66c))
* **deps:** update plugin multijvmtesting to v0.4.17 ([002b819](https://github.com/DanySK/gradle-kotlin-qa/commit/002b819ea496e439bc582d6c162a9404dde9a0f9))
* **deps:** update plugin publishoncentral to v3.2.4 ([3c93fce](https://github.com/DanySK/gradle-kotlin-qa/commit/3c93fce91e5630de2ca1f1c212f1fbed1f13e28b))
* **deps:** update plugin publishoncentral to v3.3.0 ([037daa4](https://github.com/DanySK/gradle-kotlin-qa/commit/037daa4fcc6ee1a41b8c95a529e27fd19703b866))

## [0.34.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.34.0...0.34.1) (2023-02-19)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.25 ([ac304f3](https://github.com/DanySK/gradle-kotlin-qa/commit/ac304f372e452656d11f2b12789ec085c648f7ea))
* enable org.gradle.toolchains.foojay-resolver-convention ([cb2c1eb](https://github.com/DanySK/gradle-kotlin-qa/commit/cb2c1eb21739907821e077a512a64c84b5af29b0))
* simplify the syntax of the plugin dependencies ([6543acb](https://github.com/DanySK/gradle-kotlin-qa/commit/6543acb37b255f060a08972c599f802b92e8520f))
* update the url refs in pom.xml ([#375](https://github.com/DanySK/gradle-kotlin-qa/issues/375)) ([d8c5d0f](https://github.com/DanySK/gradle-kotlin-qa/commit/d8c5d0fe82ceac0f3fa23f3f4f5fcc673e896185))


### Dependency updates

* **deps:** update plugin gitsemver to v1 ([5babb66](https://github.com/DanySK/gradle-kotlin-qa/commit/5babb66308b7206ea16585c7cc438135adeb1227))
* **deps:** update plugin gitsemver to v1.0.2 ([80b8677](https://github.com/DanySK/gradle-kotlin-qa/commit/80b86771325bde56c83fbfd01eb470acefe9a528))
* **deps:** update plugin multijvmtesting to v0.4.16 ([a8ffcb4](https://github.com/DanySK/gradle-kotlin-qa/commit/a8ffcb424cbbe675ffe2790f14e568ef6e881633))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.2 ([9aaee3c](https://github.com/DanySK/gradle-kotlin-qa/commit/9aaee3c21222d8712d1943ac670f39454ce7dd1d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.3 ([0b653be](https://github.com/DanySK/gradle-kotlin-qa/commit/0b653be16686e79692cb1567fdf53beb34075079))
* **deps:** update plugin publishoncentral to v3.2.1 ([3093672](https://github.com/DanySK/gradle-kotlin-qa/commit/30936725725b4a9e241a94572e7f4eb75a624010))
* **deps:** update plugin publishoncentral to v3.2.2 ([6b219d9](https://github.com/DanySK/gradle-kotlin-qa/commit/6b219d9361e00553156479507d8bb7302ef6c4a1))
* **deps:** update plugin publishoncentral to v3.2.3 ([0088315](https://github.com/DanySK/gradle-kotlin-qa/commit/00883156dc1e67d9f78da7545e3ef130fff6733c))


### Tests

* copy testkit-gradle.properties into the test repos ([6364768](https://github.com/DanySK/gradle-kotlin-qa/commit/6364768c382fe5c02a1cdf0a59cc6ccdb6b3f0f7))


### Revert previous changes

* jacoco loading was already in place ([63e5aa3](https://github.com/DanySK/gradle-kotlin-qa/commit/63e5aa30ecf01dc89271d9c83e9db170512e1405))

## [0.34.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.33.0...0.34.0) (2023-02-17)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.22 ([f083fc4](https://github.com/DanySK/gradle-kotlin-qa/commit/f083fc49161af46e1a2ef623679b4b5300d4ea78))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.23 ([d7d0b6b](https://github.com/DanySK/gradle-kotlin-qa/commit/d7d0b6b8751517dbc640b2e0f3cca4499bc92cb6))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.24 ([9fba87c](https://github.com/DanySK/gradle-kotlin-qa/commit/9fba87c27c41283a4cb731bb0db60b3a1ae1d217))
* fix the version of the runner's operating system ([ffabb50](https://github.com/DanySK/gradle-kotlin-qa/commit/ffabb50300a2ee9d6345a919245c2ac587b1253c))
* **mergify:** copy the mergify configuration from Alchemist ([0120abb](https://github.com/DanySK/gradle-kotlin-qa/commit/0120abb62846fdf30ee8aa3a48bb06c0b41f3b0b))


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.2.0 ([fd628f3](https://github.com/DanySK/gradle-kotlin-qa/commit/fd628f317fbedc831861864407d69b5fd64d3b2e))
* **deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.8.10 ([d4e2ce3](https://github.com/DanySK/gradle-kotlin-qa/commit/d4e2ce342326d17c32f41364cffafb4908a2a7c2))
* **deps:** update dependency org.mockito:mockito-core to v5.1.0 ([dfc963e](https://github.com/DanySK/gradle-kotlin-qa/commit/dfc963e2a58b8c5ec76359877038d622466e0edb))
* **deps:** update dependency org.mockito:mockito-core to v5.1.1 ([9c3f86e](https://github.com/DanySK/gradle-kotlin-qa/commit/9c3f86e06505031fbed63efe0c9668a01fd6622a))
* **deps:** update kotest to v5.5.5 ([8d08e8c](https://github.com/DanySK/gradle-kotlin-qa/commit/8d08e8c4686078ec07d6fa1523bc0b1a8d3d4d46))
* **deps:** update node.js to 18.14 ([4c564ff](https://github.com/DanySK/gradle-kotlin-qa/commit/4c564ffee49abf19d44e775ee06985e850fd7618))
* **deps:** update plugin com.gradle.enterprise to v3.12.3 ([6c54274](https://github.com/DanySK/gradle-kotlin-qa/commit/6c54274b0f521fe7f2d992415a7578f9bf22a1b8))
* **deps:** update plugin gradlepluginpublish to v1.1.0 ([1324b03](https://github.com/DanySK/gradle-kotlin-qa/commit/1324b0330163949859d4bed9a4e36f7e2cdb77a7))
* **deps:** update plugin publishoncentral to v3.1.1 ([7267fe1](https://github.com/DanySK/gradle-kotlin-qa/commit/7267fe16012f341cb4ddb53284f053b973ff54e4))
* **deps:** update plugin tasktree to v2.1.1 ([67d327f](https://github.com/DanySK/gradle-kotlin-qa/commit/67d327f4b97dc207c20662036f48c674763d265e))

## [0.33.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.32.0...0.33.0) (2023-01-31)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.54.0 ([9ee1ea5](https://github.com/DanySK/gradle-kotlin-qa/commit/9ee1ea5056cc50880d850910f2164ee7863a220a))
* **deps:** update dependency org.mockito:mockito-core to v5 ([a97f287](https://github.com/DanySK/gradle-kotlin-qa/commit/a97f28703b1b637f0c0437273228647f56da4e57))

## [0.32.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.31.0...0.32.0) (2023-01-30)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.3.0 ([91abca6](https://github.com/DanySK/gradle-kotlin-qa/commit/91abca6eb24cff43e43147c7529a83dd50ad7224))
* **deps:** update danysk/action-checkout action to v0.2.5 ([fb7a590](https://github.com/DanySK/gradle-kotlin-qa/commit/fb7a590a5a5f69f813e8122326b9ae6d424ebd9a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.21 ([73cf830](https://github.com/DanySK/gradle-kotlin-qa/commit/73cf8304e5be90f7b508adc777835ba52884a884))


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.1.0 ([a21f122](https://github.com/DanySK/gradle-kotlin-qa/commit/a21f122dac67c1d102dd522dd4905caa458bc6d9))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.154 ([f3d4aec](https://github.com/DanySK/gradle-kotlin-qa/commit/f3d4aec50143c933c5ad4a596202283ff284b1a2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.16 ([45ac578](https://github.com/DanySK/gradle-kotlin-qa/commit/45ac5780d94402b8f0afdd6cc72666285ef59ce6))
* **deps:** update node.js to 18.13 ([34cc72d](https://github.com/DanySK/gradle-kotlin-qa/commit/34cc72d8c9853feb46c311911b2ec253bb3ff3e2))
* **deps:** update plugin publishoncentral to v3 ([fbfe853](https://github.com/DanySK/gradle-kotlin-qa/commit/fbfe8530e2e50e4381d966e5bc8bce3e31d10e75))

## [0.31.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.30.0...0.31.0) (2023-01-03)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.53.0 ([f253733](https://github.com/DanySK/gradle-kotlin-qa/commit/f253733b2f718da05a3f4d0854c9abebfc786458))

## [0.30.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.29.2...0.30.0) (2023-01-03)


### Features

* generate multiple variants (one per minor gradle version on the current major) ([15cc0ff](https://github.com/DanySK/gradle-kotlin-qa/commit/15cc0ff41f9745f1e68845d386ec9cb0c91d959a))
* make check depend on all Detekt tasks ([24c1bde](https://github.com/DanySK/gradle-kotlin-qa/commit/24c1bdeb27073d5be6e289afeddc0c78237eed25))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.20 ([1d5e0cd](https://github.com/DanySK/gradle-kotlin-qa/commit/1d5e0cd35d6915d546f36517b7464bcdeb4d573c))


### Dependency updates

* **deps:** update dependency org.mockito:mockito-core to v4.11.0 ([98ffdcb](https://github.com/DanySK/gradle-kotlin-qa/commit/98ffdcb85f7c63626adcd17b343d4ba7b7a395b8))
* **deps:** update plugin kotlin-qa to v0.29.2 ([ed83590](https://github.com/DanySK/gradle-kotlin-qa/commit/ed835902842355f6de1938fd38c2aaf829275ec0))
* **deps:** update plugin multijvmtesting to v0.4.15 ([f2ea665](https://github.com/DanySK/gradle-kotlin-qa/commit/f2ea66572c78bf3a5b25c7f9df82eff470196d36))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.1 ([c34b8b3](https://github.com/DanySK/gradle-kotlin-qa/commit/c34b8b32649b24c8732494ad3764a251f7192e14))
* **deps:** update plugin publishoncentral to v2.0.12 ([c664613](https://github.com/DanySK/gradle-kotlin-qa/commit/c66461342a5b8f5b292485b300639595af973f7b))


### Style improvements

* prefer error over throwing exception ([626997c](https://github.com/DanySK/gradle-kotlin-qa/commit/626997cbf0a8e27c61c9564a1d9ec53208ea139a))

## [0.29.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.29.1...0.29.2) (2022-12-30)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.2.0 ([df29a52](https://github.com/DanySK/gradle-kotlin-qa/commit/df29a52bb0b393fc87ff3c4602606d7a2223000a))
* **deps:** update danysk/action-checkout action to v0.2.4 ([9d8dbfe](https://github.com/DanySK/gradle-kotlin-qa/commit/9d8dbfe175e5ba445cd5446e4cc1ff272aefdce5))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.15 ([de37c4a](https://github.com/DanySK/gradle-kotlin-qa/commit/de37c4aa98a36666b2aef28e5c01a90832c240fe))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.16 ([a93a694](https://github.com/DanySK/gradle-kotlin-qa/commit/a93a694e743487f9ca605d1044d715a2165d2343))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.17 ([184f4c6](https://github.com/DanySK/gradle-kotlin-qa/commit/184f4c60d757752a8f6adcb6810dc3515d464fc3))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.18 ([2da88e3](https://github.com/DanySK/gradle-kotlin-qa/commit/2da88e3af2edb39a46334327c99fd37b3efdead9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.19 ([93c8f53](https://github.com/DanySK/gradle-kotlin-qa/commit/93c8f539621b1b95f625e4650331fe10af294fbb))


### Dependency updates

* **core-deps:** update kotlin monorepo to v1.8.0 ([b450884](https://github.com/DanySK/gradle-kotlin-qa/commit/b45088498fdbd10ff402f4f7cff1dbf45c25bad1))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.152 ([c002df0](https://github.com/DanySK/gradle-kotlin-qa/commit/c002df040f3af261cc04e1bfaef0d7956b3d9553))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.153 ([472e630](https://github.com/DanySK/gradle-kotlin-qa/commit/472e6304c9bcb5a76b04383272685720d030040b))
* **deps:** update dependency org.mockito:mockito-core to v4.10.0 ([314536b](https://github.com/DanySK/gradle-kotlin-qa/commit/314536b1c0fba2ec85340b913843cd9816c0684f))
* **deps:** update plugin kotlin-qa to v0.29.0 ([d05772c](https://github.com/DanySK/gradle-kotlin-qa/commit/d05772c84f01e620e52e23360befcef5fe033696))
* **deps:** update plugin kotlin-qa to v0.29.1 ([8ae28e0](https://github.com/DanySK/gradle-kotlin-qa/commit/8ae28e0471431d265583d13856e359327b522d24))
* **deps:** update plugin multijvmtesting to v0.4.14 ([76248a3](https://github.com/DanySK/gradle-kotlin-qa/commit/76248a354c6597d8d5bebb2afdcadbb18a8cd942))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.24 ([4e0e361](https://github.com/DanySK/gradle-kotlin-qa/commit/4e0e361d36c761a45730e7c277ea9161c5102234))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.25 ([ac19831](https://github.com/DanySK/gradle-kotlin-qa/commit/ac19831ae69f6f3d79af267a18cc7b6cc7ce7fd2))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.0 ([c9d6f21](https://github.com/DanySK/gradle-kotlin-qa/commit/c9d6f21aceeacb57520d20a17f5b7647c1081071))
* **deps:** update plugin publishoncentral to v2.0.10 ([4b87f82](https://github.com/DanySK/gradle-kotlin-qa/commit/4b87f82f4eb0de6339eeaa3762d858ffc62cdedf))
* **deps:** update plugin publishoncentral to v2.0.11 ([18f701e](https://github.com/DanySK/gradle-kotlin-qa/commit/18f701e8ff72cb804ad110a205d54a2ed4cf4036))

## [0.29.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.29.0...0.29.1) (2022-12-01)


### Dependency updates

* **core-deps:** update kotlin monorepo to v1.7.22 ([69d31c2](https://github.com/DanySK/gradle-kotlin-qa/commit/69d31c2b103c20ac21c98bb1c5e1fee4f3eae447))

## [0.29.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.28.0...0.29.0) (2022-11-29)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.52.0 ([2871190](https://github.com/DanySK/gradle-kotlin-qa/commit/28711900b422751227bf16413215ecb033f56c0d))
* **core-deps:** update dependency gradle to v7.6 ([05fbd83](https://github.com/DanySK/gradle-kotlin-qa/commit/05fbd838eadc49d1bf4a2b69b6d524774632b785))
* **deps:** update plugin kotlin-qa to v0.28.0 ([1ab2184](https://github.com/DanySK/gradle-kotlin-qa/commit/1ab21841e1fde2b76aa1fc2f9e0ceeeac9214364))

## [0.28.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.27.1...0.28.0) (2022-11-23)


### Dependency updates

* **api-deps:** update detekt to v1.22.0 ([2c24adc](https://github.com/DanySK/gradle-kotlin-qa/commit/2c24adc60804e840963d0461a5198f698ba83f1c))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.150 ([72e3251](https://github.com/DanySK/gradle-kotlin-qa/commit/72e325115d6169affca644fc1530a2ae5b2b5d0a))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.151 ([880a543](https://github.com/DanySK/gradle-kotlin-qa/commit/880a5432d9aa40f01f2c3f891453bb941ef88eaa))
* **deps:** update dependency org.mockito:mockito-core to v4.9.0 ([fedfd1a](https://github.com/DanySK/gradle-kotlin-qa/commit/fedfd1abca0e78fb605ad81332dea6273bd238ff))
* **deps:** update plugin kotlin-qa to v0.27.1 ([f4e4c47](https://github.com/DanySK/gradle-kotlin-qa/commit/f4e4c475f712cf2d4caeef1cf22a7dadfd6cf1ff))
* **deps:** update plugin multijvmtesting to v0.4.13 ([e22b5aa](https://github.com/DanySK/gradle-kotlin-qa/commit/e22b5aa71720fcaf7981f25170cdc92950b4cf69))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.23 ([1e6e145](https://github.com/DanySK/gradle-kotlin-qa/commit/1e6e145237c442ec6677f812ce7f86f4244d53eb))
* **deps:** update plugin publishoncentral to v2.0.9 ([6fc7ff0](https://github.com/DanySK/gradle-kotlin-qa/commit/6fc7ff0d6338873695276f2592fb3b891e2c6c9c))

## [0.27.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.27.0...0.27.1) (2022-11-11)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.14 ([4e82318](https://github.com/DanySK/gradle-kotlin-qa/commit/4e823183fb89516a94ce3259d4211cbc93213882))


### Dependency updates

* **core-deps:** update kotlin monorepo to v1.7.21 ([9c0f717](https://github.com/DanySK/gradle-kotlin-qa/commit/9c0f717d144a499c415b81752d7e7c0be006d63d))
* **deps:** update kotest to v5.5.4 ([e675c4b](https://github.com/DanySK/gradle-kotlin-qa/commit/e675c4bc2979d43c00218ea3c2dcb3ba8823813c))
* **deps:** update plugin kotlin-qa to v0.27.0 ([8e25ffa](https://github.com/DanySK/gradle-kotlin-qa/commit/8e25ffa967450093e30c99cf3390e15f307a97dc))

## [0.27.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.26.1...0.27.0) (2022-11-01)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.11 ([712a9a1](https://github.com/DanySK/gradle-kotlin-qa/commit/712a9a10d5960f7c62f9f7a0c231e2c2abc09d21))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.12 ([45b3574](https://github.com/DanySK/gradle-kotlin-qa/commit/45b357423dc1d9af00ac27206ea448e394fc9625))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.13 ([9472c72](https://github.com/DanySK/gradle-kotlin-qa/commit/9472c72c403187629635b585a57521fc878b7a46))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.51.0 ([55c6da6](https://github.com/DanySK/gradle-kotlin-qa/commit/55c6da62bc0a421800202940f9d4db443ec10a34))
* **deps:** update dependency org.mockito:mockito-core to v4.8.1 ([ee0640c](https://github.com/DanySK/gradle-kotlin-qa/commit/ee0640c4fde3931b83d8cd4f841bff69221f33ac))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.12 ([ddebe09](https://github.com/DanySK/gradle-kotlin-qa/commit/ddebe091c1877c352926b18ce3c5eb769ac02990))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.13 ([e4949f4](https://github.com/DanySK/gradle-kotlin-qa/commit/e4949f4b4b0b07f9e76a7dec5dceea52d0f787cc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.14 ([3647cb9](https://github.com/DanySK/gradle-kotlin-qa/commit/3647cb986228a60faa1dc3a263c241e1ecfa1138))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.15 ([745029e](https://github.com/DanySK/gradle-kotlin-qa/commit/745029eb186be473a6c46ff2b9ce57835cad1e94))
* **deps:** update kotest to v5.5.2 ([431ab12](https://github.com/DanySK/gradle-kotlin-qa/commit/431ab1235d85dd7451c4b93c74255ce5fc119d9f))
* **deps:** update kotest to v5.5.3 ([f270a75](https://github.com/DanySK/gradle-kotlin-qa/commit/f270a7531732a89f6dc64fb2de2e372d0a670b4c))
* **deps:** update node.js to 16.18 ([dec7a50](https://github.com/DanySK/gradle-kotlin-qa/commit/dec7a509257d79c4fa840c79398aadd5d85116ea))
* **deps:** update node.js to 18.12 ([ae8440c](https://github.com/DanySK/gradle-kotlin-qa/commit/ae8440c5edd95348191a5b5eeeff9ed79fa97866))
* **deps:** update node.js to v18 ([336bfc5](https://github.com/DanySK/gradle-kotlin-qa/commit/336bfc58c05b9eb278972834e3e89c7eeeb66ebc))
* **deps:** update plugin kotlin-qa to v0.26.1 ([126a257](https://github.com/DanySK/gradle-kotlin-qa/commit/126a257be8a9a97d0326b8f02ff094ce46bfe6df))
* **deps:** update plugin multijvmtesting to v0.4.12 ([45c1938](https://github.com/DanySK/gradle-kotlin-qa/commit/45c1938614a44666c8791e4a81aec7e28b7902ab))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.22 ([9cdd396](https://github.com/DanySK/gradle-kotlin-qa/commit/9cdd396787807de95ec2480a775701069d2fb1cd))
* **deps:** update plugin publishoncentral to v2.0.7 ([d2c1f32](https://github.com/DanySK/gradle-kotlin-qa/commit/d2c1f323302e8801366067ac580c033d8344b250))
* **deps:** update plugin publishoncentral to v2.0.8 ([1fcf543](https://github.com/DanySK/gradle-kotlin-qa/commit/1fcf5437ed76146bb26551eaf7a1cb819fecbd93))

## [0.26.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.26.0...0.26.1) (2022-10-13)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.1.0 ([c4f6ec7](https://github.com/DanySK/gradle-kotlin-qa/commit/c4f6ec7f1c7ae61845e8ed010a715f07953cad45))
* **deps:** update danysk/action-checkout action to v0.2.3 ([c885e19](https://github.com/DanySK/gradle-kotlin-qa/commit/c885e1985042241a9bcca4ec8baee40e26cf34aa))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.10 ([3a642f8](https://github.com/DanySK/gradle-kotlin-qa/commit/3a642f8a8d034961c46e5057341f5b0f3012d530))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.7.20 ([07d4fdb](https://github.com/DanySK/gradle-kotlin-qa/commit/07d4fdb8a822ae26b4ab7a57ec5845636e828dec))
* **deps:** update kotest to v5.5.0 ([5a99db3](https://github.com/DanySK/gradle-kotlin-qa/commit/5a99db37041fad67a51b2949cc3d433a8b004d49))
* **deps:** update kotest to v5.5.1 ([3c11ff6](https://github.com/DanySK/gradle-kotlin-qa/commit/3c11ff6588d7b5e0edda163b5933ac1d062a73b6))
* **deps:** update plugin kotlin-qa to v0.25.1 ([573c4fd](https://github.com/DanySK/gradle-kotlin-qa/commit/573c4fd51efb084eeecac69fc81bf429d1f19340))
* **deps:** update plugin kotlin-qa to v0.26.0 ([3d19001](https://github.com/DanySK/gradle-kotlin-qa/commit/3d190012b75b446a468dfdc8d37c5a26dfe3dd83))
* **deps:** update plugin multijvmtesting to v0.4.11 ([032c32b](https://github.com/DanySK/gradle-kotlin-qa/commit/032c32b936c7691f7b01e992d6cd4888437beb7e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.21 ([c42da06](https://github.com/DanySK/gradle-kotlin-qa/commit/c42da06f906ed187b22237f67b31ae9aaa8bd9dc))

## [0.26.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.25.1...0.26.0) (2022-10-03)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.50.0 ([b97db6e](https://github.com/DanySK/gradle-kotlin-qa/commit/b97db6e8b66179286b8aeabda55220baf97cd74b))

## [0.25.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.25.0...0.25.1) (2022-10-01)


### Build and continuous integration

* **deps:** update danysk/action-checkout action to v0.2.2 ([892e025](https://github.com/DanySK/gradle-kotlin-qa/commit/892e025ca4f72d20e58f45f6a223a9b967df24b0))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.6 ([dd01864](https://github.com/DanySK/gradle-kotlin-qa/commit/dd01864606cf1a0d825824d8887a49adcf6815bb))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.7 ([4f7580b](https://github.com/DanySK/gradle-kotlin-qa/commit/4f7580bb951dbd17500f7f018811429b3234ac49))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.8 ([f6e306c](https://github.com/DanySK/gradle-kotlin-qa/commit/f6e306c1ee250133eaf644cf027beddcd76eb3cc))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.9 ([beaa79a](https://github.com/DanySK/gradle-kotlin-qa/commit/beaa79ac8acf70164bd71e1519f26af7cf24a0c2))


### Dependency updates

* **core-deps:** update kotlin to v1.7.20 ([a06d22a](https://github.com/DanySK/gradle-kotlin-qa/commit/a06d22ace81268f48ce61c33a8237a3895dbc2a8))
* **deps:** update dependency org.mockito:mockito-core to v4.8.0 ([d6c04a3](https://github.com/DanySK/gradle-kotlin-qa/commit/d6c04a347fe2843f7dd4dd5c11bd905a839f9d30))
* **deps:** update plugin kotlin-qa to v0.25.0 ([0dc2925](https://github.com/DanySK/gradle-kotlin-qa/commit/0dc2925d695e68ddd5b6c32bcfafc9138b1d9ce5))
* **deps:** update plugin multijvmtesting to v0.4.10 ([27bc16f](https://github.com/DanySK/gradle-kotlin-qa/commit/27bc16f193ea2e2b5fa85c17097c4c6fe3258a4e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.20 ([0e889bc](https://github.com/DanySK/gradle-kotlin-qa/commit/0e889bc6f4065d570e6fd8c63b9ba5b8355f42c4))

## [0.25.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.24.0...0.25.0) (2022-09-01)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.49.0 ([dd46ab0](https://github.com/DanySK/gradle-kotlin-qa/commit/dd46ab05057ceffc0e3bee5534754b1516ff637e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.11 ([134f140](https://github.com/DanySK/gradle-kotlin-qa/commit/134f140625117df20f4ec9d04ea671507c96f3ac))
* **deps:** update plugin kotlin-qa to v0.24.0 ([2b775b5](https://github.com/DanySK/gradle-kotlin-qa/commit/2b775b5d748b7caf18c13b242ff65678d6cdbecf))

## [0.24.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.23.2...0.24.0) (2022-08-25)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.4 ([f0d3020](https://github.com/DanySK/gradle-kotlin-qa/commit/f0d3020885012208cef79a883eb12f2eba4747a9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.5 ([d18f8b1](https://github.com/DanySK/gradle-kotlin-qa/commit/d18f8b186741c36308e6d1df4f3b8ff74f551714))


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11 ([cab725f](https://github.com/DanySK/gradle-kotlin-qa/commit/cab725fe7c17d5d8a64735a7310972f834a9c355))
* **deps:** update dependency org.mockito:mockito-core to v4.7.0 ([9136dab](https://github.com/DanySK/gradle-kotlin-qa/commit/9136dabbc61fce82b945c9526d775201a437570e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.10 ([917ec2d](https://github.com/DanySK/gradle-kotlin-qa/commit/917ec2ded25d11fdb9f815c16162f1287530f6dc))
* **deps:** update kotest to v5.4.2 ([817884e](https://github.com/DanySK/gradle-kotlin-qa/commit/817884ef6f857155a81e51421f44eaa46d2040bf))
* **deps:** update node.js to 16.17 ([8e38b5d](https://github.com/DanySK/gradle-kotlin-qa/commit/8e38b5d86b740f48ef735bc049f56331c356bcca))
* **deps:** update plugin com.gradle.enterprise to v3.11 ([0317caa](https://github.com/DanySK/gradle-kotlin-qa/commit/0317caaf12911f80fa400bae47f0c15276fd67da))
* **deps:** update plugin com.gradle.enterprise to v3.11.1 ([29845f9](https://github.com/DanySK/gradle-kotlin-qa/commit/29845f979755098854500bb5599e608b2ebd5131))
* **deps:** update plugin kotlin-qa to v0.23.2 ([fdcdc93](https://github.com/DanySK/gradle-kotlin-qa/commit/fdcdc93e276215ebf65a4376620a6e54c8b9db88))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.19 ([c4b9954](https://github.com/DanySK/gradle-kotlin-qa/commit/c4b9954c68f9af204fd91640f94f22ac61f0aa8c))
* **deps:** update plugin publishoncentral to v2.0.6 ([86e3f28](https://github.com/DanySK/gradle-kotlin-qa/commit/86e3f28aaa143e7058f38b96424700bba5be210b))

## [0.23.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.23.1...0.23.2) (2022-08-06)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.3 ([b0d7158](https://github.com/DanySK/gradle-kotlin-qa/commit/b0d7158833c3eb0a597dfbf8164b02d89c4bcead))


### Dependency updates

* **core-deps:** update dependency gradle to v7.5.1 ([5cb4ca2](https://github.com/DanySK/gradle-kotlin-qa/commit/5cb4ca2fddd9605d3c4bc6e9a628cd1338282d9e))
* **deps:** update plugin kotlin-qa to v0.23.1 ([e8a570b](https://github.com/DanySK/gradle-kotlin-qa/commit/e8a570b894c7e3569102c8701b508eb63073082b))

## [0.23.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.23.0...0.23.1) (2022-07-31)


### Bug Fixes

* **cpd:** raise the default token toleration for Kotlin to 70, as 40 generates many false warnings ([5a50d58](https://github.com/DanySK/gradle-kotlin-qa/commit/5a50d58181fda064efd1e72ce93814d1f59e34e0))


### Dependency updates

* **deps:** update plugin kotlin-qa to v0.23.0 ([edfe88f](https://github.com/DanySK/gradle-kotlin-qa/commit/edfe88fd47e53ea5171ff5fc1c178126ee0cc161))

## [0.23.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.22.2...0.23.0) (2022-07-30)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.48.0 ([07855c0](https://github.com/DanySK/gradle-kotlin-qa/commit/07855c01d5e7d06e85357c802a9c2e0a99e7c7e2))
* **deps:** update plugin kotlin-qa to v0.22.2 ([213ba9f](https://github.com/DanySK/gradle-kotlin-qa/commit/213ba9f361e4172e25a772b887e34c8d798dc3ef))

## [0.22.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.22.1...0.22.2) (2022-07-29)


### Bug Fixes

* **cpd:** raise the default cpd tokens to 40 ([1908940](https://github.com/DanySK/gradle-kotlin-qa/commit/190894048c46bc5e7ba277278c360c5ca08de250))


### Dependency updates

* **deps:** update plugin kotlin-qa to v0.22.1 ([940d353](https://github.com/DanySK/gradle-kotlin-qa/commit/940d353af09235f63f6e286e6a9ed71b0742a1e9))
* **deps:** update plugin multijvmtesting to v0.4.9 ([a4b5bcd](https://github.com/DanySK/gradle-kotlin-qa/commit/a4b5bcdd322ecac74cc06cbbd08de7fef277f3f7))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.18 ([759b564](https://github.com/DanySK/gradle-kotlin-qa/commit/759b56445d0e94b9466e3639ceb079732ea57f6b))


### Build and continuous integration

* configure mergify ([06d626a](https://github.com/DanySK/gradle-kotlin-qa/commit/06d626ac93f15f2c092629aec3f2bc703ec374fb))

## [0.22.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.22.0...0.22.1) (2022-07-28)


### Bug Fixes

* **deps:** update kotest to v5.4.1 ([f5408a1](https://github.com/DanySK/gradle-kotlin-qa/commit/f5408a1f0ccb6c6870a6980eb8e86b4127f6e0f3))


### Dependency updates

* **deps:** update kotest to v5.4.0 ([3ec4d9a](https://github.com/DanySK/gradle-kotlin-qa/commit/3ec4d9a2a22954561ed161f8b3f5d04ef9154f5c))
* **deps:** update plugin kotlin-qa to v0.22.0 ([9ab47f5](https://github.com/DanySK/gradle-kotlin-qa/commit/9ab47f58793b5acb5332ac727ef3f7159e27dfda))

## [0.22.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.21.0...0.22.0) (2022-07-22)


### Features

* raise [`DestructuringDeclarationWithTooManyEntries`](https://detekt.dev/docs/rules/style/#destructuringdeclarationwithtoomanyentries)'s `maxDestructuringEntries` to 10 ([23caac6](https://github.com/DanySK/gradle-kotlin-qa/commit/23caac609212d5a25dcc91d2c7fc43b2de5deb83))


### Tests

* de-duplicate test names ([8064d70](https://github.com/DanySK/gradle-kotlin-qa/commit/8064d70b34a535424000724a0c9af64d6159420a))


### Build and continuous integration

* use the default plugin classpath ([8ec5794](https://github.com/DanySK/gradle-kotlin-qa/commit/8ec5794976afe6cee08bc660e9e37eb4342c73f0))


### Dependency updates

* **deps:** update plugin kotlin-qa to v0.21.0 ([b792838](https://github.com/DanySK/gradle-kotlin-qa/commit/b792838d91977e2e39da9ee9fb740bf1506ba728))


### Style improvements

* use check() instead of throwing an IllegalStateException ([de72615](https://github.com/DanySK/gradle-kotlin-qa/commit/de72615a41db43c5b673bd807a1c835975c5c7e2))

## [0.21.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.20.4...0.21.0) (2022-07-18)


### Dependency updates

* **api-deps:** update detekt to v1.21.0 ([30c9f91](https://github.com/DanySK/gradle-kotlin-qa/commit/30c9f916049eb3f7ce953cb9a9d5de884b481557))
* **deps:** update plugin kotlin-qa to v0.20.4 ([fe8e191](https://github.com/DanySK/gradle-kotlin-qa/commit/fe8e191307357055cc008df44fa4514ddb63e7a0))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.16 ([5776a7f](https://github.com/DanySK/gradle-kotlin-qa/commit/5776a7fb5791e0ad96c3b1e5d1599106a4c93672))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.17 ([edbe318](https://github.com/DanySK/gradle-kotlin-qa/commit/edbe318529d1b7192e2cf062d61647cc4895a49f))
* **deps:** update plugin publishoncentral to v2.0.5 ([d1669c9](https://github.com/DanySK/gradle-kotlin-qa/commit/d1669c95ed965f1d5c6f20dcbd69c9c5dbd2c81e))


### General maintenance

* **test:** remove a wrong package declaration ([82d2ef2](https://github.com/DanySK/gradle-kotlin-qa/commit/82d2ef2c327fc6eab0ba43c64d3d13d3d9df4fb2))

## [0.20.4](https://github.com/DanySK/gradle-kotlin-qa/compare/0.20.3...0.20.4) (2022-07-14)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.2 ([510cfe5](https://github.com/DanySK/gradle-kotlin-qa/commit/510cfe5f9c38122cde4bd16203fa0436f1ccbdb7))


### Dependency updates

* **core-deps:** update dependency gradle to v7.5 ([0dbf041](https://github.com/DanySK/gradle-kotlin-qa/commit/0dbf0412bc3080875e6c1bf5c5a025dbbf524e0b))
* **deps:** update kotest to v5.3.2 ([6f7f08a](https://github.com/DanySK/gradle-kotlin-qa/commit/6f7f08ab10299c0d1d61456d8739c3ad51f8ef97))
* **deps:** update plugin kotlin-qa to v0.20.3 ([d793cdb](https://github.com/DanySK/gradle-kotlin-qa/commit/d793cdb9142c5027387cbe5ea62a8e4a48df717b))
* **deps:** update plugin multijvmtesting to v0.4.8 ([480abe6](https://github.com/DanySK/gradle-kotlin-qa/commit/480abe66d12cf215cb42e189b950d33076faca87))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.15 ([1684a45](https://github.com/DanySK/gradle-kotlin-qa/commit/1684a45e8cd07d62f266163ef84309c83b98ed90))
* **deps:** update plugin publishoncentral to v2.0.4 ([68985c0](https://github.com/DanySK/gradle-kotlin-qa/commit/68985c025395a1cc5dadbe1912ae4a14bb8a2c53))

## [0.20.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.20.2...0.20.3) (2022-07-12)


### General maintenance

* **build:** fix the plugin marker task ([685cb8a](https://github.com/DanySK/gradle-kotlin-qa/commit/685cb8aa4c77bf68925a04c36d9b8c879fcd3197))
* **build:** remove enableFeaturePreview("VERSION_CATALOGS") ([a005d20](https://github.com/DanySK/gradle-kotlin-qa/commit/a005d2017fc325e46bfb6e4705a10f7509589bee))


### Build and continuous integration

* create a dispatcher task ([bc9acb2](https://github.com/DanySK/gradle-kotlin-qa/commit/bc9acb213716f1105563cd28d5edfdd024f321c2))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.1 ([4aeb241](https://github.com/DanySK/gradle-kotlin-qa/commit/4aeb241e84450f2b333804419dbd6d568c198b13))
* enable the git hooks plugin ([47e5c73](https://github.com/DanySK/gradle-kotlin-qa/commit/47e5c73a81d0dc505b4d6deda5313d9d01cfe081))
* **release:** update for the new commands of publish-of-central v2 ([2f0322d](https://github.com/DanySK/gradle-kotlin-qa/commit/2f0322d959f2eea02ea8c1bd35ce3c512f9c1c28))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.7.10 ([071528b](https://github.com/DanySK/gradle-kotlin-qa/commit/071528b57895768a0cd5a794b711215415ee0cee))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.9 ([363430b](https://github.com/DanySK/gradle-kotlin-qa/commit/363430bfd0d4c25e0933a1a28c0d81c799d12341))
* **deps:** update node.js to 16.16 ([3b48c77](https://github.com/DanySK/gradle-kotlin-qa/commit/3b48c773892c6275e34669d18ac1d775ffc1bba4))
* **deps:** update plugin com.gradle.enterprise to v3.10.3 ([061e1bd](https://github.com/DanySK/gradle-kotlin-qa/commit/061e1bd48acccf68f94b501d05ba158e6e59b516))
* **deps:** update plugin multijvmtesting to v0.4.6 ([217799c](https://github.com/DanySK/gradle-kotlin-qa/commit/217799ca0f86c44a4d8e4b6864ce3213337caaae))
* **deps:** update plugin multijvmtesting to v0.4.7 ([40e8d1c](https://github.com/DanySK/gradle-kotlin-qa/commit/40e8d1c6ec8307f8d9e4f2c231759e0025f74de7))

## [0.20.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.20.1...0.20.2) (2022-07-07)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.0 ([ce47eac](https://github.com/DanySK/gradle-kotlin-qa/commit/ce47eac11cc377b93831bb91d35cfbce3fe24794))


### Dependency updates

* **core-deps:** update kotlin to v1.7.10 ([075ee3f](https://github.com/DanySK/gradle-kotlin-qa/commit/075ee3f882dbdf67e3d823baba997241d36476a2))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.148 ([ac54200](https://github.com/DanySK/gradle-kotlin-qa/commit/ac54200060d500c22be13b7693b1b2e0487d4c20))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.149 ([f87ca14](https://github.com/DanySK/gradle-kotlin-qa/commit/f87ca14ed0ec1b0b619de9715f03af30a1f93402))
* **deps:** update plugin multijvmtesting to v0.4.4 ([6592dc4](https://github.com/DanySK/gradle-kotlin-qa/commit/6592dc46c680a36318638ec4662ad495630a5041))
* **deps:** update plugin multijvmtesting to v0.4.5 ([d30aa59](https://github.com/DanySK/gradle-kotlin-qa/commit/d30aa595441e442907b78725cbe35af1686e3e8f))
* **deps:** update plugin publishoncentral to v2.0.2 ([4245364](https://github.com/DanySK/gradle-kotlin-qa/commit/4245364cc109910b61210f648bf038657a6d740a))
* **deps:** update plugin publishoncentral to v2.0.3 ([3a872e5](https://github.com/DanySK/gradle-kotlin-qa/commit/3a872e527486d7c7198a2245ebb0e25b31214dd3))

## [0.20.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.20.0...0.20.1) (2022-06-30)


### Bug Fixes

* **detekt:** allow numbers 5 and 1000 ([716eba1](https://github.com/DanySK/gradle-kotlin-qa/commit/716eba1c9e5421911ecea95457b37010af25de1c))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.0.3 ([f4c4973](https://github.com/DanySK/gradle-kotlin-qa/commit/f4c49730b460f7ce7ae987beb818f180d7d714b4))


### Dependency updates

* **deps:** update plugin gradlepluginpublish to v1 ([c951bc6](https://github.com/DanySK/gradle-kotlin-qa/commit/c951bc60299018b8c26e41f8a8242d684e506500))
* **deps:** update plugin publishoncentral to v2 ([bbc7e44](https://github.com/DanySK/gradle-kotlin-qa/commit/bbc7e44d3d1597ba6e4de76b88cc25d9dff54665))

## [0.20.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.19.2...0.20.0) (2022-06-25)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.47.0 ([1eb15aa](https://github.com/DanySK/gradle-kotlin-qa/commit/1eb15aa3231b6b1841d691814a2740a0cbd85a49))

## [0.19.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.19.1...0.19.2) (2022-06-20)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.7.0 ([1bc78e5](https://github.com/DanySK/gradle-kotlin-qa/commit/1bc78e5cc1b5fe7372906a31bd61b7c2e9457a59))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.8 ([c8112b6](https://github.com/DanySK/gradle-kotlin-qa/commit/c8112b6111b1285596cb87068bf999eb0f42b0dc))
* **deps:** update plugin com.gradle.enterprise to v3.10.2 ([fbc88b7](https://github.com/DanySK/gradle-kotlin-qa/commit/fbc88b7f7034156bffb51d295ec8e660e1c3f002))
* **deps:** update plugin kotlin-qa to v0.19.1 ([bdf47e0](https://github.com/DanySK/gradle-kotlin-qa/commit/bdf47e00efc957001e1427e11f7c31e771d31d92))
* **deps:** update plugin multijvmtesting to v0.4.2 ([69bc87f](https://github.com/DanySK/gradle-kotlin-qa/commit/69bc87f2b682f997ae91d025937d90bbe081e7f3))
* **deps:** update plugin multijvmtesting to v0.4.3 ([78652ae](https://github.com/DanySK/gradle-kotlin-qa/commit/78652aed9e7bc2149a81d1a26bf1d2f4021af140))
* **deps:** update plugin publishoncentral to v0.8.2 ([ce1255d](https://github.com/DanySK/gradle-kotlin-qa/commit/ce1255d9211242e9e66bf04bb9ef3b3a4f351bb5))
* **deps:** update plugin publishoncentral to v0.8.3 ([4a29239](https://github.com/DanySK/gradle-kotlin-qa/commit/4a2923944ecf50e2aad9e6680b13f2ada1e6cf85))
* **deps:** update plugin publishoncentral to v1 ([f37b8fc](https://github.com/DanySK/gradle-kotlin-qa/commit/f37b8fc31cc26975a94072540520d374918c9a90))

## [0.19.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.19.0...0.19.1) (2022-06-09)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.16 ([1a3c194](https://github.com/DanySK/gradle-kotlin-qa/commit/1a3c194b5b8eb1ed47b553f2d8ed9790a7dd6106))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2 ([4228b78](https://github.com/DanySK/gradle-kotlin-qa/commit/4228b782432ccfe3b8408f815c4e220dbffa9284))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.0.1 ([1ddab46](https://github.com/DanySK/gradle-kotlin-qa/commit/1ddab46eeaa6c9e13eec1a3d777ba201b0f5443c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.0.2 ([f24f9f4](https://github.com/DanySK/gradle-kotlin-qa/commit/f24f9f40fae36e370d3a190bd975b01a9de1787f))


### Dependency updates

* **core-deps:** update kotlin to v1.7.0 ([d8acd35](https://github.com/DanySK/gradle-kotlin-qa/commit/d8acd35a2a541bcef3f6c09a33f6c3840d767abc))
* **deps:** update dependency org.mockito:mockito-core to v4.6.1 ([d3498ac](https://github.com/DanySK/gradle-kotlin-qa/commit/d3498ac0f4bb5af168c94d00f4b9ed266a67df50))
* **deps:** update plugin kotlin-qa to v0.19.0 ([462ccb6](https://github.com/DanySK/gradle-kotlin-qa/commit/462ccb660a5a8b4c011a96771a217de7bad9e1bc))
* **deps:** update plugin multijvmtesting to v0.4.1 ([065baf2](https://github.com/DanySK/gradle-kotlin-qa/commit/065baf22380287b278eed30e89be1a410538e480))
* **deps:** update plugin publishoncentral to v0.8.0 ([ed67624](https://github.com/DanySK/gradle-kotlin-qa/commit/ed676248c8382dd6b6e5c56e844e86c488f37ab3))

## [0.19.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.18.0...0.19.0) (2022-05-28)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.15 ([8c5f547](https://github.com/DanySK/gradle-kotlin-qa/commit/8c5f5471eb7e4c718ebbe43e3b0445a497e88539))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.46.0 ([7ff1139](https://github.com/DanySK/gradle-kotlin-qa/commit/7ff1139ef791356ff7296dcefef4319431f27de4))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.147 ([ea0bf86](https://github.com/DanySK/gradle-kotlin-qa/commit/ea0bf867f077f8dc764a4e6855215dfcc7c2a3d9))
* **deps:** update dependency org.mockito:mockito-core to v4.6.0 ([14626b0](https://github.com/DanySK/gradle-kotlin-qa/commit/14626b044f7c836cdf9df22689982f2a164a2957))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.7 ([2543b79](https://github.com/DanySK/gradle-kotlin-qa/commit/2543b79f9f2461bf137a3f21057ff205ace75794))
* **deps:** update plugin com.gradle.enterprise to v3.10.1 ([bd737be](https://github.com/DanySK/gradle-kotlin-qa/commit/bd737be322622cf8d158185002a0cb38314eb4c7))
* **deps:** update plugin kotlin-qa to v0.18.0 ([cbba4c1](https://github.com/DanySK/gradle-kotlin-qa/commit/cbba4c17e2aa86f9dea4cf146cf454ffb03db032))
* **deps:** update plugin multijvmtesting to v0.4.0 ([de86b1a](https://github.com/DanySK/gradle-kotlin-qa/commit/de86b1ac30b75144d263d6d5f10280e5d11ddf77))

## [0.18.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.17.0...0.18.0) (2022-05-03)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v10.3.0 ([e20d781](https://github.com/DanySK/gradle-kotlin-qa/commit/e20d7814701b2845cbd0d3e9a962a7a5a06886fe))
* **deps:** update io.kotest to v5.3.0 ([a2b1adb](https://github.com/DanySK/gradle-kotlin-qa/commit/a2b1adba5943fc7bee45b1a704675de7e9afb1ad))
* **deps:** update plugin kotlin-qa to v0.17.0 ([c3dc3f2](https://github.com/DanySK/gradle-kotlin-qa/commit/c3dc3f27044bb4fca3c5f0eb216e61e1d715dde7))

## [0.17.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.16.2...0.17.0) (2022-04-30)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.14 ([6c42dcd](https://github.com/DanySK/gradle-kotlin-qa/commit/6c42dcd390c0ad6b40b5bcdadb4b7f93e7a1257a))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.45.0 ([311bc76](https://github.com/DanySK/gradle-kotlin-qa/commit/311bc76bf5f805962fab2d2fe766718b35558f70))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.6 ([a5b81a4](https://github.com/DanySK/gradle-kotlin-qa/commit/a5b81a42365a5fd614bd8ae6f16a7144a69e3724))
* **deps:** update node.js to 16.15 ([10939b3](https://github.com/DanySK/gradle-kotlin-qa/commit/10939b3da7a5fa543c83673c7633c1dff03150b6))
* **deps:** update plugin kotlin-qa to v0.16.2 ([c4ffa5f](https://github.com/DanySK/gradle-kotlin-qa/commit/c4ffa5f587f6bcd0ddd334253dde7818c1dd6b50))
* **deps:** update plugin multijvmtesting to v0.3.7 ([6615ad0](https://github.com/DanySK/gradle-kotlin-qa/commit/6615ad08a3775686a0c1541b98e428fb1f5fa22f))
* **deps:** update plugin publishoncentral to v0.7.19 ([dedf50a](https://github.com/DanySK/gradle-kotlin-qa/commit/dedf50a6eb80c54b497cb2460494d4db8acd2101))

### [0.16.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.16.1...0.16.2) (2022-04-25)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.0.2 ([8ead079](https://github.com/DanySK/gradle-kotlin-qa/commit/8ead0799f665d0bff40200458620f7a7b829ccae))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.13 ([7387e04](https://github.com/DanySK/gradle-kotlin-qa/commit/7387e04aa926bf00325151a1c4744c3daeaec707))


### Dependency updates

* **core-deps:** update plugin dokka to v1.6.21 ([de2b808](https://github.com/DanySK/gradle-kotlin-qa/commit/de2b80863d0c34bd2875eb4b415bddadf42ebf2b))
* **deps:** update dependency org.mockito:mockito-core to v4.5.0 ([b00597c](https://github.com/DanySK/gradle-kotlin-qa/commit/b00597c5724f67025c3c1caa6292027aceb24230))
* **deps:** update dependency org.mockito:mockito-core to v4.5.1 ([bb7f0d1](https://github.com/DanySK/gradle-kotlin-qa/commit/bb7f0d12feb4a6ac59858e72c9845a8d91f7b437))
* **deps:** update plugin kotlin-qa to v0.16.1 ([9fc5421](https://github.com/DanySK/gradle-kotlin-qa/commit/9fc5421d7fc29b4a07098c4229ee49c06fc345aa))
* **deps:** update plugin publishoncentral to v0.7.18 ([e5236b6](https://github.com/DanySK/gradle-kotlin-qa/commit/e5236b617e52b942aa4df8fb0289836abfd5b1b3))

### [0.16.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.16.0...0.16.1) (2022-04-19)


### Style improvements

* add trailing commas ([4857503](https://github.com/DanySK/gradle-kotlin-qa/commit/4857503240fa48ddbaec47e70eb40331f6f53e02))
* suppress ConstructorParameterNaming over data class meant to interoperate with YAML ([3f1d639](https://github.com/DanySK/gradle-kotlin-qa/commit/3f1d63940c0c71aecbe44b1967b98106f107a271))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.0.1 ([d6533c3](https://github.com/DanySK/gradle-kotlin-qa/commit/d6533c34b405f0db433ff9fd9ed141a273fc2f7b))


### Dependency updates

* **core-deps:** update plugin kotlin-jvm to v1.6.21 ([414d412](https://github.com/DanySK/gradle-kotlin-qa/commit/414d412a41153139808f73b39b87847feda0da5b))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.144 ([0f4f520](https://github.com/DanySK/gradle-kotlin-qa/commit/0f4f520d7174954dd765512a3f1a27ef9aa56ff9))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.145 ([e79772d](https://github.com/DanySK/gradle-kotlin-qa/commit/e79772d3fbd73f5d6bd1aef01bce566739cf8c60))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.146 ([18a0e77](https://github.com/DanySK/gradle-kotlin-qa/commit/18a0e770fa7eb34e015c747cd8df8a456a998eca))
* **deps:** update plugin com.gradle.enterprise to v3.10 ([92435a6](https://github.com/DanySK/gradle-kotlin-qa/commit/92435a63eccf5b82748c2bc405a986ed71e2f4a5))
* **deps:** update plugin kotlin-qa to v0.16.0 ([6aa329a](https://github.com/DanySK/gradle-kotlin-qa/commit/6aa329a690799fc6d4cc75de846c5e01847e7fc3))

## [0.16.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.15.1...0.16.0) (2022-04-15)


### Dependency updates

* **api-deps:** update io.gitlab.arturbosch.detekt to v1.20.0 ([8a59448](https://github.com/DanySK/gradle-kotlin-qa/commit/8a594485bdccefc995f4921332d4a9c0f358668f))
* **deps:** update plugin kotlin-qa to v0.15.1 ([3b182cb](https://github.com/DanySK/gradle-kotlin-qa/commit/3b182cbc0340de70cde186511ca0ddc94f8a22c7))
* **deps:** update plugin multijvmtesting to v0.3.6 ([a6199c5](https://github.com/DanySK/gradle-kotlin-qa/commit/a6199c52d7d2b96e381561b5ef597840c3ff1ea2))
* **deps:** update plugin publishoncentral to v0.7.17 ([bcf5296](https://github.com/DanySK/gradle-kotlin-qa/commit/bcf5296978bc60ca626c940fed6d614f0bec56ae))

### [0.15.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.15.0...0.15.1) (2022-04-14)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.11 ([f5fd9ad](https://github.com/DanySK/gradle-kotlin-qa/commit/f5fd9ad8eb5db8e394961135fac7b1c419938ea6))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.12 ([f0489a5](https://github.com/DanySK/gradle-kotlin-qa/commit/f0489a5b23e53693c07b5363a74466fc4014a24d))


### Dependency updates

* **core-deps:** update plugin dokka to v1.6.20 ([65127ff](https://github.com/DanySK/gradle-kotlin-qa/commit/65127ffb60ebde8396c0063ab6c1f3f267831bd2))
* **deps:** update io.kotest to v5.2.3 ([dd70ba5](https://github.com/DanySK/gradle-kotlin-qa/commit/dd70ba5b6c54ec6880a16a567b7556302848f558))
* **deps:** update plugin kotlin-qa to v0.15.0 ([6e16d27](https://github.com/DanySK/gradle-kotlin-qa/commit/6e16d275b2fedb772c91ff51bbc13f32e6322103))

## [0.15.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.14.2...0.15.0) (2022-04-06)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.10 ([3c18b2b](https://github.com/DanySK/gradle-kotlin-qa/commit/3c18b2bd570e51bd4d4b2a3f176de97116a70007))


### Dependency updates

* **api-deps:** update dependency com.pinterest:ktlint to v0.45.2 ([5632d2b](https://github.com/DanySK/gradle-kotlin-qa/commit/5632d2ba88890ad35b4b1e617d02f10d61570fb9))
* **deps:** update org.jacoco to v0.8.8 ([b8316c1](https://github.com/DanySK/gradle-kotlin-qa/commit/b8316c1ff973792b8f7852b691a4774ca65d08c2))
* **deps:** update plugin kotlin-qa to v0.14.2 ([8fc3b9a](https://github.com/DanySK/gradle-kotlin-qa/commit/8fc3b9a429caac7fe66cae7832a29c882180e2e1))
* **deps:** update plugin multijvmtesting to v0.3.5 ([5af5df8](https://github.com/DanySK/gradle-kotlin-qa/commit/5af5df8970c62a3f12ea9ac2c2e18ed4943c988b))

### [0.14.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.14.1...0.14.2) (2022-04-04)


### Dependency updates

* **core-deps:** update plugin kotlin-jvm to v1.6.20 ([690f22a](https://github.com/DanySK/gradle-kotlin-qa/commit/690f22a53a182e2d17cf85b9b5021da5de39f107))
* **deps:** update plugin kotlin-qa to v0.14.1 ([6f57e04](https://github.com/DanySK/gradle-kotlin-qa/commit/6f57e040266a360258d0da6fdd53e025abdae16f))
* **deps:** update plugin publishoncentral to v0.7.15 ([bff5833](https://github.com/DanySK/gradle-kotlin-qa/commit/bff5833e4a598d6b36cd2ffdb86f4bb3eb49f152))
* **deps:** update plugin publishoncentral to v0.7.16 ([a275043](https://github.com/DanySK/gradle-kotlin-qa/commit/a275043aec1fe41a4924b799d7a6819f198d6a3b))


### Build and continuous integration

* '-Xopt-in' is deprecated and will be removed in a future release, use -opt-in instead ([dbace96](https://github.com/DanySK/gradle-kotlin-qa/commit/dbace96ae488e8b8554f559b8e11e5a54611d3de))
* cancel in progress jobs when higher priority ones exist ([5f73bf7](https://github.com/DanySK/gradle-kotlin-qa/commit/5f73bf78564e0e2897ad82f97a1abb0bf8e0de24))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.8 ([b44e71c](https://github.com/DanySK/gradle-kotlin-qa/commit/b44e71caeb25d1f7ea49fb75d898d5a95a189f09))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.9 ([8d8aadb](https://github.com/DanySK/gradle-kotlin-qa/commit/8d8aadb118de92d0c74f7ab209e627339d1b85c2))
* run releases strictly sequentially ([ff2ca0c](https://github.com/DanySK/gradle-kotlin-qa/commit/ff2ca0c3a2ced5b3c6524ed942b0bb3ae7fd020e))
* separate the versions of Kotlin and Dokka ([bbe648c](https://github.com/DanySK/gradle-kotlin-qa/commit/bbe648c4c8b0a3e2cca7ebc74767c3f51e508973))
* use a dedicated deployment token for the release process ([e8ade79](https://github.com/DanySK/gradle-kotlin-qa/commit/e8ade79e61f2a002cf3e10b97c84300cce82682c))

### [0.14.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.14.0...0.14.1) (2022-03-31)


### Dependency updates

* **core-deps:** update dependency gradle to v7.4.2 ([22bbbe8](https://github.com/DanySK/gradle-kotlin-qa/commit/22bbbe8e06dd67c0f95f75943b81694c0dbfa6c2))
* **deps:** update plugin gradlepluginpublish to v0.21.0 ([789fa92](https://github.com/DanySK/gradle-kotlin-qa/commit/789fa929914510a52c58c006123188ed1ae92abc))
* **deps:** update plugin kotlin-qa to v0.14.0 ([fb6ffe0](https://github.com/DanySK/gradle-kotlin-qa/commit/fb6ffe0b0078ece9e658adfbde8f43c0baac334e))

## [0.14.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.13.0...0.14.0) (2022-03-28)


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.44.0 ([96ee6d0](https://github.com/DanySK/gradle-kotlin-qa/commit/96ee6d00bec394fa327f7173a552514bcfe99300))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.143 ([8efaaa3](https://github.com/DanySK/gradle-kotlin-qa/commit/8efaaa34070b60125b68d5a1132cf2c238ff97a3))
* **deps:** update io.kotest to v5.2.2 ([4c68895](https://github.com/DanySK/gradle-kotlin-qa/commit/4c68895d1818239445fccfccb648f871933079b0))
* **deps:** update plugin kotlin-qa to v0.13.0 ([1534288](https://github.com/DanySK/gradle-kotlin-qa/commit/15342882379a49d0753a43cac3a11c85e8e95ce0))

## [0.13.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.12.1...0.13.0) (2022-03-21)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.7 ([d99824d](https://github.com/DanySK/gradle-kotlin-qa/commit/d99824daa6a11a79d095eea9299e73182849597c))


### Dependency updates

* **api-deps:** update dependency com.pinterest:ktlint to v0.45.1 ([60008b6](https://github.com/DanySK/gradle-kotlin-qa/commit/60008b62f118fdf99b24a28b8dc50dbba1f66dcf))
* **deps:** update io.kotest ([1b5564c](https://github.com/DanySK/gradle-kotlin-qa/commit/1b5564c996fed44aca3addcdaa8999e0457b84db))
* **deps:** update plugin com.gradle.enterprise to v3.9 ([366dbd8](https://github.com/DanySK/gradle-kotlin-qa/commit/366dbd8841b7ef1a53b2d431cc7eb24838647037))
* **deps:** update plugin kotlin-qa to v0.12.1 ([e8e8004](https://github.com/DanySK/gradle-kotlin-qa/commit/e8e8004a8a611252e3fe333021d5ee637a74af58))
* **deps:** update plugin publishoncentral to v0.7.14 ([b41d69b](https://github.com/DanySK/gradle-kotlin-qa/commit/b41d69bc26e1ce4f6f3da9ca32fac55985a5a6f2))

### [0.12.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.12.0...0.12.1) (2022-03-10)


### Build and continuous integration

* **deps:** update actions/checkout action to v3 ([01bc587](https://github.com/DanySK/gradle-kotlin-qa/commit/01bc587db194645e45839fc2cbf4b98875575815))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.6 ([4c65766](https://github.com/DanySK/gradle-kotlin-qa/commit/4c65766196b6302f6a80821198f1a18ea4c7e88e))


### Dependency updates

* **core-deps:** update dependency gradle to v7.4.1 ([f1c3c5b](https://github.com/DanySK/gradle-kotlin-qa/commit/f1c3c5bf3235d9131378998cd4d12b2d5fba409a))
* **deps:** update dependency org.mockito:mockito-core to v4.4.0 ([ce467ca](https://github.com/DanySK/gradle-kotlin-qa/commit/ce467caf8f95b2f6ba541ff11eb951c1cee6c107))
* **deps:** update plugin kotlin-qa to v0.12.0 ([75f1565](https://github.com/DanySK/gradle-kotlin-qa/commit/75f1565458636bccec6eb1f7f854557141ca1640))

## [0.12.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.11.0...0.12.0) (2022-03-05)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.4 ([f24de79](https://github.com/DanySK/gradle-kotlin-qa/commit/f24de7947be786aa26a4e15bee91aca022ad1b18))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.43.0 ([be66e59](https://github.com/DanySK/gradle-kotlin-qa/commit/be66e59d0eada455928c20974a414e0f19f58550))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.141 ([b8fc1b5](https://github.com/DanySK/gradle-kotlin-qa/commit/b8fc1b5570fe59d697b708445f30be332c10902a))

## [0.11.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.10.1...0.11.0) (2022-03-05)


### Dependency updates

* **api-deps:** update dependency com.pinterest:ktlint to v0.44.0 ([d3bef83](https://github.com/DanySK/gradle-kotlin-qa/commit/d3bef831fc72816588354111af8dbd25da91bc67))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.139 ([be97209](https://github.com/DanySK/gradle-kotlin-qa/commit/be97209c9958dcc985fd76770ec3e27263e6b461))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.5 ([3b7fe9f](https://github.com/DanySK/gradle-kotlin-qa/commit/3b7fe9f8a3c23395ca47ebd94a9bb1cdff82c020))
* **deps:** update io.kotest to v5 ([7b26878](https://github.com/DanySK/gradle-kotlin-qa/commit/7b26878f871f5b441800e6b631aaa5fe7720115c))
* **deps:** update plugin kotlin-qa to v0.10.1 ([f21bf3a](https://github.com/DanySK/gradle-kotlin-qa/commit/f21bf3a05b8419d3e1e50f0d680bac7ece98b6ca))
* **deps:** update plugin publishoncentral to v0.7.13 ([5886b8c](https://github.com/DanySK/gradle-kotlin-qa/commit/5886b8c44a2e27dbaada154ff80c3a080209a635))


### Revert previous changes

* Revert "chore(deps): update io.kotest to v5" (#109) ([121f321](https://github.com/DanySK/gradle-kotlin-qa/commit/121f3216a4473f9cc89dfa64c3c36a17fe170135)), closes [#109](https://github.com/DanySK/gradle-kotlin-qa/issues/109)

### [0.10.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.10.0...0.10.1) (2022-02-08)


### Dependency updates

* **core-deps:** update dependency gradle to v7.4 ([8c70d77](https://github.com/DanySK/gradle-kotlin-qa/commit/8c70d772fe0f13c4e4469a037b63cff57edc0312))
* **deps:** update node.js to 16.14 ([037fdb9](https://github.com/DanySK/gradle-kotlin-qa/commit/037fdb9617a73589846682ccc13e0f8318520bd1))
* **deps:** update plugin kotlin-qa to v0.10.0 ([8eb079c](https://github.com/DanySK/gradle-kotlin-qa/commit/8eb079c03036b142dc7d84d2cb7d80928d55426a))

## [0.10.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.9.0...0.10.0) (2022-01-29)


### General maintenance

* **release:** correctly enable semantic commit conventions ([bdb182e](https://github.com/DanySK/gradle-kotlin-qa/commit/bdb182e4ce2be11466a8d288f5034e86c0d6acc9))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.1.3 ([58ea190](https://github.com/DanySK/gradle-kotlin-qa/commit/58ea190c341f675135f4ca7b669c718df5b12cf9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.0 ([65729a4](https://github.com/DanySK/gradle-kotlin-qa/commit/65729a4f3790b9c7ce6bdb5145f76a2db08c3c28))
* **release:** enable commit-analyzer ([e9c19b0](https://github.com/DanySK/gradle-kotlin-qa/commit/e9c19b0efffd3e9922886882a61ef7275ca5d1e9))
* **release:** inherit the configuration from the shared preset ([#80](https://github.com/DanySK/gradle-kotlin-qa/issues/80)) ([1845d98](https://github.com/DanySK/gradle-kotlin-qa/commit/1845d98ff5fd3be850308b0ec9a048ecf990e614))


### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.42.0 ([f963aa9](https://github.com/DanySK/gradle-kotlin-qa/commit/f963aa9f8b03dcc6f4472c2d2e7e7ff3c7c4b3c1))
* **deps:** update dependency org.mockito:mockito-core to v4.3.0 ([5393ddc](https://github.com/DanySK/gradle-kotlin-qa/commit/5393ddc6d251f1174b7892786d2f6c9579307377))
* **deps:** update dependency org.mockito:mockito-core to v4.3.1 ([fde9837](https://github.com/DanySK/gradle-kotlin-qa/commit/fde98378f3cf8e79bf674eea1bdbb886684f7b91))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.1 ([cf14bc1](https://github.com/DanySK/gradle-kotlin-qa/commit/cf14bc156eac50a89fb7df1ba12622f19025b6f6))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.3 ([b002833](https://github.com/DanySK/gradle-kotlin-qa/commit/b002833b9034a1515f888d2273fe9b81ef74fad7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.4 ([bd6ebb4](https://github.com/DanySK/gradle-kotlin-qa/commit/bd6ebb40644c0b12b33c810db7f258cce9c9fd34))
* **deps:** update plugin com.gradle.enterprise to v3.8.1 ([fe6a093](https://github.com/DanySK/gradle-kotlin-qa/commit/fe6a0939d57746b4c50a31902726481485fb2864))
* **deps:** update plugin gradlepluginpublish to v0.19.0 ([090005d](https://github.com/DanySK/gradle-kotlin-qa/commit/090005d924c7d99fe61f789e9537c3bcef278bbf))
* **deps:** update plugin gradlepluginpublish to v0.20.0 ([7809388](https://github.com/DanySK/gradle-kotlin-qa/commit/78093884f9fe46c48b6f707941c890b71bcfce96))
* **deps:** update plugin kotlin-qa to v0.9.0 ([17f229a](https://github.com/DanySK/gradle-kotlin-qa/commit/17f229aeeaa0b56d2e49e28bde6fc9f408f4303e))
* **deps:** update plugin multijvmtesting to v0.3.4 ([4378b9b](https://github.com/DanySK/gradle-kotlin-qa/commit/4378b9b5ea6caa5c9fa73c5554e71dcf307859ff))
* **deps:** update plugin publishoncentral to v0.7.10 ([79b2897](https://github.com/DanySK/gradle-kotlin-qa/commit/79b2897e0a8fc4683dc6917989fa88cf914d1bed))
* **deps:** update plugin publishoncentral to v0.7.11 ([510b5ea](https://github.com/DanySK/gradle-kotlin-qa/commit/510b5eada7b326f6ce1d1f1d70a063cc3c6ab3a1))
* **deps:** update plugin publishoncentral to v0.7.12 ([0375816](https://github.com/DanySK/gradle-kotlin-qa/commit/0375816a8ca24c0083aa67d5ed307b9ccfab1eb6))

# [0.9.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.8.3...0.9.0) (2021-12-28)


### Features

* **deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v10.2.1 ([ea2afce](https://github.com/DanySK/gradle-kotlin-qa/commit/ea2afcea598ed3052f5608e6c4ffce322ce81dc1))

## [0.8.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.8.2...0.8.3) (2021-12-27)


### Bug Fixes

* **deps:** update plugin dokka to v1.6.10 ([a785a25](https://github.com/DanySK/gradle-kotlin-qa/commit/a785a25da2caf539ad06a6774ff8c73235126951))

## [0.8.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.8.1...0.8.2) (2021-12-22)


### Bug Fixes

* **deps:** update dependency gradle to v7.3.3 ([e0d463a](https://github.com/DanySK/gradle-kotlin-qa/commit/e0d463a1a319bf1e30728d9d0c0213531315c4df))

## [0.8.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.8.0...0.8.1) (2021-12-15)


### Bug Fixes

* **deps:** update dependency gradle to v7.3.2 ([d60ac99](https://github.com/DanySK/gradle-kotlin-qa/commit/d60ac99f6fb52e46e5d7cbd737dc3d0b3a2ee120))

# [0.8.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.7.1...0.8.0) (2021-12-03)


### Features

* **deps:** update dependency com.pinterest:ktlint to v0.43.2 ([3392568](https://github.com/DanySK/gradle-kotlin-qa/commit/3392568e78f231c05c3912ffadb84bb028fc4f8a))

## [0.7.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.7.0...0.7.1) (2021-12-01)


### Bug Fixes

* **deps:** update dependency gradle to v7.3.1 ([9f16c9b](https://github.com/DanySK/gradle-kotlin-qa/commit/9f16c9ba28d1b4ab282eb395b72f7486fca1156a))

# [0.7.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.6.0...0.7.0) (2021-12-01)


### Features

* **deps:** update dependency com.pinterest:ktlint to v0.43.1 ([1b2bdb0](https://github.com/DanySK/gradle-kotlin-qa/commit/1b2bdb0952e4bc96cae2226f88a75f648ff8b8f5))

# [0.6.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.5.0...0.6.0) (2021-11-29)


### Bug Fixes

* apply CPD if Kotlin is applied, not Java ([1f9df9b](https://github.com/DanySK/gradle-kotlin-qa/commit/1f9df9bbc6dc3c76ff2b05d4356d775fda53f296))
* rollback the previous change ([a440857](https://github.com/DanySK/gradle-kotlin-qa/commit/a44085731923a2660942c5fe96cdf3a6a4f77ac4))


### Features

* force warnings as errors ([d486815](https://github.com/DanySK/gradle-kotlin-qa/commit/d48681592707677ca2d8f5881d88b83c41fdb3f0))

# [0.5.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.4.1...0.5.0) (2021-11-29)


### Features

* **deps:** update dependency io.gitlab.arturbosch.detekt:detekt-gradle-plugin to v1.19.0 ([6a09da9](https://github.com/DanySK/gradle-kotlin-qa/commit/6a09da99b48a3c5a645274c29bd8babfb123e55b))

## [0.4.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.4.0...0.4.1) (2021-11-28)


### Bug Fixes

* display a clean error message on loading failure ([31c725f](https://github.com/DanySK/gradle-kotlin-qa/commit/31c725fa80d7ec864fb592c78573e56e4c9c5d0c))

# [0.4.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.3.2...0.4.0) (2021-11-27)


### Features

* **deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v6.41.0 ([cc80526](https://github.com/DanySK/gradle-kotlin-qa/commit/cc80526e75e014472f56f821a48f043907bfd1a6))

### Changelog

All notable changes to this project will be documented in this file. Dates are displayed in UTC.

Generated by [`auto-changelog`](https://github.com/CookPete/auto-changelog).

#### [Unreleased](https://github.com/DanySK/gradle-kotlin-qa/compare/0.3.2...HEAD)

- chore(deps): update dependency gradle to v7.3 [`b9feb2c`](https://github.com/DanySK/gradle-kotlin-qa/commit/b9feb2c2dc2a49359edf69e1a856a3789dc64ecd)
- Update Changelog [`e8e4814`](https://github.com/DanySK/gradle-kotlin-qa/commit/e8e48141b68467ad66447c9c235e0602c44b4214)
- Update Changelog [`87e0a3b`](https://github.com/DanySK/gradle-kotlin-qa/commit/87e0a3b3537a0bb3749909553c97f60b7d6fc29f)

#### [0.3.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.3.1...0.3.2)

> 4 November 2021

- Allow CPD to run on projects with no kotlin sources [`057ffe3`](https://github.com/DanySK/gradle-kotlin-qa/commit/057ffe3b2d1ee297feae45a947330de2fb27f26d)
- Update Changelog [`27d9a39`](https://github.com/DanySK/gradle-kotlin-qa/commit/27d9a39a3852ac1723e52cd22cfcd3237dfdf385)

#### [0.3.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.3.0...0.3.1)

> 4 November 2021

- Update changelog after deployment [`ef325f0`](https://github.com/DanySK/gradle-kotlin-qa/commit/ef325f0c8010c04c2e270328fb10565fa7494fe4)

#### [0.3.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.2.2...0.3.0)

> 4 November 2021

- Try to reuse an existing workflow [`f2dc7a5`](https://github.com/DanySK/gradle-kotlin-qa/commit/f2dc7a54da6dc3e7509e7c9b88a3de8df5cbba91)
- Update the referenced build workflow [`2441eeb`](https://github.com/DanySK/gradle-kotlin-qa/commit/2441eeb108725b57ab7b2e3a087f9e9b26c8d5ff)
- Add CPD-Kotlin [`8ed6c9d`](https://github.com/DanySK/gradle-kotlin-qa/commit/8ed6c9d449a4bebf659f314b3e084af5bc73d90d)

#### [0.2.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.2.1...0.2.2)

> 2 November 2021

- [Autodelivery] update Gradle plugins CI from DanySK/centralized-automated-deployer@6b41b2d [`e00bf25`](https://github.com/DanySK/gradle-kotlin-qa/commit/e00bf25f1c0667819902ad9b6308d8ab39b3f21d)
- Update build-and-deploy.yml [`8cf9360`](https://github.com/DanySK/gradle-kotlin-qa/commit/8cf936027357d4169d6f7feac814fa51c4ddb595)
- Create .stickler.yml [`87d61fe`](https://github.com/DanySK/gradle-kotlin-qa/commit/87d61fe944a570785ea65583c5d5cfdbdbcd9300)

#### [0.2.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.2.0...0.2.1)

> 7 October 2021

- Test that JaCoCo works [`1425c84`](https://github.com/DanySK/gradle-kotlin-qa/commit/1425c8435cb984ad4feed5e260251947781af496)
- Disable JaCoCo on Windows [`6e758b0`](https://github.com/DanySK/gradle-kotlin-qa/commit/6e758b0bd58a2e55199fcc9cb416e4c261f63ecf)
- Generate JaCoCo XML reports [`01f8e97`](https://github.com/DanySK/gradle-kotlin-qa/commit/01f8e975a390c090c813fec1c5e77778568e698d)

#### [0.2.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.1.0...0.2.0)

> 6 October 2021

- Apply JaCoCo and control tool versions directly [`ae718d9`](https://github.com/DanySK/gradle-kotlin-qa/commit/ae718d91ae2100d27975e70ff080744d15291f15)
- Enable the build scans [`002c4f5`](https://github.com/DanySK/gradle-kotlin-qa/commit/002c4f562a0413caf8fd76f59be33a0faa37ece5)
- Create the directory structure if absent [`22ec1b1`](https://github.com/DanySK/gradle-kotlin-qa/commit/22ec1b1fd12b881f6ed1a5543d72a9d9e1560b7f)

#### 0.1.0

> 5 October 2021

- Update dependency io.github.classgraph:classgraph to v4.8.123 [`#1`](https://github.com/DanySK/gradle-kotlin-qa/pull/1)
- Initial commit [`e920c60`](https://github.com/DanySK/gradle-kotlin-qa/commit/e920c60cf679c2849fbafe95420183860dc940dc)
- First seemingly working version [`8db4764`](https://github.com/DanySK/gradle-kotlin-qa/commit/8db4764be19323a27ffb94b2a82919790d946ef4)
- Create LICENSE [`48c6d80`](https://github.com/DanySK/gradle-kotlin-qa/commit/48c6d8094d98d58340ddcaa4bfdd644ecc555879)
- Apply the plugin to itself [`cb51a77`](https://github.com/DanySK/gradle-kotlin-qa/commit/cb51a77035c9f04ee90eafad722448b18a184899)
- Write README.md [`f3e45ce`](https://github.com/DanySK/gradle-kotlin-qa/commit/f3e45ce0bb2b2044ab5de589476d15ad9a45def8)
- Isolate both ktlint and detekt versions [`b9b20a6`](https://github.com/DanySK/gradle-kotlin-qa/commit/b9b20a62bc213aa9069271d61359daff990c39cf)
- Update publish-on-central [`4549f21`](https://github.com/DanySK/gradle-kotlin-qa/commit/4549f2171d4cb30113eea9c60075e626d47bb18a)
- Fix syntax error in catalog [`950a93f`](https://github.com/DanySK/gradle-kotlin-qa/commit/950a93fdf1e0f7ad828e4683e5853830dc28c219)
- Fix project name [`afbe49e`](https://github.com/DanySK/gradle-kotlin-qa/commit/afbe49e3fd234060d4a256904b7b78090a6eba62)
- Rename folder [`a167806`](https://github.com/DanySK/gradle-kotlin-qa/commit/a167806274345c00d6dce55c8e33650e3e9fa658)
