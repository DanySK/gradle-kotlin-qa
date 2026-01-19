## [0.100.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.100.1...0.100.2) (2026-01-19)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.3.0 ([#1274](https://github.com/DanySK/gradle-kotlin-qa/issues/1274)) ([4eadcc9](https://github.com/DanySK/gradle-kotlin-qa/commit/4eadcc9afd429491e57ab7879ba68afcd835b71c))
* **deps:** update plugin kotlin-qa to v0.100.1 ([#1288](https://github.com/DanySK/gradle-kotlin-qa/issues/1288)) ([f08462d](https://github.com/DanySK/gradle-kotlin-qa/commit/f08462d364f085b9a181c0cdf374af99564567b5))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.7 ([#1286](https://github.com/DanySK/gradle-kotlin-qa/issues/1286)) ([9d1a8c1](https://github.com/DanySK/gradle-kotlin-qa/commit/9d1a8c11b1aea4b96fc1b3e8576279c839771e00))
* **deps:** update plugin publishoncentral to v9.1.10 ([#1278](https://github.com/DanySK/gradle-kotlin-qa/issues/1278)) ([f5d3305](https://github.com/DanySK/gradle-kotlin-qa/commit/f5d3305c652f6384cd5e118648f274daa08d7cb0))
* **deps:** update plugin publishoncentral to v9.1.11 ([#1293](https://github.com/DanySK/gradle-kotlin-qa/issues/1293)) ([fb8ea62](https://github.com/DanySK/gradle-kotlin-qa/commit/fb8ea62b595b82df88392a550165211aff663cd4))

### Tests

* create a settings.gradle.kts with develocity for the base test ([#1243](https://github.com/DanySK/gradle-kotlin-qa/issues/1243)) ([de16aee](https://github.com/DanySK/gradle-kotlin-qa/commit/de16aeeca297158e76919ed44c9f3650b322cbfe))
* drop forced `apiVersion` in KMP test ([#1292](https://github.com/DanySK/gradle-kotlin-qa/issues/1292)) ([46cd341](https://github.com/DanySK/gradle-kotlin-qa/commit/46cd3410b11a2510f771e929c517fd576bf8d959))
* update kotlin and lock the toolchain to jvm 21 in the repo with no sources ([#1247](https://github.com/DanySK/gradle-kotlin-qa/issues/1247)) ([97bf863](https://github.com/DanySK/gradle-kotlin-qa/commit/97bf86342c0ab921c97087b884b89de72f47d02e))
* update kotlin in the kotlin-MP test ([#1245](https://github.com/DanySK/gradle-kotlin-qa/issues/1245)) ([b1b4f2e](https://github.com/DanySK/gradle-kotlin-qa/commit/b1b4f2e3d9b6292a11fa2cc66753383dca3a1a5c))
* update publish-on-central in the kotlin-MP test ([#1244](https://github.com/DanySK/gradle-kotlin-qa/issues/1244)) ([49e9df9](https://github.com/DanySK/gradle-kotlin-qa/commit/49e9df9f2dd2d9f86cc05d85e103b6cb36cea659))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.19 ([#1289](https://github.com/DanySK/gradle-kotlin-qa/issues/1289)) ([d756c88](https://github.com/DanySK/gradle-kotlin-qa/commit/d756c8835c1960c7f8838372105dcb194efb5795))
* pinpoint the version of `build-check-deploy-gradle-action` using the commit hash ([6903ad4](https://github.com/DanySK/gradle-kotlin-qa/commit/6903ad4a796d579da3b2808d88c771a0c92a7988))
* run gradle in parallel by default ([#1248](https://github.com/DanySK/gradle-kotlin-qa/issues/1248)) ([edbbd6b](https://github.com/DanySK/gradle-kotlin-qa/commit/edbbd6bfe4499bc1cd3937a2f7f3166a1f86b103))

## [0.100.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.100.0...0.100.1) (2026-01-16)

### Dependency updates

* **core-deps:** update gradle to v9.3.0 ([#1287](https://github.com/DanySK/gradle-kotlin-qa/issues/1287)) ([cdc9bc9](https://github.com/DanySK/gradle-kotlin-qa/commit/cdc9bc97db6ed6849db20445545b2f3cb6c9c0e7))
* **deps:** update node.js to 24.13 ([#1282](https://github.com/DanySK/gradle-kotlin-qa/issues/1282)) ([a0d3d8d](https://github.com/DanySK/gradle-kotlin-qa/commit/a0d3d8daf05fc63e7dfaa47e3c7d70f6f8b299aa))
* **deps:** update plugin com.gradle.develocity to v4.3.1 ([#1284](https://github.com/DanySK/gradle-kotlin-qa/issues/1284)) ([80ae3c2](https://github.com/DanySK/gradle-kotlin-qa/commit/80ae3c26e71457a26dafe4e8a419bea3a536aab2))
* **deps:** update plugin gitsemver to v7.0.9 ([#1285](https://github.com/DanySK/gradle-kotlin-qa/issues/1285)) ([dac3661](https://github.com/DanySK/gradle-kotlin-qa/commit/dac3661706922bf0395176a39483c045ce5707fe))
* **deps:** update plugin kotlin-qa to v0.100.0 ([#1280](https://github.com/DanySK/gradle-kotlin-qa/issues/1280)) ([87f8386](https://github.com/DanySK/gradle-kotlin-qa/commit/87f8386c49e406bf856ff96a6ea25ff255882306))

### Build and continuous integration

* **deps:** update actions/setup-node action to v6.2.0 ([#1283](https://github.com/DanySK/gradle-kotlin-qa/issues/1283)) ([e8ef404](https://github.com/DanySK/gradle-kotlin-qa/commit/e8ef40416f24f9c850cbe10fd2f169b607534923))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.18 ([#1281](https://github.com/DanySK/gradle-kotlin-qa/issues/1281)) ([b77ac95](https://github.com/DanySK/gradle-kotlin-qa/commit/b77ac95fc5fb713c6e49f77343699d61db35710d))

## [0.100.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.99.0...0.100.0) (2025-12-30)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.20.0 ([#1279](https://github.com/DanySK/gradle-kotlin-qa/issues/1279)) ([a926cde](https://github.com/DanySK/gradle-kotlin-qa/commit/a926cde2dbbd65874c1c4b284efb8c500768cc87))
* **deps:** update kotest to v6.0.6 ([#1262](https://github.com/DanySK/gradle-kotlin-qa/issues/1262)) ([fe24797](https://github.com/DanySK/gradle-kotlin-qa/commit/fe247978d753f8b43901ff4e5ce1c8b5f00f5e0b))
* **deps:** update kotest to v6.0.7 ([#1263](https://github.com/DanySK/gradle-kotlin-qa/issues/1263)) ([14bc4b8](https://github.com/DanySK/gradle-kotlin-qa/commit/14bc4b87def29a397a7e22969ad361e3c10f527c))
* **deps:** update node.js to 24.12 ([#1273](https://github.com/DanySK/gradle-kotlin-qa/issues/1273)) ([e51e3c7](https://github.com/DanySK/gradle-kotlin-qa/commit/e51e3c7e16fbdeb839479db32574b74c29c7825d))
* **deps:** update plugin com.gradle.develocity to v4.3 ([#1269](https://github.com/DanySK/gradle-kotlin-qa/issues/1269)) ([56669d9](https://github.com/DanySK/gradle-kotlin-qa/commit/56669d90395d5739b24513cc964df8362fe7334c))
* **deps:** update plugin gitsemver to v7.0.8 ([#1275](https://github.com/DanySK/gradle-kotlin-qa/issues/1275)) ([8742147](https://github.com/DanySK/gradle-kotlin-qa/commit/87421475308b6a611c5cc334c2961dcfbfff5bbb))
* **deps:** update plugin kotlin-qa to v0.99.0 ([#1261](https://github.com/DanySK/gradle-kotlin-qa/issues/1261)) ([876b5e7](https://github.com/DanySK/gradle-kotlin-qa/commit/876b5e79e2aa5e05ed81b4b62f5eca4094ac9f33))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.6 ([#1277](https://github.com/DanySK/gradle-kotlin-qa/issues/1277)) ([1532bcb](https://github.com/DanySK/gradle-kotlin-qa/commit/1532bcb9abc5fe5d160510296abc2cf06df32e2f))

### Build and continuous integration

* **deps:** update actions/checkout action to v6.0.1 ([#1264](https://github.com/DanySK/gradle-kotlin-qa/issues/1264)) ([9fb2bdf](https://github.com/DanySK/gradle-kotlin-qa/commit/9fb2bdf044a9d9022d642d30a86c4a9522916e7f))
* **deps:** update actions/setup-node action to v6.1.0 ([#1266](https://github.com/DanySK/gradle-kotlin-qa/issues/1266)) ([f3bbb96](https://github.com/DanySK/gradle-kotlin-qa/commit/f3bbb96fd37dd05605cd73fcbfa485a7780a1934))
* **deps:** update danysk/action-checkout action to v0.2.27 ([#1265](https://github.com/DanySK/gradle-kotlin-qa/issues/1265)) ([c604a30](https://github.com/DanySK/gradle-kotlin-qa/commit/c604a30453cc3778ca1592a18656ff232bfe85cc))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.13 ([#1267](https://github.com/DanySK/gradle-kotlin-qa/issues/1267)) ([03abb18](https://github.com/DanySK/gradle-kotlin-qa/commit/03abb180024e63c2b371a6d7c1f3491b9731bd4d))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.14 ([#1268](https://github.com/DanySK/gradle-kotlin-qa/issues/1268)) ([ac50efe](https://github.com/DanySK/gradle-kotlin-qa/commit/ac50efef35dc70c58c75e67cb41296d43da62610))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.15 ([#1270](https://github.com/DanySK/gradle-kotlin-qa/issues/1270)) ([73a78c4](https://github.com/DanySK/gradle-kotlin-qa/commit/73a78c4424923e88eacb8e6f93b2144be5060b14))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.16 ([#1271](https://github.com/DanySK/gradle-kotlin-qa/issues/1271)) ([d31efb8](https://github.com/DanySK/gradle-kotlin-qa/commit/d31efb8b0cae6a4ec9c8969a93db4abf86438afa))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.17 ([#1272](https://github.com/DanySK/gradle-kotlin-qa/issues/1272)) ([e556168](https://github.com/DanySK/gradle-kotlin-qa/commit/e5561682a044eb0d85d35ed9e53954ae257f0e43))

## [0.99.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.98.2...0.99.0) (2025-11-28)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.19.0 ([#1260](https://github.com/DanySK/gradle-kotlin-qa/issues/1260)) ([ca1c594](https://github.com/DanySK/gradle-kotlin-qa/commit/ca1c594e3fa3926975a94b920f1be43400fe7405))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.157 ([#1259](https://github.com/DanySK/gradle-kotlin-qa/issues/1259)) ([d8bfcbd](https://github.com/DanySK/gradle-kotlin-qa/commit/d8bfcbd20833834f2fb7d03e6513ff597d2f76e4))
* **deps:** update kotest to v6.0.5 ([#1253](https://github.com/DanySK/gradle-kotlin-qa/issues/1253)) ([c0434e5](https://github.com/DanySK/gradle-kotlin-qa/commit/c0434e5962d89437791b55b32eb359c17e390b3f))
* **deps:** update plugin gitsemver to v7.0.7 ([#1256](https://github.com/DanySK/gradle-kotlin-qa/issues/1256)) ([ecdced4](https://github.com/DanySK/gradle-kotlin-qa/commit/ecdced4f3d74d63c475a923130a21a946ab97057))
* **deps:** update plugin kotlin-qa to v0.98.2 ([#1254](https://github.com/DanySK/gradle-kotlin-qa/issues/1254)) ([d05c2d3](https://github.com/DanySK/gradle-kotlin-qa/commit/d05c2d3a170687407ae769a203e256fe2f58da94))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.5 ([#1252](https://github.com/DanySK/gradle-kotlin-qa/issues/1252)) ([89aeae6](https://github.com/DanySK/gradle-kotlin-qa/commit/89aeae6f7cd5471744da1fbb32ba94c78bafbef8))

### Build and continuous integration

* **deps:** update actions/checkout action to v6 ([#1257](https://github.com/DanySK/gradle-kotlin-qa/issues/1257)) ([4e55f39](https://github.com/DanySK/gradle-kotlin-qa/commit/4e55f391e8b08c30e6ea37d871c5d67d14c6c057))
* **deps:** update danysk/action-checkout action to v0.2.25 ([#1255](https://github.com/DanySK/gradle-kotlin-qa/issues/1255)) ([878c7d6](https://github.com/DanySK/gradle-kotlin-qa/commit/878c7d66e9da30d925cf592096075788f7810434))
* **deps:** update danysk/action-checkout action to v0.2.26 ([#1258](https://github.com/DanySK/gradle-kotlin-qa/issues/1258)) ([5ae47c3](https://github.com/DanySK/gradle-kotlin-qa/commit/5ae47c33ca55e599dcdd22586a0d554c7303a2d6))

## [0.98.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.98.1...0.98.2) (2025-11-18)

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.98.1 ([#1241](https://github.com/DanySK/gradle-kotlin-qa/issues/1241)) ([e857ef5](https://github.com/DanySK/gradle-kotlin-qa/commit/e857ef5a94012cf79001d56fd5f54f27e685ea0a))

### Documentation

* **deps:** update dependency org.jetbrains.dokka to v2.1.0 ([#1206](https://github.com/DanySK/gradle-kotlin-qa/issues/1206)) ([05d7c55](https://github.com/DanySK/gradle-kotlin-qa/commit/05d7c55ff22588e103c525ccc5facbc26b4b59f0))
* switch to Dokka v2 ([#1251](https://github.com/DanySK/gradle-kotlin-qa/issues/1251)) ([b0ef5c4](https://github.com/DanySK/gradle-kotlin-qa/commit/b0ef5c40eee8500684cc81d675cf0f8db7394a0c))

### Tests

* update kotlin in the no-source test ([#1246](https://github.com/DanySK/gradle-kotlin-qa/issues/1246)) ([f2521e3](https://github.com/DanySK/gradle-kotlin-qa/commit/f2521e350a1b0385f222207847109b085adf10c4))

### Style improvements

* update .editorconfig disabling new ktlint beta rules ([#1250](https://github.com/DanySK/gradle-kotlin-qa/issues/1250)) ([a656bd9](https://github.com/DanySK/gradle-kotlin-qa/commit/a656bd90109ba549fd871f335e3ed3317e10e947))

## [0.98.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.98.0...0.98.1) (2025-11-17)

### Dependency updates

* **core-deps:** update gradle to v9.2.1 ([#1238](https://github.com/DanySK/gradle-kotlin-qa/issues/1238)) ([6863835](https://github.com/DanySK/gradle-kotlin-qa/commit/6863835d42a8ed37741b50d7c81c80f09453e21f))
* **deps:** update dependency org.apache.commons:commons-lang3 to v3.20.0 ([#1237](https://github.com/DanySK/gradle-kotlin-qa/issues/1237)) ([5516602](https://github.com/DanySK/gradle-kotlin-qa/commit/5516602e7eabd414affc3780688ae9cac357e5ff))
* **deps:** update plugin kotlin-qa to v0.98.0 ([#1236](https://github.com/DanySK/gradle-kotlin-qa/issues/1236)) ([6e71b48](https://github.com/DanySK/gradle-kotlin-qa/commit/6e71b48828008ea0c885ff63768da8bdbfd02b41))
* **deps:** update plugin publishoncentral to v9.1.8 ([#1239](https://github.com/DanySK/gradle-kotlin-qa/issues/1239)) ([3163f88](https://github.com/DanySK/gradle-kotlin-qa/commit/3163f88bdb393e53c78dc8ccb9b267a871a8ae5b))

### Build and continuous integration

* **deps:** update actions/checkout action to v5.0.1 ([#1240](https://github.com/DanySK/gradle-kotlin-qa/issues/1240)) ([79a3a66](https://github.com/DanySK/gradle-kotlin-qa/commit/79a3a666334ac9d89a555fe36b30c84058f1ff01))

## [0.98.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.97.0...0.98.0) (2025-11-14)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.8.0 ([#1234](https://github.com/DanySK/gradle-kotlin-qa/issues/1234)) ([9ea098f](https://github.com/DanySK/gradle-kotlin-qa/commit/9ea098ff582924e17fd033cdacd42b9609dc5529))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.156 ([#1233](https://github.com/DanySK/gradle-kotlin-qa/issues/1233)) ([353cbfd](https://github.com/DanySK/gradle-kotlin-qa/commit/353cbfd7975a7842d38beb57db9dde528468598a))
* **deps:** update plugin kotlin-qa to v0.97.0 ([#1235](https://github.com/DanySK/gradle-kotlin-qa/issues/1235)) ([357ceca](https://github.com/DanySK/gradle-kotlin-qa/commit/357ceca4c411038bfe99688de9ff364c4bd64e65))

## [0.97.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.96.0...0.97.0) (2025-11-14)

### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v14 ([#1231](https://github.com/DanySK/gradle-kotlin-qa/issues/1231)) ([0534055](https://github.com/DanySK/gradle-kotlin-qa/commit/0534055183152acb81e215265cf747e706ee7d57))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.153 ([#1228](https://github.com/DanySK/gradle-kotlin-qa/issues/1228)) ([302fa1c](https://github.com/DanySK/gradle-kotlin-qa/commit/302fa1c274a51aa1adf6d0590666623b4e147f42))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.154 ([#1230](https://github.com/DanySK/gradle-kotlin-qa/issues/1230)) ([f5c0fa4](https://github.com/DanySK/gradle-kotlin-qa/commit/f5c0fa4e915ea26382426f3ad51841a1dc42a7cf))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.155 ([#1232](https://github.com/DanySK/gradle-kotlin-qa/issues/1232)) ([20af571](https://github.com/DanySK/gradle-kotlin-qa/commit/20af57196bae7da3f871dc399bb10c61b03d1d3b))
* **deps:** update plugin kotlin-qa to v0.96.0 ([#1226](https://github.com/DanySK/gradle-kotlin-qa/issues/1226)) ([6fd5306](https://github.com/DanySK/gradle-kotlin-qa/commit/6fd5306312e86554537efd33036779ad006add67))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.11 ([#1227](https://github.com/DanySK/gradle-kotlin-qa/issues/1227)) ([22fd6c1](https://github.com/DanySK/gradle-kotlin-qa/commit/22fd6c1c8e1e2c55d0aa6149c3a628e09886204f))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.12 ([#1229](https://github.com/DanySK/gradle-kotlin-qa/issues/1229)) ([41ad3a0](https://github.com/DanySK/gradle-kotlin-qa/commit/41ad3a0c821445c9ea9dfe776ccc6d20182f12b9))

## [0.96.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.95.3...0.96.0) (2025-10-31)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.18.0 ([#1225](https://github.com/DanySK/gradle-kotlin-qa/issues/1225)) ([de88218](https://github.com/DanySK/gradle-kotlin-qa/commit/de88218b561f74f21b323c4141b6d1aa806d5861))
* **deps:** update node.js to v24 ([#1224](https://github.com/DanySK/gradle-kotlin-qa/issues/1224)) ([ba3ad03](https://github.com/DanySK/gradle-kotlin-qa/commit/ba3ad031801cbc523c5186e0be2a24058e94792c))
* **deps:** update plugin kotlin-qa to v0.95.3 ([#1222](https://github.com/DanySK/gradle-kotlin-qa/issues/1222)) ([82374e3](https://github.com/DanySK/gradle-kotlin-qa/commit/82374e34342b4b06b329cdeaf693a5d171b5661b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.4 ([#1223](https://github.com/DanySK/gradle-kotlin-qa/issues/1223)) ([2a7adc1](https://github.com/DanySK/gradle-kotlin-qa/commit/2a7adc12dccd63aa17aa5dc4c1290f838fad820a))

## [0.95.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.95.2...0.95.3) (2025-10-30)

### Dependency updates

* **core-deps:** update gradle to v9.2.0 ([#1219](https://github.com/DanySK/gradle-kotlin-qa/issues/1219)) ([0011606](https://github.com/DanySK/gradle-kotlin-qa/commit/0011606fbfce1834afec33094455bc27e252abab))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.151 ([#1217](https://github.com/DanySK/gradle-kotlin-qa/issues/1217)) ([c8d3a09](https://github.com/DanySK/gradle-kotlin-qa/commit/c8d3a090517c4148c8b1f9c7ca5c2d55ae26bfce))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.152 ([#1218](https://github.com/DanySK/gradle-kotlin-qa/issues/1218)) ([7d1fc95](https://github.com/DanySK/gradle-kotlin-qa/commit/7d1fc95ed02cc7da852a66a9a504230478adf5c7))
* **deps:** update plugin gitsemver to v7.0.5 ([#1214](https://github.com/DanySK/gradle-kotlin-qa/issues/1214)) ([0f5fc84](https://github.com/DanySK/gradle-kotlin-qa/commit/0f5fc8419fefa897b20661a8dcafee039544f5ae))
* **deps:** update plugin gitsemver to v7.0.6 ([#1220](https://github.com/DanySK/gradle-kotlin-qa/issues/1220)) ([521822f](https://github.com/DanySK/gradle-kotlin-qa/commit/521822f16bf0ab5538ebe9f4b4265cd1a51edad5))
* **deps:** update plugin kotlin-qa to v0.95.2 ([#1215](https://github.com/DanySK/gradle-kotlin-qa/issues/1215)) ([6a9ee1a](https://github.com/DanySK/gradle-kotlin-qa/commit/6a9ee1ae6c70d7e6571c70d74313be3fc75c4af4))
* **deps:** update plugin publishoncentral to v9.1.7 ([#1221](https://github.com/DanySK/gradle-kotlin-qa/issues/1221)) ([05995da](https://github.com/DanySK/gradle-kotlin-qa/commit/05995da6fe5094619fb9598d20bf21657799de02))

## [0.95.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.95.1...0.95.2) (2025-10-23)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.2.21 ([#1211](https://github.com/DanySK/gradle-kotlin-qa/issues/1211)) ([a482c64](https://github.com/DanySK/gradle-kotlin-qa/commit/a482c64cf8e3f18aacd494e1669fb537138f7979))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.184 ([#1201](https://github.com/DanySK/gradle-kotlin-qa/issues/1201)) ([2100575](https://github.com/DanySK/gradle-kotlin-qa/commit/21005750b16ec9bffd8365403fb4e11edc5c45d5))
* **deps:** update dependency org.apache.commons:commons-lang3 to v3.19.0 ([#1193](https://github.com/DanySK/gradle-kotlin-qa/issues/1193)) ([c3ac05f](https://github.com/DanySK/gradle-kotlin-qa/commit/c3ac05fa596e6897f3e81e3712e4ade5359dc061))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.146 ([#1195](https://github.com/DanySK/gradle-kotlin-qa/issues/1195)) ([bc3b45d](https://github.com/DanySK/gradle-kotlin-qa/commit/bc3b45d5a8a3286dd77b14952f6d51e33dacf329))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.147 ([#1198](https://github.com/DanySK/gradle-kotlin-qa/issues/1198)) ([f0f949b](https://github.com/DanySK/gradle-kotlin-qa/commit/f0f949bc5b38bb48e9acc5f49c5e7d5d2298c99e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.148 ([#1207](https://github.com/DanySK/gradle-kotlin-qa/issues/1207)) ([c1f87d1](https://github.com/DanySK/gradle-kotlin-qa/commit/c1f87d107226928b33f8e16a37136a70b275a260))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.149 ([#1208](https://github.com/DanySK/gradle-kotlin-qa/issues/1208)) ([3acb218](https://github.com/DanySK/gradle-kotlin-qa/commit/3acb218bf949b164844f8f164fde4368d9c8c783))
* **deps:** update jacoco to v0.8.14 ([#1202](https://github.com/DanySK/gradle-kotlin-qa/issues/1202)) ([ba13d96](https://github.com/DanySK/gradle-kotlin-qa/commit/ba13d96affbb6b7ba91371b4ff7fa9081e761f99))
* **deps:** update kotest to v6.0.4 ([#1205](https://github.com/DanySK/gradle-kotlin-qa/issues/1205)) ([8eda5a8](https://github.com/DanySK/gradle-kotlin-qa/commit/8eda5a8a324a65f5c6dd9c1ae038d960b5b7fd46))
* **deps:** update node.js to 22.20 ([#1196](https://github.com/DanySK/gradle-kotlin-qa/issues/1196)) ([9a23989](https://github.com/DanySK/gradle-kotlin-qa/commit/9a239896875fd3153142c422a215f49bef489bf3))
* **deps:** update node.js to 22.21 ([#1209](https://github.com/DanySK/gradle-kotlin-qa/issues/1209)) ([970e102](https://github.com/DanySK/gradle-kotlin-qa/commit/970e102a1696e7acc6d1f565039d430d8cd30c99))
* **deps:** update plugin com.gradle.develocity to v4.2.1 ([#1200](https://github.com/DanySK/gradle-kotlin-qa/issues/1200)) ([ae7c4e5](https://github.com/DanySK/gradle-kotlin-qa/commit/ae7c4e53188ac2949211fcde7abd68edbf0765a9))
* **deps:** update plugin com.gradle.develocity to v4.2.2 ([#1203](https://github.com/DanySK/gradle-kotlin-qa/issues/1203)) ([e5edf87](https://github.com/DanySK/gradle-kotlin-qa/commit/e5edf87bdf3597fea2e3e8a897b41be53f727f19))
* **deps:** update plugin kotlin-qa to v0.95.1 ([#1189](https://github.com/DanySK/gradle-kotlin-qa/issues/1189)) ([02fd343](https://github.com/DanySK/gradle-kotlin-qa/commit/02fd3430f9903bb21e0b80696c1a638339bdd3e6))
* **deps:** update plugin multijvmtesting to v4.1.2 ([#1190](https://github.com/DanySK/gradle-kotlin-qa/issues/1190)) ([1cb1e16](https://github.com/DanySK/gradle-kotlin-qa/commit/1cb1e16b2d564439db5ee5b715844f633c64d4b8))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.3 ([#1212](https://github.com/DanySK/gradle-kotlin-qa/issues/1212)) ([ae51e89](https://github.com/DanySK/gradle-kotlin-qa/commit/ae51e89639addf7b696bd51ea69b62b131ce8e2c))
* **deps:** update plugin publishoncentral to v9.1.6 ([#1213](https://github.com/DanySK/gradle-kotlin-qa/issues/1213)) ([749b802](https://github.com/DanySK/gradle-kotlin-qa/commit/749b8022e68a9e7d6d7d153c3ac3942c2c92ecfa))

### Build and continuous integration

* **deps:** update actions/setup-node action to v6 ([#1204](https://github.com/DanySK/gradle-kotlin-qa/issues/1204)) ([79264c7](https://github.com/DanySK/gradle-kotlin-qa/commit/79264c72e4820ea9d722d67e384b0ab1a54a3406))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.10 ([#1199](https://github.com/DanySK/gradle-kotlin-qa/issues/1199)) ([bb088fe](https://github.com/DanySK/gradle-kotlin-qa/commit/bb088fe35ac2a6bbe1c78f9608d4137a75aaf75e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.8 ([#1192](https://github.com/DanySK/gradle-kotlin-qa/issues/1192)) ([488eec0](https://github.com/DanySK/gradle-kotlin-qa/commit/488eec0ec1df08a3c782cd034ba05dbba49fdd5c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.9 ([#1197](https://github.com/DanySK/gradle-kotlin-qa/issues/1197)) ([dd2b4bd](https://github.com/DanySK/gradle-kotlin-qa/commit/dd2b4bd373b18dfb94deb8148161eebc5b6380ee))
* **deps:** update dependency macos github actions runner to v15 ([#1194](https://github.com/DanySK/gradle-kotlin-qa/issues/1194)) ([cc05062](https://github.com/DanySK/gradle-kotlin-qa/commit/cc0506203267c6d28196dfbf7e9275a9e9d0b347))
* update action-checkout to specific commit ([26e1b75](https://github.com/DanySK/gradle-kotlin-qa/commit/26e1b75ac13dab967698cbdacbb554680ab3ac31))

## [0.95.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.95.0...0.95.1) (2025-09-19)

### Dependency updates

* **core-deps:** update gradle to v9.1.0 ([#1187](https://github.com/DanySK/gradle-kotlin-qa/issues/1187)) ([eef5edb](https://github.com/DanySK/gradle-kotlin-qa/commit/eef5edbfd4ca2e8ec94a241b35500ed4aea87a7e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.144 ([#1183](https://github.com/DanySK/gradle-kotlin-qa/issues/1183)) ([5544091](https://github.com/DanySK/gradle-kotlin-qa/commit/55440910d49d138bcbd2ca12dff0e95190e53016))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.145 ([#1184](https://github.com/DanySK/gradle-kotlin-qa/issues/1184)) ([9fe2218](https://github.com/DanySK/gradle-kotlin-qa/commit/9fe2218eb83926f15e7c31c78988017e8313c58f))
* **deps:** update plugin com.gradle.develocity to v4.2 ([#1182](https://github.com/DanySK/gradle-kotlin-qa/issues/1182)) ([e91092a](https://github.com/DanySK/gradle-kotlin-qa/commit/e91092a9a185a0b640cb75745157be8888e0c34e))
* **deps:** update plugin gitsemver to v7.0.4 ([#1185](https://github.com/DanySK/gradle-kotlin-qa/issues/1185)) ([5484cb6](https://github.com/DanySK/gradle-kotlin-qa/commit/5484cb6fc9c3447fab0f935702c7cb8db81d822f))
* **deps:** update plugin kotlin-qa to v0.95.0 ([#1181](https://github.com/DanySK/gradle-kotlin-qa/issues/1181)) ([5feab0a](https://github.com/DanySK/gradle-kotlin-qa/commit/5feab0a53c20c8a42dab5553caadb4d7338fe566))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.2 ([#1188](https://github.com/DanySK/gradle-kotlin-qa/issues/1188)) ([99ea1b4](https://github.com/DanySK/gradle-kotlin-qa/commit/99ea1b45422b7981cdbe039613ca6f01e61a42df))
* **deps:** update plugin publishoncentral to v9.1.5 ([#1186](https://github.com/DanySK/gradle-kotlin-qa/issues/1186)) ([d2e528b](https://github.com/DanySK/gradle-kotlin-qa/commit/d2e528b6b4d326141b3475ba2026c4387a54613d))

## [0.95.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.94.1...0.95.0) (2025-09-13)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.17.0 ([#1180](https://github.com/DanySK/gradle-kotlin-qa/issues/1180)) ([27438d5](https://github.com/DanySK/gradle-kotlin-qa/commit/27438d538e60a02221fd948a43bc674c256b9704))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.142 ([#1178](https://github.com/DanySK/gradle-kotlin-qa/issues/1178)) ([b060392](https://github.com/DanySK/gradle-kotlin-qa/commit/b060392850806c33e483faa61068c3461b66237a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.143 ([#1179](https://github.com/DanySK/gradle-kotlin-qa/issues/1179)) ([f54db91](https://github.com/DanySK/gradle-kotlin-qa/commit/f54db91da4a6ba34b1c31e2cc01ece28432b51e1))
* **deps:** update plugin gitsemver to v7.0.3 ([#1173](https://github.com/DanySK/gradle-kotlin-qa/issues/1173)) ([28c664a](https://github.com/DanySK/gradle-kotlin-qa/commit/28c664a911d78b59ad5c1a6dc7f39a68c0f3a70d))
* **deps:** update plugin kotlin-qa to v0.94.1 ([#1174](https://github.com/DanySK/gradle-kotlin-qa/issues/1174)) ([940ec9c](https://github.com/DanySK/gradle-kotlin-qa/commit/940ec9c094cd25b8247105caafc84bccdcb3c58a))
* **deps:** update plugin multijvmtesting to v4.1.1 ([#1175](https://github.com/DanySK/gradle-kotlin-qa/issues/1175)) ([2f14b8a](https://github.com/DanySK/gradle-kotlin-qa/commit/2f14b8a0dbddf061b15c23f5e4d45d09db183247))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.1 ([#1176](https://github.com/DanySK/gradle-kotlin-qa/issues/1176)) ([4a1efed](https://github.com/DanySK/gradle-kotlin-qa/commit/4a1efed2ee5a5e2233731588e093031a4f2282ff))
* **deps:** update plugin publishoncentral to v9.1.4 ([#1177](https://github.com/DanySK/gradle-kotlin-qa/issues/1177)) ([306ded3](https://github.com/DanySK/gradle-kotlin-qa/commit/306ded336165ba2d387644e43cb893fddaad2129))

## [0.94.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.94.0...0.94.1) (2025-09-10)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.2.20 ([#1172](https://github.com/DanySK/gradle-kotlin-qa/issues/1172)) ([6b64814](https://github.com/DanySK/gradle-kotlin-qa/commit/6b6481438ede0760f6abdc632cf289ba127d3d95))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.141 ([#1165](https://github.com/DanySK/gradle-kotlin-qa/issues/1165)) ([0c3d3ff](https://github.com/DanySK/gradle-kotlin-qa/commit/0c3d3ff2d4b0ce9ae0a37345e00b0de4e5d23a65))
* **deps:** update kotest to v6.0.1 ([#1161](https://github.com/DanySK/gradle-kotlin-qa/issues/1161)) ([6ab3043](https://github.com/DanySK/gradle-kotlin-qa/commit/6ab3043c365c2c033909f6aebb199547e8509665))
* **deps:** update kotest to v6.0.2 ([#1164](https://github.com/DanySK/gradle-kotlin-qa/issues/1164)) ([b6f4533](https://github.com/DanySK/gradle-kotlin-qa/commit/b6f4533c2fa23b0f00e457ef8b7698f18beb0043))
* **deps:** update kotest to v6.0.3 ([#1169](https://github.com/DanySK/gradle-kotlin-qa/issues/1169)) ([b534f2e](https://github.com/DanySK/gradle-kotlin-qa/commit/b534f2e01ccf39a6827ee8bda8532737def62db4))
* **deps:** update node.js to 22.19 ([#1162](https://github.com/DanySK/gradle-kotlin-qa/issues/1162)) ([1636da5](https://github.com/DanySK/gradle-kotlin-qa/commit/1636da5e163051318bbd7f3330a3d97dd95c4c52))
* **deps:** update plugin gitsemver to v7.0.2 ([#1158](https://github.com/DanySK/gradle-kotlin-qa/issues/1158)) ([28f5968](https://github.com/DanySK/gradle-kotlin-qa/commit/28f5968fe0f6d5c33f1d3fc6109eaa6ad9cf1a84))
* **deps:** update plugin gradlepluginpublish to v2 ([#1166](https://github.com/DanySK/gradle-kotlin-qa/issues/1166)) ([aba77a4](https://github.com/DanySK/gradle-kotlin-qa/commit/aba77a4bb8739a1a422b975c408f7a898c1ea16f))
* **deps:** update plugin kotlin-qa to v0.94.0 ([#1160](https://github.com/DanySK/gradle-kotlin-qa/issues/1160)) ([f19ac89](https://github.com/DanySK/gradle-kotlin-qa/commit/f19ac8903ea20fe17d531093a586ac4efcfba07d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.1.0 ([#1163](https://github.com/DanySK/gradle-kotlin-qa/issues/1163)) ([1df6f57](https://github.com/DanySK/gradle-kotlin-qa/commit/1df6f57cc1321add1ad32b823a5cd025b0f6623e))

### Build and continuous integration

* **deps:** update actions/setup-node action to v5 ([#1167](https://github.com/DanySK/gradle-kotlin-qa/issues/1167)) ([616dcac](https://github.com/DanySK/gradle-kotlin-qa/commit/616dcac96257aa56f810930689f110deca80a4ae))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.6 ([#1168](https://github.com/DanySK/gradle-kotlin-qa/issues/1168)) ([0d1a61b](https://github.com/DanySK/gradle-kotlin-qa/commit/0d1a61ba2991f75b64964ac776a099b9076d3bcf))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.7 ([#1170](https://github.com/DanySK/gradle-kotlin-qa/issues/1170)) ([0dad7e6](https://github.com/DanySK/gradle-kotlin-qa/commit/0dad7e67d92247f615c8b9bcea460c51d30cac30))

## [0.94.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.93.3...0.94.0) (2025-08-21)

### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v13.1.0 ([#1159](https://github.com/DanySK/gradle-kotlin-qa/issues/1159)) ([cc804fb](https://github.com/DanySK/gradle-kotlin-qa/commit/cc804fb0a6e74df0c654eb0127232b4665b11ea5))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.140 ([#1150](https://github.com/DanySK/gradle-kotlin-qa/issues/1150)) ([06d46bf](https://github.com/DanySK/gradle-kotlin-qa/commit/06d46bf461f6ab9dc1e3506421d78594cea42d3c))
* **deps:** update kotest to v6 ([#1152](https://github.com/DanySK/gradle-kotlin-qa/issues/1152)) ([b9147c6](https://github.com/DanySK/gradle-kotlin-qa/commit/b9147c6b706b7d0103d5a0332d779ef712856cae))
* **deps:** update plugin com.gradle.develocity to v4.1.1 ([#1153](https://github.com/DanySK/gradle-kotlin-qa/issues/1153)) ([01d3e87](https://github.com/DanySK/gradle-kotlin-qa/commit/01d3e87478d756fe3232c767b5bf3d1e2c14c0f0))
* **deps:** update plugin gitsemver to v6.0.2 ([#1154](https://github.com/DanySK/gradle-kotlin-qa/issues/1154)) ([e447b68](https://github.com/DanySK/gradle-kotlin-qa/commit/e447b68e35163c4ff21bdc995f3e09421cc70dcf))
* **deps:** update plugin kotlin-qa to v0.93.3 ([#1151](https://github.com/DanySK/gradle-kotlin-qa/issues/1151)) ([8888869](https://github.com/DanySK/gradle-kotlin-qa/commit/8888869914a8ac4738781a62aabf483957cf3c46))

### Tests

* **deps:** import classgraph correctly ([d4e0577](https://github.com/DanySK/gradle-kotlin-qa/commit/d4e057704d223902481e41deb0e8c6f07e85c620))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.4 ([#1156](https://github.com/DanySK/gradle-kotlin-qa/issues/1156)) ([a790f81](https://github.com/DanySK/gradle-kotlin-qa/commit/a790f81b4743bffce9216fb8ba72cada30a3a1c0))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.5 ([#1157](https://github.com/DanySK/gradle-kotlin-qa/issues/1157)) ([a5045ae](https://github.com/DanySK/gradle-kotlin-qa/commit/a5045ae2a680f23d4dadd979a0326baad9b2dad7))
* use `.` as build metadata separator ([7c63b91](https://github.com/DanySK/gradle-kotlin-qa/commit/7c63b911d14a67f3ac74944f9f0d96ed2a652d28))

## [0.93.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.93.2...0.93.3) (2025-08-16)

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.93.2 ([#1148](https://github.com/DanySK/gradle-kotlin-qa/issues/1148)) ([562964f](https://github.com/DanySK/gradle-kotlin-qa/commit/562964f87e6f8483b89656b879184404ff50052e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.30 ([#1149](https://github.com/DanySK/gradle-kotlin-qa/issues/1149)) ([8eedd78](https://github.com/DanySK/gradle-kotlin-qa/commit/8eedd78f0e991872d294ca99471bcb2fefd4eaad))

### Bug Fixes

* drop the manual plugin variant construction ([d7d6887](https://github.com/DanySK/gradle-kotlin-qa/commit/d7d6887b15bf26aeab789fd15e86e8044de2ff32))

## [0.93.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.93.1...0.93.2) (2025-08-16)

### Dependency updates

* **core-deps:** update dependency gradle to v9 ([69fbd88](https://github.com/DanySK/gradle-kotlin-qa/commit/69fbd8887d763dfdf5fbf8eb0bc9aa118df7632d))
* **deps:** update plugin gitsemver to v6.0.1 ([#1147](https://github.com/DanySK/gradle-kotlin-qa/issues/1147)) ([c69dd1b](https://github.com/DanySK/gradle-kotlin-qa/commit/c69dd1b0e093c6e60b6a7eaec43474ee216f45e8))
* **deps:** update plugin kotlin-qa to v0.93.1 ([#1143](https://github.com/DanySK/gradle-kotlin-qa/issues/1143)) ([281b543](https://github.com/DanySK/gradle-kotlin-qa/commit/281b5436bf8b49da10b7642ef62e5b2b05529aea))
* **deps:** update plugin multijvmtesting to v4.0.3 ([#1145](https://github.com/DanySK/gradle-kotlin-qa/issues/1145)) ([8897391](https://github.com/DanySK/gradle-kotlin-qa/commit/8897391bf7e4eb8081df3bcfcc2f8302d4a07408))
* **deps:** update plugin multijvmtesting to v4.1.0 ([#1146](https://github.com/DanySK/gradle-kotlin-qa/issues/1146)) ([eebef02](https://github.com/DanySK/gradle-kotlin-qa/commit/eebef025ab8de8b3b787e54d3367e69fe2be6849))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.29 ([#1144](https://github.com/DanySK/gradle-kotlin-qa/issues/1144)) ([151a50d](https://github.com/DanySK/gradle-kotlin-qa/commit/151a50dd3ac961a52dcdb1d57b8bc170e91306e8))
* **deps:** update plugin publishoncentral to v9.1.3 ([#1140](https://github.com/DanySK/gradle-kotlin-qa/issues/1140)) ([bed9132](https://github.com/DanySK/gradle-kotlin-qa/commit/bed9132b454978c2c827cf42ecbde0b8b03b154e))

## [0.93.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.93.0...0.93.1) (2025-08-14)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.2.10 ([#1141](https://github.com/DanySK/gradle-kotlin-qa/issues/1141)) ([a094207](https://github.com/DanySK/gradle-kotlin-qa/commit/a09420775c84477d8e6fc294cd89586a50507f40))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.139 ([#1130](https://github.com/DanySK/gradle-kotlin-qa/issues/1130)) ([4df7e65](https://github.com/DanySK/gradle-kotlin-qa/commit/4df7e65332e6c6415be9933760fab188b2b2055a))
* **deps:** update node.js to 22.18 ([#1128](https://github.com/DanySK/gradle-kotlin-qa/issues/1128)) ([09b52ae](https://github.com/DanySK/gradle-kotlin-qa/commit/09b52ae4ca68f238788b6d68ce01033e565f85ec))
* **deps:** update plugin gitsemver to v5.1.8 ([#1138](https://github.com/DanySK/gradle-kotlin-qa/issues/1138)) ([b373d90](https://github.com/DanySK/gradle-kotlin-qa/commit/b373d90950a12370054d80e155c0f858ad058562))
* **deps:** update plugin gitsemver to v6 ([#1139](https://github.com/DanySK/gradle-kotlin-qa/issues/1139)) ([a21518f](https://github.com/DanySK/gradle-kotlin-qa/commit/a21518fd5255f7532c95842ce763d7b678689724))
* **deps:** update plugin kotlin-qa to v0.93.0 ([#1126](https://github.com/DanySK/gradle-kotlin-qa/issues/1126)) ([7f03c3d](https://github.com/DanySK/gradle-kotlin-qa/commit/7f03c3dfb9827fccda178736bbac8c6dbab2ae37))
* **deps:** update plugin multijvmtesting to v3.6.1 ([#1132](https://github.com/DanySK/gradle-kotlin-qa/issues/1132)) ([cc1cd04](https://github.com/DanySK/gradle-kotlin-qa/commit/cc1cd0486ecb5743274fc5ba7aae73715b3cd9d5))
* **deps:** update plugin multijvmtesting to v4 ([#1133](https://github.com/DanySK/gradle-kotlin-qa/issues/1133)) ([5ad053f](https://github.com/DanySK/gradle-kotlin-qa/commit/5ad053f59baea1c679d378c6029045dc84a5cad0))
* **deps:** update plugin multijvmtesting to v4.0.2 ([#1142](https://github.com/DanySK/gradle-kotlin-qa/issues/1142)) ([218e9ab](https://github.com/DanySK/gradle-kotlin-qa/commit/218e9ab82f41b179eccdfdfa0169fbd2b4913f7f))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.3.0 ([#1134](https://github.com/DanySK/gradle-kotlin-qa/issues/1134)) ([eb887d3](https://github.com/DanySK/gradle-kotlin-qa/commit/eb887d32aaf14291cef55a629d467e42fe9022c0))
* **deps:** update actions/checkout action to v5 ([#1135](https://github.com/DanySK/gradle-kotlin-qa/issues/1135)) ([e389698](https://github.com/DanySK/gradle-kotlin-qa/commit/e38969871d340fb770e54042101bf4c6afd62f48))
* **deps:** update danysk/action-checkout action to v0.2.23 ([#1136](https://github.com/DanySK/gradle-kotlin-qa/issues/1136)) ([85c1fc1](https://github.com/DanySK/gradle-kotlin-qa/commit/85c1fc1330af25347c7bcb5111d2fb70e335050c))
* **deps:** update danysk/action-checkout action to v0.2.24 ([#1137](https://github.com/DanySK/gradle-kotlin-qa/issues/1137)) ([c69aff4](https://github.com/DanySK/gradle-kotlin-qa/commit/c69aff478fa4deec1ac4436be0f0f6b3300e2d88))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.2 ([#1129](https://github.com/DanySK/gradle-kotlin-qa/issues/1129)) ([fdf7206](https://github.com/DanySK/gradle-kotlin-qa/commit/fdf720634a58fdf296acddf39e3a5486bbd973ef))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.3 ([#1131](https://github.com/DanySK/gradle-kotlin-qa/issues/1131)) ([b267c0b](https://github.com/DanySK/gradle-kotlin-qa/commit/b267c0bcc9dca2a869f90d38fd9790d7671d464b))

## [0.93.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.92.0...0.93.0) (2025-07-29)

### Features

* **detekt:** auto-detect the jvmTarget from the Kotlin plugin or fall back to 1.8 ([#1124](https://github.com/DanySK/gradle-kotlin-qa/issues/1124)) ([daf8b17](https://github.com/DanySK/gradle-kotlin-qa/commit/daf8b171a205e70ab70e6b24806879768194e144))

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.92.0 ([#1121](https://github.com/DanySK/gradle-kotlin-qa/issues/1121)) ([0409094](https://github.com/DanySK/gradle-kotlin-qa/commit/0409094558ae9544b4262b5959ae1e051b361cd6))
* **deps:** update plugin publishoncentral to v9.1.0 ([#1123](https://github.com/DanySK/gradle-kotlin-qa/issues/1123)) ([d242244](https://github.com/DanySK/gradle-kotlin-qa/commit/d242244922875b32eb35758974972e8dd08f062b))

### Build and continuous integration

* replace `create` with `register` ([#1122](https://github.com/DanySK/gradle-kotlin-qa/issues/1122)) ([845b94a](https://github.com/DanySK/gradle-kotlin-qa/commit/845b94a0848f86cd82e1a76b5c1d643e6bace8dd))

### Style improvements

* update the editorconfig ([#1125](https://github.com/DanySK/gradle-kotlin-qa/issues/1125)) ([190ab94](https://github.com/DanySK/gradle-kotlin-qa/commit/190ab9484e6087110a3c974b13e4ae9161e8064a))

## [0.92.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.91.0...0.92.0) (2025-07-25)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.7.1 ([#1115](https://github.com/DanySK/gradle-kotlin-qa/issues/1115)) ([3ea9869](https://github.com/DanySK/gradle-kotlin-qa/commit/3ea986984cc21f6732997c0048d242362e7f4cf4))
* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.16.0 ([#1120](https://github.com/DanySK/gradle-kotlin-qa/issues/1120)) ([5d344f9](https://github.com/DanySK/gradle-kotlin-qa/commit/5d344f9df91e67b372eda5de8d1f6cbf7a1a8be2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.137 ([#1117](https://github.com/DanySK/gradle-kotlin-qa/issues/1117)) ([46154d3](https://github.com/DanySK/gradle-kotlin-qa/commit/46154d333d65bcd2dd57b598d31d1fe64b73c55d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.138 ([#1118](https://github.com/DanySK/gradle-kotlin-qa/issues/1118)) ([5e2a810](https://github.com/DanySK/gradle-kotlin-qa/commit/5e2a81007cc0a0dedf8d766f00fcb1f508b655cf))
* **deps:** update plugin com.gradle.develocity to v4.1 ([#1116](https://github.com/DanySK/gradle-kotlin-qa/issues/1116)) ([731f5b8](https://github.com/DanySK/gradle-kotlin-qa/commit/731f5b845269a0b130a763d9f392635e590d5da4))
* **deps:** update plugin kotlin-qa to v0.91.0 ([#1112](https://github.com/DanySK/gradle-kotlin-qa/issues/1112)) ([8b97178](https://github.com/DanySK/gradle-kotlin-qa/commit/8b971787993d347f2922e89c14d4a46ddd550e53))
* **deps:** update plugin multijvmtesting to v3.6.0 ([#1119](https://github.com/DanySK/gradle-kotlin-qa/issues/1119)) ([9fe1f98](https://github.com/DanySK/gradle-kotlin-qa/commit/9fe1f98f1d8c106f9fedf1a9be42517682821fad))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.28 ([#1113](https://github.com/DanySK/gradle-kotlin-qa/issues/1113)) ([f1f3a36](https://github.com/DanySK/gradle-kotlin-qa/commit/f1f3a36bb38e15d3651f0874ce371902149fae98))
* **deps:** update plugin publishoncentral to v9.0.8 ([#1114](https://github.com/DanySK/gradle-kotlin-qa/issues/1114)) ([34db53d](https://github.com/DanySK/gradle-kotlin-qa/commit/34db53d7aadfe103392508c22e8fec23556ff7e5))

## [0.91.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.90.2...0.91.0) (2025-07-08)

### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v13 ([#1111](https://github.com/DanySK/gradle-kotlin-qa/issues/1111)) ([a0cd715](https://github.com/DanySK/gradle-kotlin-qa/commit/a0cd715c0d3ea725e72514796d3b6c18a830016f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.136 ([#1110](https://github.com/DanySK/gradle-kotlin-qa/issues/1110)) ([573c606](https://github.com/DanySK/gradle-kotlin-qa/commit/573c6064b20a51c428a0bd22876a3438b86392b6))
* **deps:** update plugin gitsemver to v5.1.7 ([#1106](https://github.com/DanySK/gradle-kotlin-qa/issues/1106)) ([9805c5f](https://github.com/DanySK/gradle-kotlin-qa/commit/9805c5faec342779bcf8f267fb48349918b79037))
* **deps:** update plugin kotlin-qa to v0.90.2 ([#1108](https://github.com/DanySK/gradle-kotlin-qa/issues/1108)) ([099fff7](https://github.com/DanySK/gradle-kotlin-qa/commit/099fff754c378df627fa5fddd137b057b3378688))
* **deps:** update plugin multijvmtesting to v3.5.4 ([#1107](https://github.com/DanySK/gradle-kotlin-qa/issues/1107)) ([b953d8a](https://github.com/DanySK/gradle-kotlin-qa/commit/b953d8a2b9358a59e49a9d4411437e1471f204f0))
* **deps:** update plugin publishoncentral to v9.0.7 ([#1109](https://github.com/DanySK/gradle-kotlin-qa/issues/1109)) ([7965941](https://github.com/DanySK/gradle-kotlin-qa/commit/7965941125645e2080984967a9083a95132d29c4))

## [0.90.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.90.1...0.90.2) (2025-07-04)

### Dependency updates

* **core-deps:** update dependency gradle to v8.14.3 ([#1105](https://github.com/DanySK/gradle-kotlin-qa/issues/1105)) ([72fc999](https://github.com/DanySK/gradle-kotlin-qa/commit/72fc999d5caf5f3ecb639480b1af7b0d07ea6a9e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.134 ([#1101](https://github.com/DanySK/gradle-kotlin-qa/issues/1101)) ([a0599ab](https://github.com/DanySK/gradle-kotlin-qa/commit/a0599ab2c49bba97dc677cdc71a124c7a36a8721))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.135 ([#1104](https://github.com/DanySK/gradle-kotlin-qa/issues/1104)) ([7a6c698](https://github.com/DanySK/gradle-kotlin-qa/commit/7a6c6980b9eaa2ecfea7abb565a9ecc4b9c8cb09))
* **deps:** update plugin gitsemver to v5.1.5 ([#1099](https://github.com/DanySK/gradle-kotlin-qa/issues/1099)) ([4847223](https://github.com/DanySK/gradle-kotlin-qa/commit/4847223429841c1187710d3adf68f39da6e6d588))
* **deps:** update plugin gitsemver to v5.1.6 ([#1102](https://github.com/DanySK/gradle-kotlin-qa/issues/1102)) ([19f6a51](https://github.com/DanySK/gradle-kotlin-qa/commit/19f6a514b1834471c28c7bfd8fd51b3d36771932))
* **deps:** update plugin kotlin-qa to v0.90.1 ([#1100](https://github.com/DanySK/gradle-kotlin-qa/issues/1100)) ([d32b0d2](https://github.com/DanySK/gradle-kotlin-qa/commit/d32b0d2461cc89b9290958ce6a03f95275e04532))
* **deps:** update plugin multijvmtesting to v3.5.3 ([#1103](https://github.com/DanySK/gradle-kotlin-qa/issues/1103)) ([33189e4](https://github.com/DanySK/gradle-kotlin-qa/commit/33189e47aa381d306e344f37678f36ddf76ed80b))

## [0.90.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.90.0...0.90.1) (2025-06-29)

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.90.0 ([#1098](https://github.com/DanySK/gradle-kotlin-qa/issues/1098)) ([64942a9](https://github.com/DanySK/gradle-kotlin-qa/commit/64942a9a5ac269159a37e37e797d08b1472ac4c1))

### Bug Fixes

* **release:** switch to Maven Central Portal ([bf37ffe](https://github.com/DanySK/gradle-kotlin-qa/commit/bf37ffea64452fbfa0001fdfa3a4dd52b647d516))

## [0.90.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.89.2...0.90.0) (2025-06-27)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.15.0 ([#1097](https://github.com/DanySK/gradle-kotlin-qa/issues/1097)) ([f7c14d5](https://github.com/DanySK/gradle-kotlin-qa/commit/f7c14d54f5f8058cda255a3e49c39523f53a6c82))
* **deps:** update node.js to 22.17 ([#1096](https://github.com/DanySK/gradle-kotlin-qa/issues/1096)) ([7f70c15](https://github.com/DanySK/gradle-kotlin-qa/commit/7f70c15cb3f7c52d3fadb1dc1f1d8bdc7afbc342))
* **deps:** update plugin kotlin-qa to v0.89.2 ([#1093](https://github.com/DanySK/gradle-kotlin-qa/issues/1093)) ([d460fb2](https://github.com/DanySK/gradle-kotlin-qa/commit/d460fb2b42812d11637b7440e2c4f23e8793c4a1))
* **deps:** update plugin multijvmtesting to v3.5.2 ([#1094](https://github.com/DanySK/gradle-kotlin-qa/issues/1094)) ([67aaf0c](https://github.com/DanySK/gradle-kotlin-qa/commit/67aaf0c2d42f02ad20c39d378802e723a78e7ba3))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.27 ([#1095](https://github.com/DanySK/gradle-kotlin-qa/issues/1095)) ([b5a9547](https://github.com/DanySK/gradle-kotlin-qa/commit/b5a9547b483f11e02d9f22f1b7ee9d54b8bbb4f5))

## [0.89.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.89.1...0.89.2) (2025-06-23)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.2.0 ([#1092](https://github.com/DanySK/gradle-kotlin-qa/issues/1092)) ([f0b35dd](https://github.com/DanySK/gradle-kotlin-qa/commit/f0b35dd35b8078e8f9709edbef32ca496d344f26))
* **deps:** update plugin kotlin-qa to v0.89.1 ([#1086](https://github.com/DanySK/gradle-kotlin-qa/issues/1086)) ([c99191f](https://github.com/DanySK/gradle-kotlin-qa/commit/c99191f59dbd8c0a1c955e8a0f5a44b176198504))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.26 ([#1087](https://github.com/DanySK/gradle-kotlin-qa/issues/1087)) ([68939d1](https://github.com/DanySK/gradle-kotlin-qa/commit/68939d1ede8de90538d19398d26600a4ad1a1201))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v4 ([#1088](https://github.com/DanySK/gradle-kotlin-qa/issues/1088)) ([68c7b6c](https://github.com/DanySK/gradle-kotlin-qa/commit/68c7b6c2a5c77b6cfc7114b0bcca6dc4a4f62ac2))
* **deps:** update danysk/build-check-deploy-gradle-action action to v4.0.1 ([#1090](https://github.com/DanySK/gradle-kotlin-qa/issues/1090)) ([f43ebeb](https://github.com/DanySK/gradle-kotlin-qa/commit/f43ebebe1f219503e59e683e69db4aeaae1610e2))

## [0.89.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.89.0...0.89.1) (2025-06-07)

### Dependency updates

* **core-deps:** update dependency gradle to v8.14.2 ([#1083](https://github.com/DanySK/gradle-kotlin-qa/issues/1083)) ([504d0f5](https://github.com/DanySK/gradle-kotlin-qa/commit/504d0f57192424de0192ff807b20b6fb5f33396a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.133 ([#1082](https://github.com/DanySK/gradle-kotlin-qa/issues/1082)) ([c4cc487](https://github.com/DanySK/gradle-kotlin-qa/commit/c4cc487d30abacd9bb24026b73409930bf8247f7))
* **deps:** update plugin gitsemver to v5.1.4 ([#1084](https://github.com/DanySK/gradle-kotlin-qa/issues/1084)) ([922e3e3](https://github.com/DanySK/gradle-kotlin-qa/commit/922e3e3f37a5109a80ccf13336e649cc8bed10b0))
* **deps:** update plugin kotlin-qa to v0.89.0 ([#1081](https://github.com/DanySK/gradle-kotlin-qa/issues/1081)) ([5cdee3f](https://github.com/DanySK/gradle-kotlin-qa/commit/5cdee3f0eb41e0c6e37cddbabf8af33a8929193d))
* **deps:** update plugin multijvmtesting to v3.5.1 ([#1085](https://github.com/DanySK/gradle-kotlin-qa/issues/1085)) ([d5367f4](https://github.com/DanySK/gradle-kotlin-qa/commit/d5367f497b4e88baa6d5614e13542687583f3eb4))

## [0.89.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.88.0...0.89.0) (2025-05-30)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.14.0 ([#1080](https://github.com/DanySK/gradle-kotlin-qa/issues/1080)) ([273fdf6](https://github.com/DanySK/gradle-kotlin-qa/commit/273fdf6d2489fa39ae0ebe87ef3185189d715b63))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.129 ([#1071](https://github.com/DanySK/gradle-kotlin-qa/issues/1071)) ([f485cd0](https://github.com/DanySK/gradle-kotlin-qa/commit/f485cd0ba080815af45b6c1922db5dd313b0d3c5))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.130 ([#1075](https://github.com/DanySK/gradle-kotlin-qa/issues/1075)) ([9304b0b](https://github.com/DanySK/gradle-kotlin-qa/commit/9304b0ba056991ef5b1023c1987d2fc46513e0b6))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.131 ([#1076](https://github.com/DanySK/gradle-kotlin-qa/issues/1076)) ([0b7b85a](https://github.com/DanySK/gradle-kotlin-qa/commit/0b7b85aa3bf406e27dcc6c4008e382b4fe9f5897))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.132 ([#1079](https://github.com/DanySK/gradle-kotlin-qa/issues/1079)) ([4b3b19c](https://github.com/DanySK/gradle-kotlin-qa/commit/4b3b19c01222426651b6f1b127b06b7ca3e4af90))
* **deps:** update node.js to 22.16 ([#1073](https://github.com/DanySK/gradle-kotlin-qa/issues/1073)) ([e5869c7](https://github.com/DanySK/gradle-kotlin-qa/commit/e5869c7b2463bd9d8e4fcf8bf16c5d8c8e0120e3))
* **deps:** update plugin com.gradle.develocity to v4.0.2 ([#1077](https://github.com/DanySK/gradle-kotlin-qa/issues/1077)) ([abbe026](https://github.com/DanySK/gradle-kotlin-qa/commit/abbe026da3e25e170d57b9cabb3788863bda4de5))
* **deps:** update plugin kotlin-qa to v0.88.0 ([#1074](https://github.com/DanySK/gradle-kotlin-qa/issues/1074)) ([4f4385c](https://github.com/DanySK/gradle-kotlin-qa/commit/4f4385ceee09f7678f34688126c55f48fea7cae4))
* **deps:** update plugin multijvmtesting to v3.5.0 ([#1078](https://github.com/DanySK/gradle-kotlin-qa/issues/1078)) ([266ceab](https://github.com/DanySK/gradle-kotlin-qa/commit/266ceaba5576aba29130503c95826b363a8ed826))

## [0.88.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.87.1...0.88.0) (2025-05-23)

### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12.3.0 ([#1072](https://github.com/DanySK/gradle-kotlin-qa/issues/1072)) ([ec1a503](https://github.com/DanySK/gradle-kotlin-qa/commit/ec1a503453cea01dcf3d9ca4a4588d1dd9715e7c))
* **deps:** update plugin kotlin-qa to v0.87.1 ([#1069](https://github.com/DanySK/gradle-kotlin-qa/issues/1069)) ([1f9ccca](https://github.com/DanySK/gradle-kotlin-qa/commit/1f9cccaf7b24c46dad7a47d231fd6d0b760f061e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.25 ([#1070](https://github.com/DanySK/gradle-kotlin-qa/issues/1070)) ([26beb1b](https://github.com/DanySK/gradle-kotlin-qa/commit/26beb1b4ab4e993eae94eea0fda4d8fa1ebf3032))

## [0.87.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.87.0...0.87.1) (2025-05-22)

### Dependency updates

* **core-deps:** update dependency gradle to v8.14.1 ([#1067](https://github.com/DanySK/gradle-kotlin-qa/issues/1067)) ([62550a9](https://github.com/DanySK/gradle-kotlin-qa/commit/62550a94be89622ea84ea2c92d5ac61c25cb720a))
* **deps:** update plugin kotlin-qa to v0.87.0 ([#1066](https://github.com/DanySK/gradle-kotlin-qa/issues/1066)) ([4be5908](https://github.com/DanySK/gradle-kotlin-qa/commit/4be59087d93daa44be3ef247980c9d566a30b22b))
* **deps:** update plugin multijvmtesting to v3.4.3 ([#1068](https://github.com/DanySK/gradle-kotlin-qa/issues/1068)) ([7fb1de9](https://github.com/DanySK/gradle-kotlin-qa/commit/7fb1de9e3bdcf31825550122543754ead5a69670))

## [0.87.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.86.2...0.87.0) (2025-05-19)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.6.0 ([#1064](https://github.com/DanySK/gradle-kotlin-qa/issues/1064)) ([ee29e68](https://github.com/DanySK/gradle-kotlin-qa/commit/ee29e6857a235bb456a797c89d2f6cd70b014b05))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.128 ([#1061](https://github.com/DanySK/gradle-kotlin-qa/issues/1061)) ([92cffa9](https://github.com/DanySK/gradle-kotlin-qa/commit/92cffa9095da3392b849b759bfb9e2c14d684c74))
* **deps:** update plugin gitsemver to v5.1.3 ([#1057](https://github.com/DanySK/gradle-kotlin-qa/issues/1057)) ([9142022](https://github.com/DanySK/gradle-kotlin-qa/commit/9142022bbab95a5c0fa3172951070143cb66bec1))
* **deps:** update plugin kotlin-qa to v0.86.2 ([#1058](https://github.com/DanySK/gradle-kotlin-qa/issues/1058)) ([7a318da](https://github.com/DanySK/gradle-kotlin-qa/commit/7a318da80ee1a3a00b648d47c437ea58f702878a))
* **deps:** update plugin multijvmtesting to v3.4.2 ([#1059](https://github.com/DanySK/gradle-kotlin-qa/issues/1059)) ([7f2bf3a](https://github.com/DanySK/gradle-kotlin-qa/commit/7f2bf3a8a110993fe2da8ec0c3d38a413826a864))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.24 ([#1060](https://github.com/DanySK/gradle-kotlin-qa/issues/1060)) ([dda7696](https://github.com/DanySK/gradle-kotlin-qa/commit/dda7696e03696efe8c1b4b9e36be45d1e26278bb))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v1 ([#1065](https://github.com/DanySK/gradle-kotlin-qa/issues/1065)) ([265aa78](https://github.com/DanySK/gradle-kotlin-qa/commit/265aa78157577480f248464e846e12c102933890))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.19 ([#1062](https://github.com/DanySK/gradle-kotlin-qa/issues/1062)) ([5cf3098](https://github.com/DanySK/gradle-kotlin-qa/commit/5cf30989538e36a0736a2cfb265116b55dea1562))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.20 ([#1063](https://github.com/DanySK/gradle-kotlin-qa/issues/1063)) ([105a8a7](https://github.com/DanySK/gradle-kotlin-qa/commit/105a8a77af3df66f9324612c56d7726fc0ead22f))

## [0.86.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.86.1...0.86.2) (2025-05-13)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.1.21 ([#1056](https://github.com/DanySK/gradle-kotlin-qa/issues/1056)) ([3ce0c6f](https://github.com/DanySK/gradle-kotlin-qa/commit/3ce0c6fe7beb370489f08dd3e37b98a4a042dfc9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.126 ([#1052](https://github.com/DanySK/gradle-kotlin-qa/issues/1052)) ([f3b283d](https://github.com/DanySK/gradle-kotlin-qa/commit/f3b283dd2dd190110f8f24c4abd27258fffbf560))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.127 ([#1053](https://github.com/DanySK/gradle-kotlin-qa/issues/1053)) ([5e3c460](https://github.com/DanySK/gradle-kotlin-qa/commit/5e3c4601119cf57901a63b38808da8d7c085837d))
* **deps:** update plugin com.gradle.develocity to v4.0.1 ([#1049](https://github.com/DanySK/gradle-kotlin-qa/issues/1049)) ([75624f3](https://github.com/DanySK/gradle-kotlin-qa/commit/75624f371e1f721e0bfe3e8217a10999e379d437))
* **deps:** update plugin gitsemver to v5.1.2 ([#1046](https://github.com/DanySK/gradle-kotlin-qa/issues/1046)) ([ebe091c](https://github.com/DanySK/gradle-kotlin-qa/commit/ebe091c91c1936be7fdd26a40ba7e0598d2e7042))
* **deps:** update plugin kotlin-qa to v0.86.1 ([#1050](https://github.com/DanySK/gradle-kotlin-qa/issues/1050)) ([fe5fbd7](https://github.com/DanySK/gradle-kotlin-qa/commit/fe5fbd76b00d8e43d9266ea4c9201078b23d21de))
* **deps:** update plugin multijvmtesting to v3.4.1 ([#1047](https://github.com/DanySK/gradle-kotlin-qa/issues/1047)) ([382427c](https://github.com/DanySK/gradle-kotlin-qa/commit/382427cd58058debb6c5e3da93fc1482757adfa7))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.23 ([#1051](https://github.com/DanySK/gradle-kotlin-qa/issues/1051)) ([33a2a90](https://github.com/DanySK/gradle-kotlin-qa/commit/33a2a90f0453e1d6ef87b19a19bdd8662cd981a9))
* **deps:** update plugin publishoncentral to v8.0.7 ([#1054](https://github.com/DanySK/gradle-kotlin-qa/issues/1054)) ([35c4a08](https://github.com/DanySK/gradle-kotlin-qa/commit/35c4a08b5ceb51c7d6245078862cd24b71c04a5e))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.18 ([#1055](https://github.com/DanySK/gradle-kotlin-qa/issues/1055)) ([f4d69d0](https://github.com/DanySK/gradle-kotlin-qa/commit/f4d69d0c6caa8983f95485dd547845a6b9fcd9bc))

## [0.86.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.86.0...0.86.1) (2025-04-25)

### Dependency updates

* **core-deps:** update dependency gradle to v8.14 ([#1045](https://github.com/DanySK/gradle-kotlin-qa/issues/1045)) ([b746da5](https://github.com/DanySK/gradle-kotlin-qa/commit/b746da5620a1cc81b18eed6a2e4845a525a04146))
* **deps:** update plugin kotlin-qa to v0.86.0 ([#1048](https://github.com/DanySK/gradle-kotlin-qa/issues/1048)) ([95dc536](https://github.com/DanySK/gradle-kotlin-qa/commit/95dc536c9ee716c14a72d5627570113a360b909e))

## [0.86.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.85.0...0.86.0) (2025-04-25)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.13.0 ([#1044](https://github.com/DanySK/gradle-kotlin-qa/issues/1044)) ([2ebd7ef](https://github.com/DanySK/gradle-kotlin-qa/commit/2ebd7ef6ab198b183b6cac38e5a33147b0442389))
* **deps:** update jacoco to v0.8.13 ([#1032](https://github.com/DanySK/gradle-kotlin-qa/issues/1032)) ([307ddcf](https://github.com/DanySK/gradle-kotlin-qa/commit/307ddcfb0cb1baf46ce08bdcdf4ff3406087b11a))
* **deps:** update node.js to 22.15 ([#1043](https://github.com/DanySK/gradle-kotlin-qa/issues/1043)) ([b45a36f](https://github.com/DanySK/gradle-kotlin-qa/commit/b45a36f9b2103bc7576b6caa7e7584e402fb73ad))
* **deps:** update plugin com.gradle.develocity to v4 ([#1034](https://github.com/DanySK/gradle-kotlin-qa/issues/1034)) ([2eb3328](https://github.com/DanySK/gradle-kotlin-qa/commit/2eb3328ddb0cdab5513f21e3fb3692a673564a5d))
* **deps:** update plugin gitsemver to v5 ([#1040](https://github.com/DanySK/gradle-kotlin-qa/issues/1040)) ([f461e05](https://github.com/DanySK/gradle-kotlin-qa/commit/f461e0566e9063929bfc0e5e6d3f8d06d5af147e))
* **deps:** update plugin kotlin-qa to v0.85.0 ([#1031](https://github.com/DanySK/gradle-kotlin-qa/issues/1031)) ([10e7c67](https://github.com/DanySK/gradle-kotlin-qa/commit/10e7c67f55fcb29e944816e5dfb00b18c261fc59))
* **deps:** update plugin multijvmtesting to v3.4.0 ([#1042](https://github.com/DanySK/gradle-kotlin-qa/issues/1042)) ([8a4e38f](https://github.com/DanySK/gradle-kotlin-qa/commit/8a4e38f1909437332cff19139f4d2a3df077cee5))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.10.0 ([#1038](https://github.com/DanySK/gradle-kotlin-qa/issues/1038)) ([e0b304c](https://github.com/DanySK/gradle-kotlin-qa/commit/e0b304cb501e7cab10dceebb1f0cc6cdb0d9458f))
* **deps:** update plugin publishoncentral to v8.0.6 ([#1033](https://github.com/DanySK/gradle-kotlin-qa/issues/1033)) ([445ea1a](https://github.com/DanySK/gradle-kotlin-qa/commit/445ea1a5b7a523ff6980bc865bc121fde0374344))

### Build and continuous integration

* **deps:** update actions/setup-node action to v4.4.0 ([#1039](https://github.com/DanySK/gradle-kotlin-qa/issues/1039)) ([981ba3e](https://github.com/DanySK/gradle-kotlin-qa/commit/981ba3e7976fb8049a22b2f030270618c11c47f2))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.15 ([#1035](https://github.com/DanySK/gradle-kotlin-qa/issues/1035)) ([88123c4](https://github.com/DanySK/gradle-kotlin-qa/commit/88123c41fd3c8e1e5bdf405902fbd577bf26e2e7))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.16 ([#1037](https://github.com/DanySK/gradle-kotlin-qa/issues/1037)) ([80dcbda](https://github.com/DanySK/gradle-kotlin-qa/commit/80dcbdab711177058448c6e4ae9efa763cb7c353))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.17 ([#1041](https://github.com/DanySK/gradle-kotlin-qa/issues/1041)) ([f87d6d7](https://github.com/DanySK/gradle-kotlin-qa/commit/f87d6d7aee5fe283e2cd8e87e7453f787c226f90))
* **deps:** update dependency windows github actions runner to v2025 ([#1036](https://github.com/DanySK/gradle-kotlin-qa/issues/1036)) ([2d847f5](https://github.com/DanySK/gradle-kotlin-qa/commit/2d847f590f2d63ad7d88f6d03e332fa7c7af40fd))

## [0.85.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.84.1...0.85.0) (2025-03-28)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.12.0 ([#1030](https://github.com/DanySK/gradle-kotlin-qa/issues/1030)) ([d049b07](https://github.com/DanySK/gradle-kotlin-qa/commit/d049b0736b84a29608c79cb83b8dfb08529c9334))
* **deps:** update plugin kotlin-qa to v0.81.1 ([#1025](https://github.com/DanySK/gradle-kotlin-qa/issues/1025)) ([469f84e](https://github.com/DanySK/gradle-kotlin-qa/commit/469f84e22211d342fc594743d199bbb66b806a1b))
* **deps:** update plugin kotlin-qa to v0.82.0 ([#1026](https://github.com/DanySK/gradle-kotlin-qa/issues/1026)) ([800d6c7](https://github.com/DanySK/gradle-kotlin-qa/commit/800d6c745fe9fe01fcb49d2fe081c963e360be58))
* **deps:** update plugin kotlin-qa to v0.83.1 ([#1027](https://github.com/DanySK/gradle-kotlin-qa/issues/1027)) ([19e249f](https://github.com/DanySK/gradle-kotlin-qa/commit/19e249fd828bd8467eb2dd4dcf49b59e6b58442d))
* **deps:** update plugin kotlin-qa to v0.84.1 ([#1028](https://github.com/DanySK/gradle-kotlin-qa/issues/1028)) ([717dad1](https://github.com/DanySK/gradle-kotlin-qa/commit/717dad14eb24d58b826e0907a71b206d569d98c1))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.14 ([#1029](https://github.com/DanySK/gradle-kotlin-qa/issues/1029)) ([0311abc](https://github.com/DanySK/gradle-kotlin-qa/commit/0311abc0b5d2bec37afc3717370dc458b471b53d))

## [0.84.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.84.0...0.84.1) (2025-03-25)

### Dependency updates

* **deps:** update plugin multijvmtesting to v3.3.0 ([#1021](https://github.com/DanySK/gradle-kotlin-qa/issues/1021)) ([2d70f0d](https://github.com/DanySK/gradle-kotlin-qa/commit/2d70f0d46bed38e8f8fa401e7b44d6eda780b561))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.22 ([#1020](https://github.com/DanySK/gradle-kotlin-qa/issues/1020)) ([e4a3dba](https://github.com/DanySK/gradle-kotlin-qa/commit/e4a3dba9b6239d71f759a73e30c2a44018dac287))
* **deps:** update plugin publishoncentral to v8.0.5 ([#1019](https://github.com/DanySK/gradle-kotlin-qa/issues/1019)) ([b20f755](https://github.com/DanySK/gradle-kotlin-qa/commit/b20f755220f7232ac904306a95ed91ac15729e65))

### Bug Fixes

* **release:** fix the release task name ([f05d251](https://github.com/DanySK/gradle-kotlin-qa/commit/f05d251d03435cccd8b94923dd9376551cd30d6b))

## [0.84.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.83.1...0.84.0) (2025-03-22)

### Features

* ignore standard naming convention for compose functions ([#1018](https://github.com/DanySK/gradle-kotlin-qa/issues/1018)) ([4b4233b](https://github.com/DanySK/gradle-kotlin-qa/commit/4b4233b0ed90cf733e4e39725c80525fcd60d2bb))

### Dependency updates

* **deps:** update plugin multijvmtesting to v3.2.4 ([#1017](https://github.com/DanySK/gradle-kotlin-qa/issues/1017)) ([7f7766c](https://github.com/DanySK/gradle-kotlin-qa/commit/7f7766c1843d66822ab619959b0f2b62ee54c237))

## [0.83.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.83.0...0.83.1) (2025-03-20)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.1.20 ([#1016](https://github.com/DanySK/gradle-kotlin-qa/issues/1016)) ([d066760](https://github.com/DanySK/gradle-kotlin-qa/commit/d066760592f0299843350e7032f05c845f2a1290))
* **deps:** update plugin publishoncentral to v8.0.4 ([#1012](https://github.com/DanySK/gradle-kotlin-qa/issues/1012)) ([fc2c2a7](https://github.com/DanySK/gradle-kotlin-qa/commit/fc2c2a77b90873c4960b8d8382f7f3ff980c7f29))
* **deps:** update plugin tasktree to v4.0.1 ([#1013](https://github.com/DanySK/gradle-kotlin-qa/issues/1013)) ([a8fd68e](https://github.com/DanySK/gradle-kotlin-qa/commit/a8fd68e202c99c541c022bd11952cbd5536beaee))

### Build and continuous integration

* **deps:** update actions/setup-node action to v4.3.0 ([#1014](https://github.com/DanySK/gradle-kotlin-qa/issues/1014)) ([70d49da](https://github.com/DanySK/gradle-kotlin-qa/commit/70d49dafd694a8771664db4ea937e85f5fd4d3fd))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.13 ([#1015](https://github.com/DanySK/gradle-kotlin-qa/issues/1015)) ([ff4a124](https://github.com/DanySK/gradle-kotlin-qa/commit/ff4a1242701d3620281a09e0a5ee4595226589b5))

## [0.83.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.82.0...0.83.0) (2025-02-28)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.11.0 ([#1011](https://github.com/DanySK/gradle-kotlin-qa/issues/1011)) ([dd22f07](https://github.com/DanySK/gradle-kotlin-qa/commit/dd22f0721ce4e602ab4de993434604632f525b80))

## [0.82.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.81.1...0.82.0) (2025-02-27)

### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12.2.0 ([#1010](https://github.com/DanySK/gradle-kotlin-qa/issues/1010)) ([aa329e4](https://github.com/DanySK/gradle-kotlin-qa/commit/aa329e44adcd85d282069ba467badc8291c503d6))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.11 ([#1008](https://github.com/DanySK/gradle-kotlin-qa/issues/1008)) ([a51245c](https://github.com/DanySK/gradle-kotlin-qa/commit/a51245cf1e976d9aed014d13614d83cbbbd40507))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.12 ([#1009](https://github.com/DanySK/gradle-kotlin-qa/issues/1009)) ([13c61d2](https://github.com/DanySK/gradle-kotlin-qa/commit/13c61d2a4e2d2a04abc04306007aeef9c580eff6))

## [0.81.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.81.0...0.81.1) (2025-02-25)

### Dependency updates

* **core-deps:** update dependency gradle to v8.13 ([#1007](https://github.com/DanySK/gradle-kotlin-qa/issues/1007)) ([0995801](https://github.com/DanySK/gradle-kotlin-qa/commit/0995801d4603be21aaef78146390cbd45c54a312))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.125 ([#1004](https://github.com/DanySK/gradle-kotlin-qa/issues/1004)) ([dcfeae0](https://github.com/DanySK/gradle-kotlin-qa/commit/dcfeae09ffc2d6dab29632d169e7389406e9b3ff))
* **deps:** update plugin multijvmtesting to v3.2.3 ([#1005](https://github.com/DanySK/gradle-kotlin-qa/issues/1005)) ([41c4869](https://github.com/DanySK/gradle-kotlin-qa/commit/41c48696da895317f70439639948289be26e1dba))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.21 ([#1006](https://github.com/DanySK/gradle-kotlin-qa/issues/1006)) ([1f0aa6b](https://github.com/DanySK/gradle-kotlin-qa/commit/1f0aa6b54638204574f0ca1ac42681acb55d6edf))

## [0.81.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.80.0...0.81.0) (2025-02-21)

### Dependency updates

* **api-deps:** update dependency io.gitlab.arturbosch.detekt:detekt-gradle-plugin to v1.23.8 ([#1003](https://github.com/DanySK/gradle-kotlin-qa/issues/1003)) ([ae54a15](https://github.com/DanySK/gradle-kotlin-qa/commit/ae54a159b6ddc28a12ca13c914bc8835fe7aca5f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.120 ([#994](https://github.com/DanySK/gradle-kotlin-qa/issues/994)) ([3815ca2](https://github.com/DanySK/gradle-kotlin-qa/commit/3815ca285c35ff746bc67cbe56ac8ac36466561f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.121 ([#995](https://github.com/DanySK/gradle-kotlin-qa/issues/995)) ([c3ef479](https://github.com/DanySK/gradle-kotlin-qa/commit/c3ef4799cea9639975aa0f4011631dd2d628c40c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.122 ([#996](https://github.com/DanySK/gradle-kotlin-qa/issues/996)) ([88d9af5](https://github.com/DanySK/gradle-kotlin-qa/commit/88d9af506616e544caf3976a0ea226fd9457f3af))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.123 ([#998](https://github.com/DanySK/gradle-kotlin-qa/issues/998)) ([7306bf1](https://github.com/DanySK/gradle-kotlin-qa/commit/7306bf1f0ea3ff73eb42ac4da2e243c334530d90))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.124 ([#999](https://github.com/DanySK/gradle-kotlin-qa/issues/999)) ([232dc4b](https://github.com/DanySK/gradle-kotlin-qa/commit/232dc4b5a6edc4ea42af244c55be5337b1b1a68d))
* **deps:** update node.js to 22.14 ([#997](https://github.com/DanySK/gradle-kotlin-qa/issues/997)) ([a866914](https://github.com/DanySK/gradle-kotlin-qa/commit/a866914df6beb40813ee3101c6ddc29e98987e66))
* **deps:** update plugin com.gradle.develocity to v3.19.2 ([#1001](https://github.com/DanySK/gradle-kotlin-qa/issues/1001)) ([ab53433](https://github.com/DanySK/gradle-kotlin-qa/commit/ab5343393a27accc4455e4aaab60a18e950dbd3f))
* **deps:** update plugin publishoncentral to v8.0.3 ([#993](https://github.com/DanySK/gradle-kotlin-qa/issues/993)) ([9a07e5f](https://github.com/DanySK/gradle-kotlin-qa/commit/9a07e5fb455c3ac861bf4891ef722c039ff049c3))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.10 ([#1002](https://github.com/DanySK/gradle-kotlin-qa/issues/1002)) ([f1a1ef1](https://github.com/DanySK/gradle-kotlin-qa/commit/f1a1ef13b67bb68ec44960b110df51d1ae060d46))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.9 ([#1000](https://github.com/DanySK/gradle-kotlin-qa/issues/1000)) ([90b250d](https://github.com/DanySK/gradle-kotlin-qa/commit/90b250d6dd74711394331ff11fe79be4f3bdc6c2))

## [0.80.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.79.2...0.80.0) (2025-01-31)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.10.0 ([#992](https://github.com/DanySK/gradle-kotlin-qa/issues/992)) ([3236d89](https://github.com/DanySK/gradle-kotlin-qa/commit/3236d894ca5dc5eabd713f76189d52c30bef92eb))
* **deps:** update plugin gitsemver to v4 ([#984](https://github.com/DanySK/gradle-kotlin-qa/issues/984)) ([3859a2d](https://github.com/DanySK/gradle-kotlin-qa/commit/3859a2d5f074cad51c6e46e73c59b60bbbc25513))
* **deps:** update plugin gitsemver to v4.0.1 ([#985](https://github.com/DanySK/gradle-kotlin-qa/issues/985)) ([1b10929](https://github.com/DanySK/gradle-kotlin-qa/commit/1b109293712da672b593032fff0440b314357bdf))
* **deps:** update plugin gitsemver to v4.0.2 ([#988](https://github.com/DanySK/gradle-kotlin-qa/issues/988)) ([f70f5df](https://github.com/DanySK/gradle-kotlin-qa/commit/f70f5df38dce8b501c5b0b0d77f9bb1e62097b8d))
* **deps:** update plugin gradlepluginpublish to v1.3.1 ([#990](https://github.com/DanySK/gradle-kotlin-qa/issues/990)) ([521e1a8](https://github.com/DanySK/gradle-kotlin-qa/commit/521e1a8dc7556145bda6ff2bcac16ec8d8a7d2d9))
* **deps:** update plugin multijvmtesting to v3.2.2 ([#986](https://github.com/DanySK/gradle-kotlin-qa/issues/986)) ([b77f063](https://github.com/DanySK/gradle-kotlin-qa/commit/b77f0634c0e59cbc3cdc9931de0978fee2af526d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.20 ([#987](https://github.com/DanySK/gradle-kotlin-qa/issues/987)) ([9e84fd0](https://github.com/DanySK/gradle-kotlin-qa/commit/9e84fd001638b6cfd70c5c58f55f9d82556a1a64))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.7 ([#989](https://github.com/DanySK/gradle-kotlin-qa/issues/989)) ([ad38bc7](https://github.com/DanySK/gradle-kotlin-qa/commit/ad38bc784e07084fcfd8f1edc07744e89e9f579c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.8 ([#991](https://github.com/DanySK/gradle-kotlin-qa/issues/991)) ([bb1551e](https://github.com/DanySK/gradle-kotlin-qa/commit/bb1551e625d76931e9ff133281b082532f0cf87e))

## [0.79.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.79.1...0.79.2) (2025-01-27)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.1.10 ([#982](https://github.com/DanySK/gradle-kotlin-qa/issues/982)) ([59a4b14](https://github.com/DanySK/gradle-kotlin-qa/commit/59a4b14eb6a8cc2920fad1686871a88aff869662))
* **deps:** update plugin gitsemver to v3.1.8 ([#979](https://github.com/DanySK/gradle-kotlin-qa/issues/979)) ([f107ee8](https://github.com/DanySK/gradle-kotlin-qa/commit/f107ee854dd30f1197af5160719bd570efca734d))
* **deps:** update plugin gitsemver to v3.1.9 ([#980](https://github.com/DanySK/gradle-kotlin-qa/issues/980)) ([49f4d19](https://github.com/DanySK/gradle-kotlin-qa/commit/49f4d19d5a8c16bffab747a6f7cecde9f5d39f5f))
* **deps:** update plugin multijvmtesting to v3.2.1 ([#973](https://github.com/DanySK/gradle-kotlin-qa/issues/973)) ([875b461](https://github.com/DanySK/gradle-kotlin-qa/commit/875b46152fcd6affdb6052a75d5838745acbc7fa))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.19 ([#974](https://github.com/DanySK/gradle-kotlin-qa/issues/974)) ([3b536be](https://github.com/DanySK/gradle-kotlin-qa/commit/3b536be4bf027ece324818712d0901c38ba952a3))
* **deps:** update plugin publishoncentral to v8.0.2 ([#976](https://github.com/DanySK/gradle-kotlin-qa/issues/976)) ([d0fd0bc](https://github.com/DanySK/gradle-kotlin-qa/commit/d0fd0bc950c843653980e135219c38c16a1a67bd))

### Build and continuous integration

* **deps:** update actions/setup-node action to v4.2.0 ([#981](https://github.com/DanySK/gradle-kotlin-qa/issues/981)) ([fb34ebe](https://github.com/DanySK/gradle-kotlin-qa/commit/fb34ebe786b09d377d406af7212fea61b97af1a8))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.3 ([#975](https://github.com/DanySK/gradle-kotlin-qa/issues/975)) ([8050b65](https://github.com/DanySK/gradle-kotlin-qa/commit/8050b659ee8327378afa31bfe1c5ca9e8ffcdc32))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.5 ([#977](https://github.com/DanySK/gradle-kotlin-qa/issues/977)) ([0d9e046](https://github.com/DanySK/gradle-kotlin-qa/commit/0d9e04612c4a099f9942f887ea34ade087482e8e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.6 ([#978](https://github.com/DanySK/gradle-kotlin-qa/issues/978)) ([bc944a2](https://github.com/DanySK/gradle-kotlin-qa/commit/bc944a20cfc44ac288192b5da0294c7487a6fd51))

## [0.79.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.79.0...0.79.1) (2025-01-24)

### Dependency updates

* **core-deps:** update dependency gradle to v8.12.1 ([#972](https://github.com/DanySK/gradle-kotlin-qa/issues/972)) ([eec0d10](https://github.com/DanySK/gradle-kotlin-qa/commit/eec0d10688348c2e1be36842151635c8086afb43))
* **deps:** drop mockito ([#961](https://github.com/DanySK/gradle-kotlin-qa/issues/961)) ([9df250b](https://github.com/DanySK/gradle-kotlin-qa/commit/9df250bb730adb5936e4ed5ea1f7afe11d707605))
* **deps:** update dependency org.mockito:mockito-core to v5.15.2 ([#960](https://github.com/DanySK/gradle-kotlin-qa/issues/960)) ([52a1ac2](https://github.com/DanySK/gradle-kotlin-qa/commit/52a1ac2db3a7cfb0ac5ba9561061cd050793093f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#964](https://github.com/DanySK/gradle-kotlin-qa/issues/964)) ([6488ff8](https://github.com/DanySK/gradle-kotlin-qa/commit/6488ff87c522444d173fba9d2552162bd0c3a5fe))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#967](https://github.com/DanySK/gradle-kotlin-qa/issues/967)) ([e461223](https://github.com/DanySK/gradle-kotlin-qa/commit/e4612235965a030351d9ef08ba156202c586b85e))
* **deps:** update node.js to 22.13 ([#962](https://github.com/DanySK/gradle-kotlin-qa/issues/962)) ([0e1ac21](https://github.com/DanySK/gradle-kotlin-qa/commit/0e1ac211ff7caab56a158b8cef6427f845016122))
* **deps:** update plugin com.gradle.develocity to v3.19.1 ([#969](https://github.com/DanySK/gradle-kotlin-qa/issues/969)) ([45c45ee](https://github.com/DanySK/gradle-kotlin-qa/commit/45c45eeadf4928eafef0eee6b91946e0642d41f3))
* **deps:** update plugin multijvmtesting to v3.1.2 ([#959](https://github.com/DanySK/gradle-kotlin-qa/issues/959)) ([3ad0d19](https://github.com/DanySK/gradle-kotlin-qa/commit/3ad0d1965f6062cfd41796abd55cc5d6d39247a8))
* **deps:** update plugin multijvmtesting to v3.2.0 ([#971](https://github.com/DanySK/gradle-kotlin-qa/issues/971)) ([9d65c34](https://github.com/DanySK/gradle-kotlin-qa/commit/9d65c346ea099bdbb0eec6804a8f0504798d34ff))
* **deps:** update plugin publishoncentral to v8 ([#963](https://github.com/DanySK/gradle-kotlin-qa/issues/963)) ([24238df](https://github.com/DanySK/gradle-kotlin-qa/commit/24238dff71394624a0800d3a6c5f4feedca8b64a))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.0 ([#966](https://github.com/DanySK/gradle-kotlin-qa/issues/966)) ([9b9e4e9](https://github.com/DanySK/gradle-kotlin-qa/commit/9b9e4e91ee6e904b2279e54dd758860c724d0b12))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.1 ([#968](https://github.com/DanySK/gradle-kotlin-qa/issues/968)) ([f976474](https://github.com/DanySK/gradle-kotlin-qa/commit/f976474178272e5afe8599f15fae31dd7e1a78dd))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.2 ([#970](https://github.com/DanySK/gradle-kotlin-qa/issues/970)) ([6abcf4e](https://github.com/DanySK/gradle-kotlin-qa/commit/6abcf4eda86c47643bbc617a269167995c80135c))

## [0.79.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.78.3...0.79.0) (2024-12-27)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.9.0 ([#956](https://github.com/DanySK/gradle-kotlin-qa/issues/956)) ([828239a](https://github.com/DanySK/gradle-kotlin-qa/commit/828239a831bd8d05bf617213ea126ad538b6588e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#954](https://github.com/DanySK/gradle-kotlin-qa/issues/954)) ([e9f9220](https://github.com/DanySK/gradle-kotlin-qa/commit/e9f92208d30cd1500018c8044d47cc6bedac9550))
* **deps:** update plugin multijvmtesting to v3.0.2 ([#951](https://github.com/DanySK/gradle-kotlin-qa/issues/951)) ([39760e1](https://github.com/DanySK/gradle-kotlin-qa/commit/39760e14b5fba590f640589421df146bc36c3cdb))
* **deps:** update plugin multijvmtesting to v3.0.3 ([#955](https://github.com/DanySK/gradle-kotlin-qa/issues/955)) ([8ea5a91](https://github.com/DanySK/gradle-kotlin-qa/commit/8ea5a91d3e2b7a66c124e2b7397d345b7a429844))
* **deps:** update plugin multijvmtesting to v3.1.0 ([#957](https://github.com/DanySK/gradle-kotlin-qa/issues/957)) ([d1c414d](https://github.com/DanySK/gradle-kotlin-qa/commit/d1c414d7039795f90a3b569144789cfe5f390c80))
* **deps:** update plugin multijvmtesting to v3.1.1 ([#958](https://github.com/DanySK/gradle-kotlin-qa/issues/958)) ([40fe638](https://github.com/DanySK/gradle-kotlin-qa/commit/40fe638f58054cfe3e290a4d0bdcbc47ccac4d28))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.18 ([#953](https://github.com/DanySK/gradle-kotlin-qa/issues/953)) ([aa6b401](https://github.com/DanySK/gradle-kotlin-qa/commit/aa6b401151df8bc540ea5eb82135f3899dde4169))
* **deps:** update plugin publishoncentral to v7.0.4 ([#952](https://github.com/DanySK/gradle-kotlin-qa/issues/952)) ([2462ec6](https://github.com/DanySK/gradle-kotlin-qa/commit/2462ec67fd797fb13476eaca3a811905c550b54f))

## [0.78.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.78.2...0.78.3) (2024-12-20)

### Dependency updates

* **core-deps:** update dependency gradle to v8.12 ([#950](https://github.com/DanySK/gradle-kotlin-qa/issues/950)) ([4739a09](https://github.com/DanySK/gradle-kotlin-qa/commit/4739a099d81521e6370d3b35fcd5a2d82035daab))
* **deps:** update plugin publishoncentral to v7.0.3 ([#949](https://github.com/DanySK/gradle-kotlin-qa/issues/949)) ([3ad5745](https://github.com/DanySK/gradle-kotlin-qa/commit/3ad574580b0838bbec3f9f74467335abad1c4883))

## [0.78.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.78.1...0.78.2) (2024-12-20)

### Dependency updates

* **deps:** update plugin multijvmtesting to v3.0.1 ([#941](https://github.com/DanySK/gradle-kotlin-qa/issues/941)) ([2b11fb8](https://github.com/DanySK/gradle-kotlin-qa/commit/2b11fb8c2581ba53974b0013d69184c392bc1efb))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.17 ([#942](https://github.com/DanySK/gradle-kotlin-qa/issues/942)) ([91ade93](https://github.com/DanySK/gradle-kotlin-qa/commit/91ade9367634a45667ea7873238b379adfa4a1db))
* **deps:** update plugin publishoncentral to v7.0.1 ([#943](https://github.com/DanySK/gradle-kotlin-qa/issues/943)) ([2cc4293](https://github.com/DanySK/gradle-kotlin-qa/commit/2cc4293fdec2a2c079d0997bf182fd842e867691))
* **deps:** update plugin publishoncentral to v7.0.2 ([#948](https://github.com/DanySK/gradle-kotlin-qa/issues/948)) ([b7448d1](https://github.com/DanySK/gradle-kotlin-qa/commit/b7448d135dd222c17c2e3d3f51b7f6c96129776f))

### Bug Fixes

* solve typo in sarif filename ([e04aa6e](https://github.com/DanySK/gradle-kotlin-qa/commit/e04aa6e986660e56870b2da8506a2602a9d9ead6))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.26 ([#944](https://github.com/DanySK/gradle-kotlin-qa/issues/944)) ([e269e8e](https://github.com/DanySK/gradle-kotlin-qa/commit/e269e8e3e383f3ff546b7fb7b7c255dc2930eedb))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.27 ([#945](https://github.com/DanySK/gradle-kotlin-qa/issues/945)) ([d74e2c0](https://github.com/DanySK/gradle-kotlin-qa/commit/d74e2c06724d6f07ad1f90d235c456e68c7552a4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.28 ([#946](https://github.com/DanySK/gradle-kotlin-qa/issues/946)) ([a268f75](https://github.com/DanySK/gradle-kotlin-qa/commit/a268f755fe11c93e04fd6c5f135d442f11bcf655))

## [0.78.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.78.0...0.78.1) (2024-12-16)

### Dependency updates

* **deps:** update plugin com.gradle.develocity to v3.19 ([#939](https://github.com/DanySK/gradle-kotlin-qa/issues/939)) ([c8c8d45](https://github.com/DanySK/gradle-kotlin-qa/commit/c8c8d4585137aa0c895b94c7393cfd7b955cddcd))
* **deps:** update plugin kotlin-qa to v0.78.0 ([#937](https://github.com/DanySK/gradle-kotlin-qa/issues/937)) ([e642799](https://github.com/DanySK/gradle-kotlin-qa/commit/e642799d78701137c73428734f480a60267ece28))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.16 ([#938](https://github.com/DanySK/gradle-kotlin-qa/issues/938)) ([00909ec](https://github.com/DanySK/gradle-kotlin-qa/commit/00909ec7ffb758dcd50c9599c1320b06b70249f4))
* **deps:** update plugin publishoncentral to v7 ([#935](https://github.com/DanySK/gradle-kotlin-qa/issues/935)) ([ef9c81a](https://github.com/DanySK/gradle-kotlin-qa/commit/ef9c81a60e37b0492ef6411bf5d7630297a0cd9b))

### Documentation

* **deps:** update dependency org.jetbrains.dokka to v2 ([#940](https://github.com/DanySK/gradle-kotlin-qa/issues/940)) ([b15afb8](https://github.com/DanySK/gradle-kotlin-qa/commit/b15afb82080b93a7082cab4f846f9d75b9690768))

## [0.78.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.77.1...0.78.0) (2024-12-08)

### Features

* enable SARIF generation by default ([#929](https://github.com/DanySK/gradle-kotlin-qa/issues/929)) ([2e33986](https://github.com/DanySK/gradle-kotlin-qa/commit/2e33986a24295cecb6b8d14a270d37ce07ea6ed2))

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.116 ([#934](https://github.com/DanySK/gradle-kotlin-qa/issues/934)) ([28368ad](https://github.com/DanySK/gradle-kotlin-qa/commit/28368ad744846261cf5f643f365098252f0460eb))
* **deps:** update plugin kotlin-qa to v0.77.0 ([#926](https://github.com/DanySK/gradle-kotlin-qa/issues/926)) ([98b3e20](https://github.com/DanySK/gradle-kotlin-qa/commit/98b3e205f7d780ab271ec941668a65d394c25e5c))
* **deps:** update plugin kotlin-qa to v0.77.1 ([#930](https://github.com/DanySK/gradle-kotlin-qa/issues/930)) ([71c7a45](https://github.com/DanySK/gradle-kotlin-qa/commit/71c7a45c9f3cb25ad660a42399e5c767ea52904c))
* **deps:** update plugin multijvmtesting to v2.0.1 ([#931](https://github.com/DanySK/gradle-kotlin-qa/issues/931)) ([b61db62](https://github.com/DanySK/gradle-kotlin-qa/commit/b61db62956881e6aab2be88138da9b4f8209c95a))
* **deps:** update plugin multijvmtesting to v3 ([#932](https://github.com/DanySK/gradle-kotlin-qa/issues/932)) ([247ad8c](https://github.com/DanySK/gradle-kotlin-qa/commit/247ad8c588ee04bc6396af2b26bb401610f3b2df))
* **deps:** update plugin publishoncentral to v6.0.1 ([#933](https://github.com/DanySK/gradle-kotlin-qa/issues/933)) ([ace5721](https://github.com/DanySK/gradle-kotlin-qa/commit/ace5721e7f104903aad937defa93858062b4685a))

### Build and continuous integration

* disambiguate the drop task name ([#936](https://github.com/DanySK/gradle-kotlin-qa/issues/936)) ([19cfb77](https://github.com/DanySK/gradle-kotlin-qa/commit/19cfb77bc6f4f0efd0fefb89fafabde4e024277f))

## [0.77.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.77.0...0.77.1) (2024-12-06)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.1.0 ([#916](https://github.com/DanySK/gradle-kotlin-qa/issues/916)) ([d8c58f0](https://github.com/DanySK/gradle-kotlin-qa/commit/d8c58f01a27a932b843fcab307b57c45ec7ec849))
* **deps:** update node.js to 22.12 ([#921](https://github.com/DanySK/gradle-kotlin-qa/issues/921)) ([7648600](https://github.com/DanySK/gradle-kotlin-qa/commit/764860037c3f4f6e630fb31a8ffab6e1a4aa2310))
* **deps:** update plugin kotlin-qa to v0.76.0 ([#925](https://github.com/DanySK/gradle-kotlin-qa/issues/925)) ([051fca5](https://github.com/DanySK/gradle-kotlin-qa/commit/051fca57a2f776c43deb716f12e1219646a1f67e))
* **deps:** update plugin kotlin-qa to v0.77.0 ([6c500ef](https://github.com/DanySK/gradle-kotlin-qa/commit/6c500efed6ed6f86c3abccc92817ba8f8b5d4ba6))
* **deps:** update plugin multijvmtesting to v2 ([#923](https://github.com/DanySK/gradle-kotlin-qa/issues/923)) ([f4cf669](https://github.com/DanySK/gradle-kotlin-qa/commit/f4cf6698eee49c3b050152465bc2af816c84e7fe))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.9.0 ([#922](https://github.com/DanySK/gradle-kotlin-qa/issues/922)) ([36baf9c](https://github.com/DanySK/gradle-kotlin-qa/commit/36baf9c0cd076ca61f980e06d2c06b4b0596a872))
* **deps:** update plugin publishoncentral to v6 ([#924](https://github.com/DanySK/gradle-kotlin-qa/issues/924)) ([322420c](https://github.com/DanySK/gradle-kotlin-qa/commit/322420c6bf15eb745734ee7202159674d5590d8a))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.24 ([#927](https://github.com/DanySK/gradle-kotlin-qa/issues/927)) ([d513ee3](https://github.com/DanySK/gradle-kotlin-qa/commit/d513ee39d604243bd3ca2bc73e497b00449fdf6f))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.25 ([#928](https://github.com/DanySK/gradle-kotlin-qa/issues/928)) ([156278a](https://github.com/DanySK/gradle-kotlin-qa/commit/156278a19861e619a76f46d44bf66369629e96de))

## [0.77.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.76.0...0.77.0) (2024-12-05)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.5.0 ([#920](https://github.com/DanySK/gradle-kotlin-qa/issues/920)) ([d5f2338](https://github.com/DanySK/gradle-kotlin-qa/commit/d5f23381cfa3976af1d6aec21c1abdc3eac77955))

## [0.76.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.75.0...0.76.0) (2024-12-05)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.3.1 ([#909](https://github.com/DanySK/gradle-kotlin-qa/issues/909)) ([4fb3263](https://github.com/DanySK/gradle-kotlin-qa/commit/4fb3263eb837a069f318cb1ab0bab927b432c13c))
* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.4.1 ([#910](https://github.com/DanySK/gradle-kotlin-qa/issues/910)) ([4b53e35](https://github.com/DanySK/gradle-kotlin-qa/commit/4b53e35d33e6c9f5854724141861a4ae468f0d47))
* **deps:** update plugin kotlin-qa to v0.75.0 ([#919](https://github.com/DanySK/gradle-kotlin-qa/issues/919)) ([247375c](https://github.com/DanySK/gradle-kotlin-qa/commit/247375c1f89690343ab182843452d5203d467905))

### Build and continuous integration

* add Gradle wrapper distributionSha256Sum ([9430a7d](https://github.com/DanySK/gradle-kotlin-qa/commit/9430a7d9bb80e94a27433e510ef406e19a18a4dc))
* revise the build cancelling rules ([5a05b0f](https://github.com/DanySK/gradle-kotlin-qa/commit/5a05b0f6ff4220fd39490b985da8fe77a8dd9894))

## [0.75.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.74.0...0.75.0) (2024-11-29)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.8.0 ([#918](https://github.com/DanySK/gradle-kotlin-qa/issues/918)) ([b5274d7](https://github.com/DanySK/gradle-kotlin-qa/commit/b5274d7225ac143dea50214695acf7115318d86c))

## [0.74.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.73.0...0.74.0) (2024-11-25)

### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12.1.2 ([#914](https://github.com/DanySK/gradle-kotlin-qa/issues/914)) ([7cdbb2b](https://github.com/DanySK/gradle-kotlin-qa/commit/7cdbb2bf91489a0580e29eda8aedc50358a7ca37))

## [0.73.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.72.0...0.73.0) (2024-11-22)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.2.1 ([#908](https://github.com/DanySK/gradle-kotlin-qa/issues/908)) ([9f08581](https://github.com/DanySK/gradle-kotlin-qa/commit/9f0858146c82614f79f216a723a407a2b526d91d))

## [0.72.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.71.0...0.72.0) (2024-11-22)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.1.1 ([#907](https://github.com/DanySK/gradle-kotlin-qa/issues/907)) ([82970ba](https://github.com/DanySK/gradle-kotlin-qa/commit/82970ba2035e2916940f5ed0120d840c9759abcf))

## [0.71.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.70.2...0.71.0) (2024-11-21)

### Dependency updates

* **api-deps:** update dependency com.pinterest.ktlint:ktlint-bom to v1.0.1 ([#906](https://github.com/DanySK/gradle-kotlin-qa/issues/906)) ([fb402da](https://github.com/DanySK/gradle-kotlin-qa/commit/fb402dae1ac97c3d7030f96430362ee23248a4ea))
* **api-deps:** update ktlint to 1.0.0 ([e9e2a9a](https://github.com/DanySK/gradle-kotlin-qa/commit/e9e2a9a09311252baed9a8b1bba75a3ac8773577))
* **deps:** update plugin kotlin-qa to v0.70.2 ([#904](https://github.com/DanySK/gradle-kotlin-qa/issues/904)) ([5054283](https://github.com/DanySK/gradle-kotlin-qa/commit/5054283d0e78a33811c4c3c6d2658e7da758bd4f))
* **deps:** update plugin multijvmtesting to v1.3.2 ([#901](https://github.com/DanySK/gradle-kotlin-qa/issues/901)) ([3057641](https://github.com/DanySK/gradle-kotlin-qa/commit/30576415323e1d01d36dc77e0d6582e5ad836586))
* **deps:** update plugin publishoncentral to v5.1.11 ([#903](https://github.com/DanySK/gradle-kotlin-qa/issues/903)) ([d0657ea](https://github.com/DanySK/gradle-kotlin-qa/commit/d0657ea5ce5deb55ccec588ed96b7191afb3ec8d))

### Tests

* support java versions with just major and build information (e.g., 17+35-2724) ([5aec1a4](https://github.com/DanySK/gradle-kotlin-qa/commit/5aec1a4032c85e37c3e962d3b7ff4c36b17bd4bc))
* use configuration avoidance in tests ([c15957a](https://github.com/DanySK/gradle-kotlin-qa/commit/c15957a28f0c8598cea33c373eba739f7980d213))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.23 ([#905](https://github.com/DanySK/gradle-kotlin-qa/issues/905)) ([6c1bf78](https://github.com/DanySK/gradle-kotlin-qa/commit/6c1bf781115df9732d16c82d4f9dcbc6ebc2798b))
* **renovate:** mark `com.pinterest.ktlint:ktlint-bom` as api-deps ([c14557a](https://github.com/DanySK/gradle-kotlin-qa/commit/c14557a4443372d3056c205c55a092cd18eedf4e))

### Style improvements

* do not start class with blank line ([d11ccdd](https://github.com/DanySK/gradle-kotlin-qa/commit/d11ccddf1c652c6618c79df0ee98bba1e21bd2d0))
* do not start class with blank line ([cb008c2](https://github.com/DanySK/gradle-kotlin-qa/commit/cb008c20b7a8ef468180ff43d6d4b2ee3dd4dda0))

## [0.70.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.70.1...0.70.2) (2024-11-21)

### Dependency updates

* **core-deps:** update dependency gradle to v8.11.1 ([#900](https://github.com/DanySK/gradle-kotlin-qa/issues/900)) ([348a4e7](https://github.com/DanySK/gradle-kotlin-qa/commit/348a4e7caa8ebdb0ca311f4f516c3d3f0c19d97c))
* **deps:** update plugin kotlin-qa to v0.70.1 ([#894](https://github.com/DanySK/gradle-kotlin-qa/issues/894)) ([0547a27](https://github.com/DanySK/gradle-kotlin-qa/commit/0547a2746af2790209b98e295e60cc5b452b30ec))
* **deps:** update plugin multijvmtesting to v1.3.1 ([#895](https://github.com/DanySK/gradle-kotlin-qa/issues/895)) ([15e91e9](https://github.com/DanySK/gradle-kotlin-qa/commit/15e91e9a6d19ac23bee04ac1199b17bb0925b7c6))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.14 ([#897](https://github.com/DanySK/gradle-kotlin-qa/issues/897)) ([d095420](https://github.com/DanySK/gradle-kotlin-qa/commit/d0954202a9234a111213de6111fd2b0fe46aadd1))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.15 ([#902](https://github.com/DanySK/gradle-kotlin-qa/issues/902)) ([1c7cd31](https://github.com/DanySK/gradle-kotlin-qa/commit/1c7cd3144c9e361e6b5425a292e6ae35c169a5c8))
* **deps:** update plugin publishoncentral to v5.1.10 ([#896](https://github.com/DanySK/gradle-kotlin-qa/issues/896)) ([61748f1](https://github.com/DanySK/gradle-kotlin-qa/commit/61748f1cd45b0769618a901210ba2cd1a0441c3b))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.18 ([#898](https://github.com/DanySK/gradle-kotlin-qa/issues/898)) ([a1da045](https://github.com/DanySK/gradle-kotlin-qa/commit/a1da0455a0ee73dedc76f7153ef1b4c30c7ae932))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.22 ([#899](https://github.com/DanySK/gradle-kotlin-qa/issues/899)) ([0495892](https://github.com/DanySK/gradle-kotlin-qa/commit/0495892ea7e85cc577c72e709f872e904977718e))

## [0.70.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.70.0...0.70.1) (2024-11-17)

### Dependency updates

* **core-deps:** update dependency gradle to v8.11 ([#882](https://github.com/DanySK/gradle-kotlin-qa/issues/882)) ([64eda45](https://github.com/DanySK/gradle-kotlin-qa/commit/64eda4522e86ebb58834176a901dc2b705fad790))
* **deps:** update plugin kotlin-qa to v0.70.0 ([#893](https://github.com/DanySK/gradle-kotlin-qa/issues/893)) ([745228c](https://github.com/DanySK/gradle-kotlin-qa/commit/745228c6ec882f676461014c951dd63b547f5570))

## [0.70.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.69.0...0.70.0) (2024-11-17)

### Dependency updates

* **api-deps:** update dependency de.aaschmid:gradle-cpd-plugin to v3.5 ([#892](https://github.com/DanySK/gradle-kotlin-qa/issues/892)) ([19ecb3e](https://github.com/DanySK/gradle-kotlin-qa/commit/19ecb3eb8ce3e25266b3742a644901fee05953ac))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.113 ([464d49d](https://github.com/DanySK/gradle-kotlin-qa/commit/464d49dc75d3641ffba8a225b64d21e8196958a1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.114 ([89c0733](https://github.com/DanySK/gradle-kotlin-qa/commit/89c0733d27becc1c96790660595ab2accf10b24a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.115 ([#884](https://github.com/DanySK/gradle-kotlin-qa/issues/884)) ([de60261](https://github.com/DanySK/gradle-kotlin-qa/commit/de602619b3c5234c8515cc8390fa7d12c425e05e))
* **deps:** update node.js to v22 ([b0a8ee0](https://github.com/DanySK/gradle-kotlin-qa/commit/b0a8ee016eadbb1261e5d8b3af9f91c62905849a))
* **deps:** update plugin com.gradle.develocity to v3.18.2 ([#887](https://github.com/DanySK/gradle-kotlin-qa/issues/887)) ([8762dca](https://github.com/DanySK/gradle-kotlin-qa/commit/8762dca18aae3fecbff65d019c3388c0f15fce79))
* **deps:** update plugin kotlin-qa to v0.69.0 ([89d1955](https://github.com/DanySK/gradle-kotlin-qa/commit/89d19556210adbbe0f9b697b6b11aff2dc19ca49))
* **deps:** update plugin multijvmtesting to v1.3.0 ([#880](https://github.com/DanySK/gradle-kotlin-qa/issues/880)) ([42f9e1c](https://github.com/DanySK/gradle-kotlin-qa/commit/42f9e1cf28a83f0ebc86502d4bf994d4d2554857))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.13 ([#885](https://github.com/DanySK/gradle-kotlin-qa/issues/885)) ([3725dd8](https://github.com/DanySK/gradle-kotlin-qa/commit/3725dd84744ea48cff16d7c4b6d3fde85501aa32))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.14 ([#888](https://github.com/DanySK/gradle-kotlin-qa/issues/888)) ([1d78fcf](https://github.com/DanySK/gradle-kotlin-qa/commit/1d78fcff3412b5c78795fdc69a462c28e0efa7ed))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.15 ([#889](https://github.com/DanySK/gradle-kotlin-qa/issues/889)) ([1c28df3](https://github.com/DanySK/gradle-kotlin-qa/commit/1c28df32ec48923499408805c04ed013fa8162d3))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.16 ([#890](https://github.com/DanySK/gradle-kotlin-qa/issues/890)) ([eb83c51](https://github.com/DanySK/gradle-kotlin-qa/commit/eb83c51e2647c1983a56b01fe7d37daf8a64732c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.17 ([#891](https://github.com/DanySK/gradle-kotlin-qa/issues/891)) ([e415964](https://github.com/DanySK/gradle-kotlin-qa/commit/e4159643be064cc5f857e3b43383047b9d8d9a73))
* **renovate:**  use `with` to import the configuration instead of `assert` ([#881](https://github.com/DanySK/gradle-kotlin-qa/issues/881)) ([8a57468](https://github.com/DanySK/gradle-kotlin-qa/commit/8a57468d2fbcd36a1e8ef2408938bd4409eafb7d))
* **renovate:** consider both ktlint and ktlint-bom as API dependencies ([ed69fc2](https://github.com/DanySK/gradle-kotlin-qa/commit/ed69fc2c8fbe0d1a2636841ef60ca64eb17fac1e))
* track ktlint versions from ktlint-bom ([#883](https://github.com/DanySK/gradle-kotlin-qa/issues/883)) ([30cba55](https://github.com/DanySK/gradle-kotlin-qa/commit/30cba55ccf5371c81914af73d5ef418f183da029))

## [0.69.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.68.0...0.69.0) (2024-10-25)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.7.0 ([0ff66a3](https://github.com/DanySK/gradle-kotlin-qa/commit/0ff66a3a005878df6013bee7ac7b4d335b52255f))
* **deps:** update dependency org.jetbrains.kotlin.jvm to v2.0.21 ([0fb3839](https://github.com/DanySK/gradle-kotlin-qa/commit/0fb38396ce2c1d88da2d81a04e538b4a4f1deb44))
* **deps:** update dependency org.mockito:mockito-core to v5.14.1 ([b57d5da](https://github.com/DanySK/gradle-kotlin-qa/commit/b57d5dab738a47d3c9063ff63a21c7714a8c1032))
* **deps:** update dependency org.mockito:mockito-core to v5.14.2 ([06bfe20](https://github.com/DanySK/gradle-kotlin-qa/commit/06bfe20dfa3ec139ea03b21fbd99005c12376952))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.109 ([6ab0616](https://github.com/DanySK/gradle-kotlin-qa/commit/6ab0616df78dceb51284da7ffbea8e430cfedfd0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.110 ([6a2accb](https://github.com/DanySK/gradle-kotlin-qa/commit/6a2accbac190f38ab02cb0f94e0b19612206cba9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.111 ([03bd73b](https://github.com/DanySK/gradle-kotlin-qa/commit/03bd73bbd3f0a1b8bc38429679be77aad5d86a3f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.112 ([e8fe691](https://github.com/DanySK/gradle-kotlin-qa/commit/e8fe6912d82003a6350b0ba91418d411c7b75989))
* **deps:** update node.js to 20.18 ([9befd56](https://github.com/DanySK/gradle-kotlin-qa/commit/9befd56c514a30013cf2f2399f038c137ec1920a))
* **deps:** update plugin kotlin-qa to v0.68.0 ([8a11728](https://github.com/DanySK/gradle-kotlin-qa/commit/8a1172864c77c126e95dfb99a80dbeaa8ef23017))
* **deps:** update plugin publishoncentral to v5.1.9 ([8abd657](https://github.com/DanySK/gradle-kotlin-qa/commit/8abd657bccc04e68599a64e0bc1f9606e03aebee))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.2.1 ([2cfe883](https://github.com/DanySK/gradle-kotlin-qa/commit/2cfe883b199426b5ba1285b0cba0e974b03a2770))
* **deps:** update actions/checkout action to v4.2.2 ([aee7123](https://github.com/DanySK/gradle-kotlin-qa/commit/aee7123136560efff017f9c12f256277abe8a0cb))
* **deps:** update actions/setup-node action to v4.1.0 ([c6fa2f2](https://github.com/DanySK/gradle-kotlin-qa/commit/c6fa2f2c4e6c5c5fc5b2b7e1e1c8da48c1788f76))
* **deps:** update danysk/action-checkout action to v0.2.21 ([10ee7f5](https://github.com/DanySK/gradle-kotlin-qa/commit/10ee7f5ff099bd431d6b5361e9a4b31652f3e17f))
* **deps:** update danysk/action-checkout action to v0.2.22 ([befa12e](https://github.com/DanySK/gradle-kotlin-qa/commit/befa12ef1d82621338ecfb0839c8e2f113f4cba4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.10 ([88ca175](https://github.com/DanySK/gradle-kotlin-qa/commit/88ca1751767f556cfcbb77f559182ef3368978ae))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.11 ([35f5724](https://github.com/DanySK/gradle-kotlin-qa/commit/35f5724574f79d42c3eb1f0346ab8493e356f87d))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.12 ([f788ded](https://github.com/DanySK/gradle-kotlin-qa/commit/f788deded82a3b0c1ae58f4b89410440fc9745db))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.8 ([1c51c67](https://github.com/DanySK/gradle-kotlin-qa/commit/1c51c6775b939f319867990eb40cc598e2171755))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.9 ([9054bd1](https://github.com/DanySK/gradle-kotlin-qa/commit/9054bd142544b4561dd49192447d6c8d00a074f6))

## [0.68.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.67.3...0.68.0) (2024-09-27)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.6.0 ([7d7d53f](https://github.com/DanySK/gradle-kotlin-qa/commit/7d7d53f675d04925840cbf0899d02e36337c6d25))
* **deps:** update dependency org.mockito:mockito-core to v5.14.0 ([bfeef4a](https://github.com/DanySK/gradle-kotlin-qa/commit/bfeef4a246c2cf22e43d1f85468cc8edfc9b9116))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.108 ([57c20aa](https://github.com/DanySK/gradle-kotlin-qa/commit/57c20aa103c4b51e31d73f573cc3b4276f35f9f9))
* **deps:** update plugin kotlin-qa to v0.67.3 ([09be3aa](https://github.com/DanySK/gradle-kotlin-qa/commit/09be3aa09b23ad6461662d078e3a74ba90b94423))
* **deps:** update plugin multijvmtesting to v1.2.8 ([099a2bd](https://github.com/DanySK/gradle-kotlin-qa/commit/099a2bdc76605f99f96af9deed143a623eae58d8))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.13 ([71ff022](https://github.com/DanySK/gradle-kotlin-qa/commit/71ff022a43bb7f4400749e910f97075c383a3ae1))
* **deps:** update plugin publishoncentral to v5.1.8 ([0bf75c6](https://github.com/DanySK/gradle-kotlin-qa/commit/0bf75c6be9844468213ade32b974dfe7aad30205))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.2.0 ([bf306aa](https://github.com/DanySK/gradle-kotlin-qa/commit/bf306aa67ce4d55fc63b71d84f77eca35ead77c0))
* **deps:** update danysk/action-checkout action to v0.2.20 ([1e1a203](https://github.com/DanySK/gradle-kotlin-qa/commit/1e1a2036b4f1efa4367ead4aa119d73df85e2f4c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.7 ([2d3c4d3](https://github.com/DanySK/gradle-kotlin-qa/commit/2d3c4d38741c2fda17d7ecfa2dc6ab6428f251b6))
* **deps:** update dependency ubuntu github actions runner to v24 ([db72a43](https://github.com/DanySK/gradle-kotlin-qa/commit/db72a43d0678ed47d3552d0d051c32e8f9af43d7))

## [0.67.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.67.2...0.67.3) (2024-09-24)

### Dependency updates

* **core-deps:** update dependency gradle to v8.10.2 ([d0c81f0](https://github.com/DanySK/gradle-kotlin-qa/commit/d0c81f0604091ddfd21cf576f7be12a8768ccfb0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.106 ([74268e7](https://github.com/DanySK/gradle-kotlin-qa/commit/74268e7f41fdc7c0cc36bd45289f17073b07b1d3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.107 ([8de7c14](https://github.com/DanySK/gradle-kotlin-qa/commit/8de7c14027935f7f077cbee1648b7543cb3fbab2))
* **deps:** update plugin kotlin-qa to v0.67.2 ([919c649](https://github.com/DanySK/gradle-kotlin-qa/commit/919c6499b0cce6c6a47cc3c47a63ada9de552e4e))
* **deps:** update plugin multijvmtesting to v1.2.7 ([69a9e19](https://github.com/DanySK/gradle-kotlin-qa/commit/69a9e192c99244774dce7dc4ae683bf8e26cd49c))
* **deps:** update plugin publishoncentral to v5.1.7 ([649f04c](https://github.com/DanySK/gradle-kotlin-qa/commit/649f04c9d664e3c8a6cd154a9247a901ed3df4db))

### Build and continuous integration

* **deps:** update actions/setup-node action to v4.0.4 ([7997a77](https://github.com/DanySK/gradle-kotlin-qa/commit/7997a7760d2ebb7a0c4fcc844c06055144a90b12))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.6 ([79faeb3](https://github.com/DanySK/gradle-kotlin-qa/commit/79faeb34b5341ff3ec2228d12b21151ed89df253))

## [0.67.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.67.1...0.67.2) (2024-09-12)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.103 ([a4d02f5](https://github.com/DanySK/gradle-kotlin-qa/commit/a4d02f50d7d4ed078267b24d7e8bcb51e3ea1db2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.104 ([39def17](https://github.com/DanySK/gradle-kotlin-qa/commit/39def1771f887a470502beeb9b04936bf0d4efff))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.105 ([919d2f8](https://github.com/DanySK/gradle-kotlin-qa/commit/919d2f847a296bb1bb9c78c077012cf7598b28ec))
* **deps:** update plugin com.gradle.develocity to v3.18.1 ([bacf927](https://github.com/DanySK/gradle-kotlin-qa/commit/bacf927557d386c1ef4930c6ec360248186cb5aa))
* **deps:** update plugin gradlepluginpublish to v1.3.0 ([59c4097](https://github.com/DanySK/gradle-kotlin-qa/commit/59c40976cbc257742100c94503aef02b33d755df))
* **deps:** update plugin multijvmtesting to v1.2.6 ([d8c800e](https://github.com/DanySK/gradle-kotlin-qa/commit/d8c800eab51e0b8fa067c0f0d01bf24c82b9cf8b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.10 ([c6c687f](https://github.com/DanySK/gradle-kotlin-qa/commit/c6c687fa39c9f5c0a57fca7613f21cf0f4b7f84a))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.12 ([0735e94](https://github.com/DanySK/gradle-kotlin-qa/commit/0735e94bed77fd98bf71d5540a8543fcb3da7cfc))

### Bug Fixes

* make `KotlinQAPlugin.Companion` private ([e0db8f0](https://github.com/DanySK/gradle-kotlin-qa/commit/e0db8f00f405010d990b71b7e5ba9976af55216e))
* make companions private ([6c767cb](https://github.com/DanySK/gradle-kotlin-qa/commit/6c767cb37dd36e0184806a400e78292b1dfedcd2))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.5 ([9e45f96](https://github.com/DanySK/gradle-kotlin-qa/commit/9e45f9615e234c10404cad8f6c71c4ebd9d96bf9))
* migrate to the compilerOptions DSL ([3008a11](https://github.com/DanySK/gradle-kotlin-qa/commit/3008a111161d624caa1ef5a9a2028bfceacbf781))

## [0.67.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.67.0...0.67.1) (2024-09-09)

### Dependency updates

* **core-deps:** update dependency gradle to v8.10.1 ([55bc3d4](https://github.com/DanySK/gradle-kotlin-qa/commit/55bc3d47a73ee7928b33befbd00269c0838cf803))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.102 ([6df3f1e](https://github.com/DanySK/gradle-kotlin-qa/commit/6df3f1e90850d20d73851824cbc7ba26f8133a34))

## [0.67.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.66.1...0.67.0) (2024-09-08)

### Dependency updates

* **api-deps:** update detekt to v1.23.7 ([8dcfb65](https://github.com/DanySK/gradle-kotlin-qa/commit/8dcfb6585bdce36ef7c347e30b995c826fdb6fe4))
* **deps:** update plugin kotlin-qa to v0.66.1 ([559b599](https://github.com/DanySK/gradle-kotlin-qa/commit/559b5992f44136516a26aa9027adae1b04580299))

## [0.66.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.66.0...0.66.1) (2024-09-04)

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.66.0 ([d13abd9](https://github.com/DanySK/gradle-kotlin-qa/commit/d13abd91b1f7986f2e5e15c17ce31c481a444e91))

### Bug Fixes

* allow many more functions at a file top level ([78a05ee](https://github.com/DanySK/gradle-kotlin-qa/commit/78a05ee844b2496e79fd29e54644cd18edec2ca7))

## [0.66.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.65.2...0.66.0) (2024-08-30)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.5.0 ([7469f69](https://github.com/DanySK/gradle-kotlin-qa/commit/7469f6965e08673f1237c6f4a74808854f5d6988))
* **deps:** update dependency org.mockito:mockito-core to v5.13.0 ([87b9624](https://github.com/DanySK/gradle-kotlin-qa/commit/87b962459c7d4922b31b9caee55aabc8be70b0b9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.100 ([de35554](https://github.com/DanySK/gradle-kotlin-qa/commit/de3555430319c9cf2fa0bea0adaf57e66a9041f1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.101 ([2e95e88](https://github.com/DanySK/gradle-kotlin-qa/commit/2e95e889976167deb38b74d58b23cee1d2c75e52))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.96 ([29a19e4](https://github.com/DanySK/gradle-kotlin-qa/commit/29a19e40f1a2c285a88f508ae139213fc91aa69c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.97 ([9a39da3](https://github.com/DanySK/gradle-kotlin-qa/commit/9a39da3f74d477bd1b614d56147b12fa522d9eca))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.98 ([332db37](https://github.com/DanySK/gradle-kotlin-qa/commit/332db377d8276763298d6eb3b0f08a967cc5c96d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.99 ([596df73](https://github.com/DanySK/gradle-kotlin-qa/commit/596df737cec137335343f58b18065c92fd7a0cba))
* **deps:** update kotlin monorepo to v2.0.20 ([ec7bacf](https://github.com/DanySK/gradle-kotlin-qa/commit/ec7bacfae80af90e33016e4dcdaff7b517cde2b2))
* **deps:** update node.js to 20.17 ([026a8d0](https://github.com/DanySK/gradle-kotlin-qa/commit/026a8d0da41e4ff0913176c7833b46415fd28604))
* **deps:** update plugin com.gradle.develocity to v3.18 ([459631f](https://github.com/DanySK/gradle-kotlin-qa/commit/459631f472a642fa87996f499b1f3da3b394ccba))
* **deps:** update plugin gradlepluginpublish to v1.2.2 ([4c986f1](https://github.com/DanySK/gradle-kotlin-qa/commit/4c986f18417b64bd55238ec68a05b1481ba4603b))
* **deps:** update plugin kotlin-qa to v0.65.2 ([209d1bd](https://github.com/DanySK/gradle-kotlin-qa/commit/209d1bdbee6334fe7baed5d554e656420ea62768))
* **deps:** update plugin multijvmtesting to v1.2.4 ([725ba65](https://github.com/DanySK/gradle-kotlin-qa/commit/725ba659891a25fd956974efcf1e34574d8c995a))
* **deps:** update plugin multijvmtesting to v1.2.5 ([856399a](https://github.com/DanySK/gradle-kotlin-qa/commit/856399a82fcc3a5ea7faf82491e75f2cc1ea35d5))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.9 ([9ad1567](https://github.com/DanySK/gradle-kotlin-qa/commit/9ad15674fa67eb666137ea22615660f29ba8db1f))
* **deps:** update plugin publishoncentral to v5.1.6 ([a8b3fbe](https://github.com/DanySK/gradle-kotlin-qa/commit/a8b3fbe65b4d9b17fed286a3b86cd6345abb8be4))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.4 ([4edca66](https://github.com/DanySK/gradle-kotlin-qa/commit/4edca668dbce7ec0d773bd721d91cc18ba0e1cd8))

## [0.65.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.65.1...0.65.2) (2024-08-14)

### Dependency updates

* **core-deps:** update dependency gradle to v8.10 ([36acfd7](https://github.com/DanySK/gradle-kotlin-qa/commit/36acfd7b5ae785f8a916ba1acda94d2a8588704e))
* **deps:** update plugin kotlin-qa to v0.65.1 ([a828fbf](https://github.com/DanySK/gradle-kotlin-qa/commit/a828fbf20f71166a30925ccd861c779ac0b081b7))
* **deps:** update plugin multijvmtesting to v1.2.3 ([588bb55](https://github.com/DanySK/gradle-kotlin-qa/commit/588bb55daae9b24f371a2f4674ca05cc64f2997d))
* **deps:** update plugin publishoncentral to v5.1.5 ([d35c7fe](https://github.com/DanySK/gradle-kotlin-qa/commit/d35c7fee2f3e0f39b7c40f723b257f73212e8ab4))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.3 ([5a879a9](https://github.com/DanySK/gradle-kotlin-qa/commit/5a879a9c46dc808ea94643f2421919cb5b5f4052))

## [0.65.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.65.0...0.65.1) (2024-08-06)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.0.10 ([dd7cc61](https://github.com/DanySK/gradle-kotlin-qa/commit/dd7cc611ad6ff19738ee108958f203bca0c16442))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.94 ([b67000e](https://github.com/DanySK/gradle-kotlin-qa/commit/b67000ea5ed1c58183d123b013bf33d27c77cdab))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.95 ([9bf3bc6](https://github.com/DanySK/gradle-kotlin-qa/commit/9bf3bc62e0e5532de3351206825e6fec71918347))
* **deps:** update plugin kotlin-qa to v0.65.0 ([92d7942](https://github.com/DanySK/gradle-kotlin-qa/commit/92d7942fbe6bad6ac111b6893c96e9584edb6286))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.2 ([0beafd5](https://github.com/DanySK/gradle-kotlin-qa/commit/0beafd55a65d999adc1e2c2022a91fd5520d3a59))

## [0.65.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.64.3...0.65.0) (2024-07-31)

### Features

* apply the plugin by reacting to any Kotlin plugin application ([fa24ecd](https://github.com/DanySK/gradle-kotlin-qa/commit/fa24ecdcf5b36cabb79c143dcb59119a5706b202))

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.64.3 ([5de584c](https://github.com/DanySK/gradle-kotlin-qa/commit/5de584ca24b54642d2606f6331ec0c41093f3139))

### Tests

* treat platform type as nullable ([bbe2239](https://github.com/DanySK/gradle-kotlin-qa/commit/bbe2239963dafc1673e99f763507cbb9c4414bc0))
* update Kotlin to 2.0.0 in all tests ([6f4fdc9](https://github.com/DanySK/gradle-kotlin-qa/commit/6f4fdc96c395bf2e19a5a0238c4cc27cd5e21f6b))

## [0.64.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.64.2...0.64.3) (2024-07-31)

### Bug Fixes

* configure the check task only if it exists ([669b4d8](https://github.com/DanySK/gradle-kotlin-qa/commit/669b4d8366c0f247eb42eb3f6add3ba8c24ccb17))

## [0.64.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.64.1...0.64.2) (2024-07-31)

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.64.1 ([33fdee3](https://github.com/DanySK/gradle-kotlin-qa/commit/33fdee331731319d10a86b31b46794b5394bbeb7))

### Bug Fixes

* use the modern Kotlin compiler configuration ([165ed8b](https://github.com/DanySK/gradle-kotlin-qa/commit/165ed8bfe87fe7e06e033802fbf0350b77dc8c0c))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.1 ([0934d72](https://github.com/DanySK/gradle-kotlin-qa/commit/0934d726ca5f6625978f98319478d83667b60b7d))

### Style improvements

* remove star import ([53dfdfc](https://github.com/DanySK/gradle-kotlin-qa/commit/53dfdfc3aa9bf0d035be950c257dc9c52e885a3e))

## [0.64.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.64.0...0.64.1) (2024-07-30)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.93 ([384af4c](https://github.com/DanySK/gradle-kotlin-qa/commit/384af4cb4eae432a0474ad0f2b5a89a4f83736de))
* **deps:** update node.js to 20.16 ([9c01b77](https://github.com/DanySK/gradle-kotlin-qa/commit/9c01b775e70116d8af8b7598f32f123712f6d5a7))
* **deps:** update plugin kotlin-qa to v0.64.0 ([e98ee1d](https://github.com/DanySK/gradle-kotlin-qa/commit/e98ee1d4443d1533193d2d4e8ed6d4c766381b5c))

### Performance improvements

* use the Gradle's configuration avoidance API ([4d8d343](https://github.com/DanySK/gradle-kotlin-qa/commit/4d8d343fead23ceb3abe7de9051221a6ba4b180a))

### General maintenance

* ignore `.kotlin` ([2070caa](https://github.com/DanySK/gradle-kotlin-qa/commit/2070caa8cb11e3c7c22dfedeb8fa75177be046b1))

## [0.64.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.63.0...0.64.0) (2024-07-26)

### Dependency updates

* **api-deps:** update dependency net.sourceforge.pmd:pmd-kotlin to v7.4.0 ([d61acc2](https://github.com/DanySK/gradle-kotlin-qa/commit/d61acc2f0022603184f867b83aa9ee1799955f16))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.92 ([9fed0d2](https://github.com/DanySK/gradle-kotlin-qa/commit/9fed0d20ea27b08871b4ffbf2d57dd510d6809a7))
* **deps:** update plugin com.gradle.develocity to v3.17.6 ([f970339](https://github.com/DanySK/gradle-kotlin-qa/commit/f970339f5565ad26cdb6d60553359ed0459108a3))
* **deps:** update plugin kotlin-qa to v0.63.0 ([90bf884](https://github.com/DanySK/gradle-kotlin-qa/commit/90bf884ea36a6bd2e89e65019a14bd71f1402e74))
* **deps:** update plugin multijvmtesting to v1.1.1 ([ea358ee](https://github.com/DanySK/gradle-kotlin-qa/commit/ea358eef843feeef676ab489edde7ffcfe7f63d6))
* **deps:** update plugin multijvmtesting to v1.2.0 ([85e7a6c](https://github.com/DanySK/gradle-kotlin-qa/commit/85e7a6cdd9eb523f5d9d10e9491a1b853cbc6ddc))
* **deps:** update plugin multijvmtesting to v1.2.2 ([dc96743](https://github.com/DanySK/gradle-kotlin-qa/commit/dc967438a08b0b6eba6991dfe6047ff2235b659d))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.4.0 ([2c2ab76](https://github.com/DanySK/gradle-kotlin-qa/commit/2c2ab763b84b05700abefe413eeeee9a0b955363))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.0 ([3d78137](https://github.com/DanySK/gradle-kotlin-qa/commit/3d78137fdfe759667cc9575d7f72799db947f81f))
* retry the delivery up to 5 times ([#776](https://github.com/DanySK/gradle-kotlin-qa/issues/776)) ([138d147](https://github.com/DanySK/gradle-kotlin-qa/commit/138d147f3f3366a220493c5b020b147438194907))

## [0.63.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.62.4...0.63.0) (2024-07-17)

### Dependency updates

* **api-deps:** update dependency de.aaschmid:gradle-cpd-plugin to v3.4 and dependency net.sourceforge.pmd:pmd-kotlin to v7 ([e8d9c5a](https://github.com/DanySK/gradle-kotlin-qa/commit/e8d9c5abb76517b1550e0a2d37a8c63b993833ca))
* **deps:** update plugin kotlin-qa to v0.62.4 ([57ae282](https://github.com/DanySK/gradle-kotlin-qa/commit/57ae2829c36684ea302e0a3c1e7247793ad5520e))
* **deps:** update plugin publishoncentral to v5.1.4 ([bdc65ee](https://github.com/DanySK/gradle-kotlin-qa/commit/bdc65ee6b13aefe08c27bb3f714deb8a9dcb0c72))

## [0.62.4](https://github.com/DanySK/gradle-kotlin-qa/compare/0.62.3...0.62.4) (2024-07-17)

### Dependency updates

* **core-deps:** update dependency gradle to v8.9 ([07e455f](https://github.com/DanySK/gradle-kotlin-qa/commit/07e455f010e98d42aa49408c036ef812222c8354))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.86 ([05214a4](https://github.com/DanySK/gradle-kotlin-qa/commit/05214a483e0630c25aa6a08ab740bd1760b2e0fa))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.87 ([18352f5](https://github.com/DanySK/gradle-kotlin-qa/commit/18352f501cbb9373d98ee2cea138aeaf6566307d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.91 ([016979d](https://github.com/DanySK/gradle-kotlin-qa/commit/016979d601103c6fa46b89e5e4bb87314d1da84d))
* **deps:** update kotest to v5.9.1 ([edc616c](https://github.com/DanySK/gradle-kotlin-qa/commit/edc616ca55bed397e0b33b40e7a64602bdb4b1e3))
* **deps:** update node.js to 20.15 ([5855c41](https://github.com/DanySK/gradle-kotlin-qa/commit/5855c41720cb7d3e25ef1b13dd724663320d9227))
* **deps:** update plugin com.gradle.develocity to v3.17.5 ([6aecb10](https://github.com/DanySK/gradle-kotlin-qa/commit/6aecb10450b71414d718ce0e6e7d21d9cee084c5))
* **deps:** update plugin kotlin-qa to v0.62.3 ([c8aaad3](https://github.com/DanySK/gradle-kotlin-qa/commit/c8aaad389edb87aa66e3a9678f1a172afdffa3fc))
* **deps:** update plugin multijvmtesting to v1 ([1bd3aeb](https://github.com/DanySK/gradle-kotlin-qa/commit/1bd3aeb089bbbe5f71572f148b56fcbd23d82a7e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.8 ([e39d90c](https://github.com/DanySK/gradle-kotlin-qa/commit/e39d90cbb9723bc48c7212d7bab87db3ddd74b04))
* **deps:** update plugin publishoncentral to v5.1.3 ([9dbcdef](https://github.com/DanySK/gradle-kotlin-qa/commit/9dbcdef93ad22594351a002f3be25200047b2e70))
* **deps:** update plugin tasktree to v4 ([833250f](https://github.com/DanySK/gradle-kotlin-qa/commit/833250fd492581ee94e511eddd63ad0bc8abb9d1))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.7 ([715fd60](https://github.com/DanySK/gradle-kotlin-qa/commit/715fd6089e48dedf012b790f0391f37e5d750a8e))
* **deps:** update danysk/action-checkout action to v0.2.19 ([787269f](https://github.com/DanySK/gradle-kotlin-qa/commit/787269f227a610147be07dad3cd388e67e5e4dcb))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.21 ([86d99e2](https://github.com/DanySK/gradle-kotlin-qa/commit/86d99e243f6e227a1ebc157112b1989921e7d98a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.22 ([0f69f96](https://github.com/DanySK/gradle-kotlin-qa/commit/0f69f965fb447e075ce2776c26ec7defc0311d25))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.24 ([c3cf7f5](https://github.com/DanySK/gradle-kotlin-qa/commit/c3cf7f5d5de17afdea3d33985a0461a3c4dea740))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3 ([50f77da](https://github.com/DanySK/gradle-kotlin-qa/commit/50f77da9abb7b8a138ad06591223bf036cf36e78))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.1.0 ([44b112b](https://github.com/DanySK/gradle-kotlin-qa/commit/44b112b24b2c42a34df81c9d67bb016fcb10a7de))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.1.1 ([a34b0fa](https://github.com/DanySK/gradle-kotlin-qa/commit/a34b0fa506d61f7d2a91f13b6f61112f735aa312))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.3.0 ([8b60389](https://github.com/DanySK/gradle-kotlin-qa/commit/8b60389ea9a4e9f0adc222adf34a2096683b2c75))
* install the version of node from the package.json ([8cde602](https://github.com/DanySK/gradle-kotlin-qa/commit/8cde602379a66eb3920866289e32731922363fcc))
* **release:** switch to a ECMA6-compliant semantic release configuration ([ff1e130](https://github.com/DanySK/gradle-kotlin-qa/commit/ff1e1307298afbc236e5118d2a877fdb5b09ec21))
* switch to the new Central authentication system ([dc652d6](https://github.com/DanySK/gradle-kotlin-qa/commit/dc652d64132fac19dfa618ddbc3f73860a575cbc))
* use the token when publishing on codecov ([2f77e9a](https://github.com/DanySK/gradle-kotlin-qa/commit/2f77e9aae8ae16421a2b598ea4e3087f31771921))

## [0.62.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.62.2...0.62.3) (2024-06-05)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2 ([4454166](https://github.com/DanySK/gradle-kotlin-qa/commit/44541669a239b1765f376285f738a082d0fb6916))

## [0.62.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.62.1...0.62.2) (2024-06-05)


### Dependency updates

* **deps:** update plugin kotlin-qa to v0.62.1 ([644efd6](https://github.com/DanySK/gradle-kotlin-qa/commit/644efd6af915a3080b63828b059b1421fc937c48))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.7 ([88dabfc](https://github.com/DanySK/gradle-kotlin-qa/commit/88dabfc9c0f3a3ed31a96499f8e8aace34d5cc3f))
* **deps:** update plugin publishoncentral to v5.1.2 ([9a7c637](https://github.com/DanySK/gradle-kotlin-qa/commit/9a7c63770e0e4f27b0ed7fa381858cdf7e20ac28))


### Bug Fixes

* migrate to the compilerOptions DSL ([67898c8](https://github.com/DanySK/gradle-kotlin-qa/commit/67898c8d3f0f60b8e75b4cdee9192db1e78f4030))


### Build and continuous integration

* switch to develocity ([6956f3a](https://github.com/DanySK/gradle-kotlin-qa/commit/6956f3a54d7472e499da8ca1375ec6ea86b2a888))

## [0.62.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.62.0...0.62.1) (2024-05-31)


### Dependency updates

* **core-deps:** update dependency gradle to v8.8 ([8f187ed](https://github.com/DanySK/gradle-kotlin-qa/commit/8f187ed4f04eb830568b2fa7d4538737bfc6f559))
* **deps:** update dependency org.mockito:mockito-core to v5.12.0 ([520d97c](https://github.com/DanySK/gradle-kotlin-qa/commit/520d97c8fe961604bb6510c1f9de5503f82a3b33))
* **deps:** update kotest to v5.9.0 ([39a83ee](https://github.com/DanySK/gradle-kotlin-qa/commit/39a83ee481b636358af9922008895fa183721756))
* **deps:** update node.js to 20.13 ([eeb35db](https://github.com/DanySK/gradle-kotlin-qa/commit/eeb35dbcb9d994e4ad076f4fa1e7b89c7f712eb8))
* **deps:** update node.js to 20.14 ([db5c169](https://github.com/DanySK/gradle-kotlin-qa/commit/db5c16918042a6b61c027e9a31673e37cc61204c))
* **deps:** update plugin com.gradle.enterprise to v3.17.3 ([55e96ba](https://github.com/DanySK/gradle-kotlin-qa/commit/55e96baee2beefa1aa1952f1cc8756e83d27cf34))
* **deps:** update plugin com.gradle.enterprise to v3.17.4 ([24f2a67](https://github.com/DanySK/gradle-kotlin-qa/commit/24f2a67e5e6b36fb473903a29c1a7e9580bffca6))
* **deps:** update plugin gitsemver to v3.1.6 ([0a979f7](https://github.com/DanySK/gradle-kotlin-qa/commit/0a979f713bba5b9cd942457e613f567c2d95cae7))
* **deps:** update plugin gitsemver to v3.1.7 ([3fd1ccf](https://github.com/DanySK/gradle-kotlin-qa/commit/3fd1ccf43faf1ffbf30d4c3f51c0549b4539f398))
* **deps:** update plugin kotlin-qa to v0.62.0 ([90ce0c4](https://github.com/DanySK/gradle-kotlin-qa/commit/90ce0c49b00c4494eae42f110750c6423fa2c5b9))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.6 ([d4e92a6](https://github.com/DanySK/gradle-kotlin-qa/commit/d4e92a6b1fe3d5442849a440db640a9706c93739))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.5 ([ced0233](https://github.com/DanySK/gradle-kotlin-qa/commit/ced0233c16691c7a4f03a4ee2d30e1c57d35071b))
* **deps:** update actions/checkout action to v4.1.6 ([a5edd2d](https://github.com/DanySK/gradle-kotlin-qa/commit/a5edd2d5bc5d744f7308356f078dce4bb97845fb))
* **deps:** update danysk/action-checkout action to v0.2.17 ([90c092c](https://github.com/DanySK/gradle-kotlin-qa/commit/90c092c3de6e3136383ed5f884d5a20d755279e9))
* **deps:** update danysk/action-checkout action to v0.2.18 ([9a584bb](https://github.com/DanySK/gradle-kotlin-qa/commit/9a584bb9e788e4f05de6450969b4a2c52e7fe909))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.19 ([4b1f930](https://github.com/DanySK/gradle-kotlin-qa/commit/4b1f9301899c95af45fff680b664236e6da0ffa6))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.20 ([e21b9d9](https://github.com/DanySK/gradle-kotlin-qa/commit/e21b9d9e471881e78841342bc2822c8261af295d))

## [0.62.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.61.1...0.62.0) (2024-05-07)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12.1.1 ([a3bbc8f](https://github.com/DanySK/gradle-kotlin-qa/commit/a3bbc8fdf27cf6fcd3e98f8c44120b7054fd569d))
* **deps:** update plugin gitsemver to v3.1.5 ([d271d27](https://github.com/DanySK/gradle-kotlin-qa/commit/d271d27ce162d753e90f52647dd09d275473a566))
* **deps:** update plugin kotlin-qa to v0.61.1 ([a3db097](https://github.com/DanySK/gradle-kotlin-qa/commit/a3db0976f5ad883c2915c8bbd9b2361097b8763c))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.5 ([0bb3d1e](https://github.com/DanySK/gradle-kotlin-qa/commit/0bb3d1eccecb8fa76035cd95f2fe78ce97dab6b8))
* **deps:** update plugin publishoncentral to v5.1.1 ([6b93a90](https://github.com/DanySK/gradle-kotlin-qa/commit/6b93a902c88dee81e74ef5ca4a7ce733c60ef2b7))

## [0.61.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.61.0...0.61.1) (2024-05-07)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.9.24 ([788ed1d](https://github.com/DanySK/gradle-kotlin-qa/commit/788ed1d6182b86e18d1f75c84cd8cbcd685bee3b))
* **deps:** update jacoco to v0.8.12 ([392f43a](https://github.com/DanySK/gradle-kotlin-qa/commit/392f43abbdcc8c76f077f62dcda5382d4cc58dfa))
* **deps:** update node.js to 20.12 ([2dca439](https://github.com/DanySK/gradle-kotlin-qa/commit/2dca4397b33efc879cb540b19159f1cc62332bac))
* **deps:** update plugin com.gradle.enterprise to v3.17 ([f63f67f](https://github.com/DanySK/gradle-kotlin-qa/commit/f63f67f124797f2e70114d8bb51b0f11206039b7))
* **deps:** update plugin com.gradle.enterprise to v3.17.1 ([bd6a686](https://github.com/DanySK/gradle-kotlin-qa/commit/bd6a6868df8aed818a8532901cb14fef6a91c25f))
* **deps:** update plugin com.gradle.enterprise to v3.17.2 ([5099e1b](https://github.com/DanySK/gradle-kotlin-qa/commit/5099e1b7b8599c9ee589d011eede45f30bb3243a))
* **deps:** update plugin kotlin-qa to v0.61.0 ([d9ad700](https://github.com/DanySK/gradle-kotlin-qa/commit/d9ad700b879d5794bb7f6b4453762c2a1d3dddc1))
* **deps:** update plugin publishoncentral to v5.1.0 ([d32d3d9](https://github.com/DanySK/gradle-kotlin-qa/commit/d32d3d920d0d5259707d12790f3ff000244c8741))
* **deps:** update plugin tasktree to v3 ([ac6a382](https://github.com/DanySK/gradle-kotlin-qa/commit/ac6a382098f1ea5f00161887327c08177cb1085d))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.3 ([2274b9a](https://github.com/DanySK/gradle-kotlin-qa/commit/2274b9a056e79cfac54ac0f2f4ade5c39f5e994e))
* **deps:** update actions/checkout action to v4.1.4 ([17d658d](https://github.com/DanySK/gradle-kotlin-qa/commit/17d658d276f540619baef4af1d4cbbd83cca626d))
* **deps:** update danysk/action-checkout action to v0.2.15 ([09db23f](https://github.com/DanySK/gradle-kotlin-qa/commit/09db23f9227a18b1a26264ee1b14947ac56c5068))
* **deps:** update danysk/action-checkout action to v0.2.16 ([c2a8cab](https://github.com/DanySK/gradle-kotlin-qa/commit/c2a8cab3615c93e3cb2c0241cade86fa9177fc57))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.11 ([4b2a192](https://github.com/DanySK/gradle-kotlin-qa/commit/4b2a1927fa5cdab5b61e83c9098fa9fb3ebbe811))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.12 ([efdafd7](https://github.com/DanySK/gradle-kotlin-qa/commit/efdafd79d1955f8eb08653559aa7bae591871b13))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.13 ([b222ade](https://github.com/DanySK/gradle-kotlin-qa/commit/b222ade80429303d316711920377bba1c5d7074c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.14 ([8e8d69f](https://github.com/DanySK/gradle-kotlin-qa/commit/8e8d69f755b615c196dc3b0e24469fb5529dde3d))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.15 ([b96f2ef](https://github.com/DanySK/gradle-kotlin-qa/commit/b96f2ef2b01bb00a1a497b6944d04fd3561baa9a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.16 ([aec70cb](https://github.com/DanySK/gradle-kotlin-qa/commit/aec70cbc815f1460fa3fc696fd19300018b785e5))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.17 ([ae3db89](https://github.com/DanySK/gradle-kotlin-qa/commit/ae3db8949a52ad1f0ea1e9f2450a43e5c35fcd48))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.18 ([c8c5418](https://github.com/DanySK/gradle-kotlin-qa/commit/c8c54183607e4227be0051d4b55b8d7235de59f0))
* **deps:** update dependency macos github actions runner to v13 ([93ee35e](https://github.com/DanySK/gradle-kotlin-qa/commit/93ee35e7c4b9e75e66d066c36032c643e1632425))
* **deps:** update dependency macos github actions runner to v14 ([d494cf7](https://github.com/DanySK/gradle-kotlin-qa/commit/d494cf72d1226ee3e78fa5582bd83f12fde8f12c))

## [0.61.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.60.4...0.61.0) (2024-03-25)


### Dependency updates

* **api-deps:** update detekt to v1.23.6 ([f05c08e](https://github.com/DanySK/gradle-kotlin-qa/commit/f05c08e4de3b3fb3c0e5d9e3288c27479d48670c))
* **deps:** update plugin gitsemver to v3.1.4 ([f87e716](https://github.com/DanySK/gradle-kotlin-qa/commit/f87e7162b1467fcb0b55d69ae4281416b26906b8))
* **deps:** update plugin kotlin-qa to v0.60.4 ([8f00a8d](https://github.com/DanySK/gradle-kotlin-qa/commit/8f00a8d8b37fe2e53cbf1986e8698223bbe6d80b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.4 ([d579cb3](https://github.com/DanySK/gradle-kotlin-qa/commit/d579cb30cc2cef7a5e89977fe88129f73c6bae51))

## [0.60.4](https://github.com/DanySK/gradle-kotlin-qa/compare/0.60.3...0.60.4) (2024-03-22)


### Dependency updates

* **core-deps:** update dependency gradle to v8.7 ([7f46ad6](https://github.com/DanySK/gradle-kotlin-qa/commit/7f46ad67f69d8f59b1ec668ad74d7bc946de89d7))
* **deps:** update kotest to v5.8.1 ([d800e43](https://github.com/DanySK/gradle-kotlin-qa/commit/d800e43535e1883a2642f67e8246088e3537419a))
* **deps:** update plugin gitsemver to v3.1.3 ([99b1258](https://github.com/DanySK/gradle-kotlin-qa/commit/99b1258de5254e8b4b7cba3dcd807f9d31c4cc72))
* **deps:** update plugin kotlin-qa to v0.60.3 ([4f328fe](https://github.com/DanySK/gradle-kotlin-qa/commit/4f328feef938100ae7fce43b442fa543def53511))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.3 ([925f79b](https://github.com/DanySK/gradle-kotlin-qa/commit/925f79b60508b48d694a2404b3f493efd652c413))
* **deps:** update plugin publishoncentral to v5.0.26 ([fdadeba](https://github.com/DanySK/gradle-kotlin-qa/commit/fdadeba5635c276a20f719d0cdf1c6be86ac49b4))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.2 ([e5deaff](https://github.com/DanySK/gradle-kotlin-qa/commit/e5deaff7f6330abe97d828e9ac8e002fdc601a02))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.10 ([51482ed](https://github.com/DanySK/gradle-kotlin-qa/commit/51482ed266c2a8dd7808406258113f4b4d9a084f))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.7 ([7152c4f](https://github.com/DanySK/gradle-kotlin-qa/commit/7152c4f9162273a9099062ef7b1e4274ca1eb751))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.8 ([70b49ab](https://github.com/DanySK/gradle-kotlin-qa/commit/70b49abfd1e9bbb7e98b8d17ac46bb9825252200))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.9 ([d072627](https://github.com/DanySK/gradle-kotlin-qa/commit/d0726276ff790e42a9ba39a6d9c02470db1ed82f))

## [0.60.3](https://github.com/DanySK/gradle-kotlin-qa/compare/0.60.2...0.60.3) (2024-03-07)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v1.9.23 ([0052302](https://github.com/DanySK/gradle-kotlin-qa/commit/00523021ebb14b2fea6dd02e5e409d384d7a4621))
* **deps:** update plugin kotlin-qa to v0.60.2 ([d719175](https://github.com/DanySK/gradle-kotlin-qa/commit/d7191752f2f08c4a618cb079723d10dc7d8edea4))
* **deps:** update plugin publishoncentral to v5.0.24 ([093f004](https://github.com/DanySK/gradle-kotlin-qa/commit/093f004cb5abf71bb6bd771f7b97acf12c27ff29))
* **deps:** update plugin publishoncentral to v5.0.25 ([5f7720c](https://github.com/DanySK/gradle-kotlin-qa/commit/5f7720c4ee8ea8de871ff371f9a0a540d20a59ee))

## [0.60.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.60.1...0.60.2) (2024-03-04)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.9.20 ([554eb33](https://github.com/DanySK/gradle-kotlin-qa/commit/554eb33863ecd4bf9a3a5e5a63df7d30ccbda216))
* **deps:** update dependency org.mockito:mockito-core to v5.11.0 ([60d8455](https://github.com/DanySK/gradle-kotlin-qa/commit/60d8455af6a33654b180da8474c158d521d2a0af))
* **deps:** update plugin gitsemver to v3.1.2 ([c026243](https://github.com/DanySK/gradle-kotlin-qa/commit/c026243680f7b935ffa358c5f8a3832654b4ba24))
* **deps:** update plugin kotlin-qa to v0.60.1 ([a316023](https://github.com/DanySK/gradle-kotlin-qa/commit/a3160231e889406e1b940fb10c03967eeafa5c80))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.1 ([40ad620](https://github.com/DanySK/gradle-kotlin-qa/commit/40ad620fe44aba194bebc8f5b8573849967b2031))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.2 ([434a985](https://github.com/DanySK/gradle-kotlin-qa/commit/434a9855fc9b0956e86b7e2d621405bb4a97cd0b))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.0 ([ec05d4a](https://github.com/DanySK/gradle-kotlin-qa/commit/ec05d4a74070fba18e35612cbdaaf55a4a4a5e19))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.1 ([61a7bf8](https://github.com/DanySK/gradle-kotlin-qa/commit/61a7bf8bedc68f883bed657ec800e8b6651d84fb))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.2 ([9036a74](https://github.com/DanySK/gradle-kotlin-qa/commit/9036a74c48763c04a145d86dffe2cbea1e21633d))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.3 ([f13139a](https://github.com/DanySK/gradle-kotlin-qa/commit/f13139a407d7fd7fe9cc57e85a2c56c144d3dc85))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.4 ([20fd905](https://github.com/DanySK/gradle-kotlin-qa/commit/20fd9059f59e43b50c656c6ebba1750961a675f8))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.5 ([a8dd9e2](https://github.com/DanySK/gradle-kotlin-qa/commit/a8dd9e2ec026f37e1038288b91a9586b90878c79))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.6 ([efbbb05](https://github.com/DanySK/gradle-kotlin-qa/commit/efbbb051cd4610fc597f3e262ec3ea3d4c803528))

## [0.60.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.60.0...0.60.1) (2024-02-09)


### Revert previous changes

* Revert "chore(api-deps): update dependency com.pinterest:ktlint to v0.51.0-final" ([2525c62](https://github.com/DanySK/gradle-kotlin-qa/commit/2525c629b16c992102f8318b831f6c064fc89717))
* Revert "chore(deps): update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.1" ([1cda4fb](https://github.com/DanySK/gradle-kotlin-qa/commit/1cda4fba34a07600b32727ee616cbbf96e09d19c))
* Revert "chore(release): 0.60.0 [skip ci]" ([608f707](https://github.com/DanySK/gradle-kotlin-qa/commit/608f7078dccdfa906658c3fd147b46a85e50b805))
* Revert "ci(deps): update danysk/build-check-deploy-gradle-action action to v2.3.0" ([08d3c93](https://github.com/DanySK/gradle-kotlin-qa/commit/08d3c93e713f778d29149926b31e0361ba49b8df))
* Revert "ci(deps): update danysk/build-check-deploy-gradle-action action to v2.3.1" ([7a25619](https://github.com/DanySK/gradle-kotlin-qa/commit/7a25619b4c20d7aaf6549ee87816401c7f8c1a0b))
* Revert "ci(deps): update danysk/build-check-deploy-gradle-action action to v2.3.2" ([4ba65cb](https://github.com/DanySK/gradle-kotlin-qa/commit/4ba65cbb5eb1e66e9204cad8e52308531064ccc3))
* Revert "ci(deps): update danysk/build-check-deploy-gradle-action action to v2.4.0" ([bcb0685](https://github.com/DanySK/gradle-kotlin-qa/commit/bcb068510af1851dc5ce35eda74ec4c237aa2356))

## [0.59.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.59.0...0.59.1) (2024-02-02)


### Dependency updates

* **core-deps:** update dependency gradle to v8.6 ([cfff9d2](https://github.com/DanySK/gradle-kotlin-qa/commit/cfff9d28c2d4d3e784d8faacfa470b0ff8a1953a))
* **deps:** update plugin kotlin-qa to v0.59.0 ([9157634](https://github.com/DanySK/gradle-kotlin-qa/commit/9157634102a84ee220da501429056e653aefc832))
* **deps:** update plugin multijvmtesting to v0.5.8 ([932e537](https://github.com/DanySK/gradle-kotlin-qa/commit/932e537012d8d9c2de36c1d0434aaa9a51e2bbe7))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.17 ([2e9a74d](https://github.com/DanySK/gradle-kotlin-qa/commit/2e9a74db2081177eb1a2b13ddd3165f90fa947e0))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.18 ([fa11af8](https://github.com/DanySK/gradle-kotlin-qa/commit/fa11af891e3e9d70a408a2da2d841371e637ec67))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.19 ([a3ad9a0](https://github.com/DanySK/gradle-kotlin-qa/commit/a3ad9a01ff6dd0f831d5661ac0c4bf8738bff7be))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.20 ([f2dafb5](https://github.com/DanySK/gradle-kotlin-qa/commit/f2dafb537013ee1ec8beb2a3668fe6ab8c385bd4))

## [0.59.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.58.0...0.59.0) (2024-01-31)


### Dependency updates

* **api-deps:** update detekt to v1.23.5 ([47ac829](https://github.com/DanySK/gradle-kotlin-qa/commit/47ac8293749059056c5db33beec2b2c5f049a3ca))
* **deps:** update dependency org.mockito:mockito-core to v5.10.0 ([9c611a2](https://github.com/DanySK/gradle-kotlin-qa/commit/9c611a28b58fb7cedcc6125546b194b90f2e1c22))
* **deps:** update dependency org.mockito:mockito-core to v5.9.0 ([2337b52](https://github.com/DanySK/gradle-kotlin-qa/commit/2337b52c87582dfee558f4e398210be24204c4d5))
* **deps:** update plugin com.gradle.enterprise to v3.16.2 ([6bd580b](https://github.com/DanySK/gradle-kotlin-qa/commit/6bd580bc79804e4d2561bfd37c746699c868b892))
* **deps:** update plugin gitsemver to v3 ([8d91180](https://github.com/DanySK/gradle-kotlin-qa/commit/8d9118080f1656659de2a46ae06cc0ced0efc01b))
* **deps:** update plugin gitsemver to v3.1.0 ([17962a4](https://github.com/DanySK/gradle-kotlin-qa/commit/17962a47c71ade42d12f55e41539d422353bd25d))
* **deps:** update plugin kotlin-qa to v0.58.0 ([8d84a6c](https://github.com/DanySK/gradle-kotlin-qa/commit/8d84a6c13228388f4811e510138083a407ef43bf))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.8.0 ([c91d468](https://github.com/DanySK/gradle-kotlin-qa/commit/c91d468d875aa688d6a8047b760c64886071757e))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.13 ([01404b1](https://github.com/DanySK/gradle-kotlin-qa/commit/01404b1f2d4af160a3647b1108887a89c4f039a4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.14 ([dfa1103](https://github.com/DanySK/gradle-kotlin-qa/commit/dfa110360e89f3c906a99b04bb5d2ddf30f2f302))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.15 ([99838cd](https://github.com/DanySK/gradle-kotlin-qa/commit/99838cd141af63a3f930af5170ee5785e415352c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.16 ([bcd1ff9](https://github.com/DanySK/gradle-kotlin-qa/commit/bcd1ff98a5a026ff60fe7e4c5aa9216527eacc5a))

## [0.58.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.57.1...0.58.0) (2024-01-09)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12.1.0 ([d59f205](https://github.com/DanySK/gradle-kotlin-qa/commit/d59f2050b3c25a6503def5e3798cd3df2d73f783))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.85 ([c137245](https://github.com/DanySK/gradle-kotlin-qa/commit/c137245d0a4b588c2b8cf43f500aea29176ad3a4))
* **deps:** update node.js to 20.11 ([54ce067](https://github.com/DanySK/gradle-kotlin-qa/commit/54ce06796c01ca229c1f244f74d93798f7bc2d4d))
* **deps:** update plugin gitsemver to v2.0.5 ([8f98029](https://github.com/DanySK/gradle-kotlin-qa/commit/8f980297f7fb6c862ff7112a4ea377cb25a02709))
* **deps:** update plugin kotlin-qa to v0.57.1 ([54f9f04](https://github.com/DanySK/gradle-kotlin-qa/commit/54f9f045aed4e0398e95f934e1484a25d6b23923))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.17 ([7ffa924](https://github.com/DanySK/gradle-kotlin-qa/commit/7ffa92423ebb09c246237f15e299db0559d036cd))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.18 ([f83d4ae](https://github.com/DanySK/gradle-kotlin-qa/commit/f83d4aefad4c74b2f19f9e4c78d29285e788e90b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2 ([ddfd48e](https://github.com/DanySK/gradle-kotlin-qa/commit/ddfd48edea6016d24255394096f57752a809dd0f))
* **deps:** update plugin publishoncentral to v5.0.22 ([340e2c8](https://github.com/DanySK/gradle-kotlin-qa/commit/340e2c8a6d090646a2c36be9b402e1a471017912))

## [0.57.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.57.0...0.57.1) (2023-12-21)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.9.22 ([1445607](https://github.com/DanySK/gradle-kotlin-qa/commit/144560713109207296fede35e708ffa414ba7fff))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.81 ([b2d71a5](https://github.com/DanySK/gradle-kotlin-qa/commit/b2d71a57986821476393203ed64b2dbe519efbcc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.82 ([56d997b](https://github.com/DanySK/gradle-kotlin-qa/commit/56d997b44e55e74d7942d53938db16881e7d60e7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.83 ([6ffe4b1](https://github.com/DanySK/gradle-kotlin-qa/commit/6ffe4b1d5f689e39909ee7bdc69ea032cfdf5cb4))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.84 ([dfdaca3](https://github.com/DanySK/gradle-kotlin-qa/commit/dfdaca3e0dc57a9aec0bb1c7d6add70c1062e723))
* **deps:** update plugin com.gradle.enterprise to v3.16.1 ([6398cb1](https://github.com/DanySK/gradle-kotlin-qa/commit/6398cb16ab568e02ec60bbfd4c2942c4f731fc7b))
* **deps:** update plugin kotlin-qa to v0.57.0 ([65c3852](https://github.com/DanySK/gradle-kotlin-qa/commit/65c3852b4b5edf6cef6992b33540ab9232488de0))

## [0.57.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.56.0...0.57.0) (2023-12-11)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12.0.3 ([fc41881](https://github.com/DanySK/gradle-kotlin-qa/commit/fc418818e5583592241374234061f580a7df7cb7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.79 ([f499a23](https://github.com/DanySK/gradle-kotlin-qa/commit/f499a23ed2b425ac4d9ba9f5eb64d9c50cfa97b4))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.80 ([b0e58bd](https://github.com/DanySK/gradle-kotlin-qa/commit/b0e58bd4a2d79b8164cd66535bb810059b4adba4))
* **deps:** update plugin com.gradle.enterprise to v3.16 ([60ef325](https://github.com/DanySK/gradle-kotlin-qa/commit/60ef32517be3a4a6b5b1900b3e47e1f6710d1a9d))
* **deps:** update plugin kotlin-qa to v0.56.0 ([7be5f8f](https://github.com/DanySK/gradle-kotlin-qa/commit/7be5f8fe0c98c4be6e145fb4d39706d9e968b140))

## [0.56.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.55.2...0.56.0) (2023-12-02)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v12 ([2dcbdec](https://github.com/DanySK/gradle-kotlin-qa/commit/2dcbdec6622cea5bd9484d5cfe9b57169f63582b))
* **deps:** update dependency org.mockito:mockito-core to v5.8.0 ([8bfaee2](https://github.com/DanySK/gradle-kotlin-qa/commit/8bfaee28e8a9eeba8af911354e23c072203dd231))
* **deps:** update plugin gitsemver to v2.0.4 ([50a5a06](https://github.com/DanySK/gradle-kotlin-qa/commit/50a5a067a66c3d2a656e6fd025f18e37d33bcd2b))
* **deps:** update plugin kotlin-qa to v0.55.2 ([3fa03bd](https://github.com/DanySK/gradle-kotlin-qa/commit/3fa03bd617833ee16f1ba0beebe80ef259f9763a))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.16 ([dd4601f](https://github.com/DanySK/gradle-kotlin-qa/commit/dd4601f738b33876097c255c02efcf5d16ac339e))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.12 ([7550a04](https://github.com/DanySK/gradle-kotlin-qa/commit/7550a046081e8edef5c982d8301a8813fb510b44))

## [0.55.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.55.1...0.55.2) (2023-11-29)


### Dependency updates

* **core-deps:** update dependency gradle to v8.5 ([9a638c0](https://github.com/DanySK/gradle-kotlin-qa/commit/9a638c037ec911e604de31ef4d9217beff47567c))
* **deps:** update plugin kotlin-qa to v0.55.0 ([ed6b1c6](https://github.com/DanySK/gradle-kotlin-qa/commit/ed6b1c638cbfd2a34895cd0c12ee7cc106a3a7f9))
* **deps:** update plugin kotlin-qa to v0.55.1 ([bae1587](https://github.com/DanySK/gradle-kotlin-qa/commit/bae15878a6478b95e821302f9ec6ca479f724841))
* **deps:** update plugin multijvmtesting to v0.5.7 ([017da58](https://github.com/DanySK/gradle-kotlin-qa/commit/017da586d0c8aaa2bc50c895fa54b7e97e401b78))

## [0.55.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.55.0...0.55.1) (2023-11-26)


### Dependency updates

* **core-deps:** update dependency gradle to v8.4 ([0d02a24](https://github.com/DanySK/gradle-kotlin-qa/commit/0d02a24ca51eb516514cfd41c3c5bcdab8db09d5))


### Style improvements

* remove calls to deprecated property `Project.buildDir` ([916dfd5](https://github.com/DanySK/gradle-kotlin-qa/commit/916dfd5effa973b40f2bce02f10bf56810be0fed))

## [0.55.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.54.1...0.55.0) (2023-11-26)


### Dependency updates

* **api-deps:** update detekt to v1.23.4 ([d62cd91](https://github.com/DanySK/gradle-kotlin-qa/commit/d62cd91884c0e88030bd359b1f0433779b90a016))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.78 ([163cbd6](https://github.com/DanySK/gradle-kotlin-qa/commit/163cbd67c40c91f3ded09b13bd23033b35ab0eae))
* **deps:** update plugin gitsemver to v2.0.3 ([e5d51cf](https://github.com/DanySK/gradle-kotlin-qa/commit/e5d51cfbb5260cb7acecf75af88c61aad10e1530))
* **deps:** update plugin kotlin-qa to v0.54.1 ([488cc33](https://github.com/DanySK/gradle-kotlin-qa/commit/488cc3389acb949ef370c36c75c9f54a4690fa5b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.15 ([15a9afb](https://github.com/DanySK/gradle-kotlin-qa/commit/15a9afb95c29f3436a4d8c9b820a644296f12b53))

## [0.54.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.54.0...0.54.1) (2023-11-23)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v1.9.21 ([e886b84](https://github.com/DanySK/gradle-kotlin-qa/commit/e886b84ffd6d614f9bef1141c94a20de8f94b555))
* **deps:** update dependency org.mockito:mockito-core to v5.7.0 ([1ae4b5c](https://github.com/DanySK/gradle-kotlin-qa/commit/1ae4b5cc4e95343d2077393644567882ec800839))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.71 ([702b626](https://github.com/DanySK/gradle-kotlin-qa/commit/702b6264cbdf58d038d07e73d51bbf867c3c953b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.72 ([8a10075](https://github.com/DanySK/gradle-kotlin-qa/commit/8a100756083a2118a30fed90a42e8de4633a5dea))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.74 ([376730d](https://github.com/DanySK/gradle-kotlin-qa/commit/376730da14d434209463660f8ace04ea8a4927b8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.75 ([abeeca3](https://github.com/DanySK/gradle-kotlin-qa/commit/abeeca3a6c876be9c9471e080b442df28e15f73c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.76 ([dce5f34](https://github.com/DanySK/gradle-kotlin-qa/commit/dce5f34d090d1e7757b1768c6cbd43b4b01bcbe1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.77 ([e38d300](https://github.com/DanySK/gradle-kotlin-qa/commit/e38d3008135bec8ea966cc89805ced6d139ee459))
* **deps:** update kotest to v5.8.0 ([0f23b07](https://github.com/DanySK/gradle-kotlin-qa/commit/0f23b076e9401d15dfc6fc831d556fea0dc9bd37))
* **deps:** update node.js to 20.10 ([608f4e4](https://github.com/DanySK/gradle-kotlin-qa/commit/608f4e4c7b6bf45da5c9defde8c646aff0d8a873))
* **deps:** update plugin gitsemver to v2.0.2 ([4f0f844](https://github.com/DanySK/gradle-kotlin-qa/commit/4f0f844d157d849c3d4a26338693a517b547155d))
* **deps:** update plugin kotlin-qa to v0.54.0 ([6c869da](https://github.com/DanySK/gradle-kotlin-qa/commit/6c869dae123504a52f505cbdfe511a08f2a9c793))
* **deps:** update plugin publishoncentral to v5.0.17 ([7b225f7](https://github.com/DanySK/gradle-kotlin-qa/commit/7b225f7fa8fd24deb450524423ddc7b04d3228b7))
* **deps:** update plugin publishoncentral to v5.0.18 ([03ab133](https://github.com/DanySK/gradle-kotlin-qa/commit/03ab133f6be8fbb611cb6cfb045bc7da4c406e79))
* **deps:** update plugin publishoncentral to v5.0.19 ([2cf7375](https://github.com/DanySK/gradle-kotlin-qa/commit/2cf737560ff5fd34401571ec2fbe1d11afa8dc4c))
* **deps:** update plugin publishoncentral to v5.0.20 ([ccc1b88](https://github.com/DanySK/gradle-kotlin-qa/commit/ccc1b880be347cfd290fdd29abe8cc55e1b61a51))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.11 ([8893396](https://github.com/DanySK/gradle-kotlin-qa/commit/8893396749aeaa855c63addd949a3c946aac0d6a))

## [0.54.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.53.0...0.54.0) (2023-10-31)


### Dependency updates

* **api-deps:** update detekt to v1.23.3 ([809973d](https://github.com/DanySK/gradle-kotlin-qa/commit/809973d21374a9273d05b6721c406b2892406dd1))
* **deps:** update plugin kotlin-qa to v0.53.0 ([2c3d79c](https://github.com/DanySK/gradle-kotlin-qa/commit/2c3d79c2df47dfd11afd253c159554d023599d00))

## [0.53.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.52.0...0.53.0) (2023-10-31)


### Dependency updates

* **api-deps:** update detekt to v1.23.2 ([1302248](https://github.com/DanySK/gradle-kotlin-qa/commit/1302248fdfe5902996b99a959e187fd152faa430))
* **deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.9.10 ([220eb87](https://github.com/DanySK/gradle-kotlin-qa/commit/220eb87c2f7e9b75df7e01ed08e7fbd9cc927349))
* **deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.9.20 ([ac8a2ac](https://github.com/DanySK/gradle-kotlin-qa/commit/ac8a2acf109e2dd0efefefcf0c133ce94a00c0e5))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.69 ([0dea06d](https://github.com/DanySK/gradle-kotlin-qa/commit/0dea06dca3c729f04ff70937d4ecf152d331c820))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.70 ([137d2e3](https://github.com/DanySK/gradle-kotlin-qa/commit/137d2e33f38e367a225a0050016958173770bd7f))
* **deps:** update node.js to 20.9 ([306f1f0](https://github.com/DanySK/gradle-kotlin-qa/commit/306f1f0e2afb740b89fec9200b7101151849d759))
* **deps:** update node.js to v20 ([bc78baa](https://github.com/DanySK/gradle-kotlin-qa/commit/bc78baae7724a33a104a800d74acadc241cae005))
* **deps:** update plugin gitsemver to v1.1.15 ([6fe9738](https://github.com/DanySK/gradle-kotlin-qa/commit/6fe9738db7a3fb7db15b6877654560caee7adc72))
* **deps:** update plugin gitsemver to v2 ([3553c29](https://github.com/DanySK/gradle-kotlin-qa/commit/3553c29f9cd56ee42d41170d249ca558d30ef206))
* **deps:** update plugin gitsemver to v2.0.1 ([a39cdf9](https://github.com/DanySK/gradle-kotlin-qa/commit/a39cdf9841c53c963a62506702ed90662d8332db))
* **deps:** update plugin kotlin-qa to v0.52.0 ([9cf34c0](https://github.com/DanySK/gradle-kotlin-qa/commit/9cf34c0983a5d9659ddb452fc431966844849c14))
* **deps:** update plugin multijvmtesting to v0.5.6 ([61b7cb1](https://github.com/DanySK/gradle-kotlin-qa/commit/61b7cb12d4fdc5df25b65dadef170b0532d312c5))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.13 ([0027010](https://github.com/DanySK/gradle-kotlin-qa/commit/0027010cafb44d902e205afd7500edb59516e5a5))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.14 ([37ce0d3](https://github.com/DanySK/gradle-kotlin-qa/commit/37ce0d3200d83fce2b2b616b93d591fc209cdea0))
* **deps:** update plugin publishoncentral to v5.0.16 ([8754786](https://github.com/DanySK/gradle-kotlin-qa/commit/8754786cb5ee2ee571e07d9733e2b5d7dcf63ed7))


### Build and continuous integration

* **deps:** update danysk/action-checkout action to v0.2.14 ([7dd8233](https://github.com/DanySK/gradle-kotlin-qa/commit/7dd82332010a08f7f6bcac1583829513d5d322a7))
* exclude detekt from the kotlin version enforcement ([2968594](https://github.com/DanySK/gradle-kotlin-qa/commit/2968594c50e258102d8e35b96a375d9b590dffc0))

## [0.52.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.51.1...0.52.0) (2023-10-17)


### Dependency updates

* **api-deps:** update Kotlin to 1.9.0 and plugin kotlin-qa to v0.51.1 ([#469](https://github.com/DanySK/gradle-kotlin-qa/issues/469)) ([3c685c2](https://github.com/DanySK/gradle-kotlin-qa/commit/3c685c2eea181772c3d3ddfb528577f09b560e26))
* **deps:** update jacoco to v0.8.11 ([1a44793](https://github.com/DanySK/gradle-kotlin-qa/commit/1a44793840d874bfa72aaf2ca6031c15e37af5b5))
* **deps:** update plugin gitsemver to v1.1.11 ([9d78ac6](https://github.com/DanySK/gradle-kotlin-qa/commit/9d78ac6d14fb619ad002238cd2236ad215ac4169))
* **deps:** update plugin gitsemver to v1.1.12 ([c7ac995](https://github.com/DanySK/gradle-kotlin-qa/commit/c7ac995ef7fd34cfe477c72c58444f0a55757e8e))
* **deps:** update plugin gitsemver to v1.1.13 ([3022edc](https://github.com/DanySK/gradle-kotlin-qa/commit/3022edcfdca0c398fdc02c41829f6bb992bfbb3f))
* **deps:** update plugin gitsemver to v1.1.14 ([c4e5048](https://github.com/DanySK/gradle-kotlin-qa/commit/c4e5048e352ec415ab4e07f5f06fe40e414c1abb))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.11 ([1df2816](https://github.com/DanySK/gradle-kotlin-qa/commit/1df2816824be7bb489901344a0ab65ea269921f9))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.1 ([1fab2d1](https://github.com/DanySK/gradle-kotlin-qa/commit/1fab2d1579066b7b05f6ad88d34ab188f123368c))
* **mergify:** point to the shared Mergify configuration ([e671faa](https://github.com/DanySK/gradle-kotlin-qa/commit/e671faa1d422260f4764abda27ebef2ffd145f28))

## [0.51.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.51.0...0.51.1) (2023-10-16)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.9.10 ([0c865e7](https://github.com/DanySK/gradle-kotlin-qa/commit/0c865e7912220325dd5870ebacd260ca1267b125))

## [0.51.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.50.0...0.51.0) (2023-10-10)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.6.1 ([30a9d86](https://github.com/DanySK/gradle-kotlin-qa/commit/30a9d86696e79609e6e7056dda9bc09276e5d8c2))
* **deps:** update dependency org.mockito:mockito-core to v5.6.0 ([a1484aa](https://github.com/DanySK/gradle-kotlin-qa/commit/a1484aab4438ab5cef463b9eaddb90ab1000d34a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.66 ([53cf981](https://github.com/DanySK/gradle-kotlin-qa/commit/53cf981f886ba726d43957189b3ad87254877cce))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.67 ([72d8985](https://github.com/DanySK/gradle-kotlin-qa/commit/72d898518397e7bdd3cc65723f9bff83e9c9e017))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.68 ([24aeb2c](https://github.com/DanySK/gradle-kotlin-qa/commit/24aeb2c64028da8d3af2095d4af5b114fb7060f9))
* **deps:** update node.js to 18.18 ([0ae46c6](https://github.com/DanySK/gradle-kotlin-qa/commit/0ae46c6acce754a0e7fde5e6ff164a7ca21870e9))
* **deps:** update plugin com.gradle.enterprise to v3.15.1 ([fe3c372](https://github.com/DanySK/gradle-kotlin-qa/commit/fe3c372481716905d3e7765de1c019cc7ad400b7))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.0 ([ca09aaa](https://github.com/DanySK/gradle-kotlin-qa/commit/ca09aaa9fa1d1a3d8ed8759a122873bf4db5cd12))
* **deps:** update danysk/action-checkout action to v0.2.13 ([4f7fbdf](https://github.com/DanySK/gradle-kotlin-qa/commit/4f7fbdf33f373f6ac7cca9774da5ab05d072872b))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.10 ([7f7f2a8](https://github.com/DanySK/gradle-kotlin-qa/commit/7f7f2a839e18e7a093ca2a51fbdd6955f0d249a3))

## [0.50.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.49.1...0.50.0) (2023-09-18)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.6.0 ([5af416a](https://github.com/DanySK/gradle-kotlin-qa/commit/5af416aae29ab01c5a1bc5552568e45e5c04bb7b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.49 ([202b7b7](https://github.com/DanySK/gradle-kotlin-qa/commit/202b7b77c7cd2f88620b54f78ce9bfecb573e921))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.50 ([2994532](https://github.com/DanySK/gradle-kotlin-qa/commit/2994532a834b5588621b4ac7063e15b017db51c1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.51 ([baff02a](https://github.com/DanySK/gradle-kotlin-qa/commit/baff02ad1a41af1ec3d0d953cef8b6502bf39d6a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.52 ([79ea647](https://github.com/DanySK/gradle-kotlin-qa/commit/79ea647a8864679903a148ae36ca4ed13f8553bb))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.53 ([9ed7ab9](https://github.com/DanySK/gradle-kotlin-qa/commit/9ed7ab92320c142aaa92968eb912747782ee599d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.54 ([082e2a2](https://github.com/DanySK/gradle-kotlin-qa/commit/082e2a218165a74d42d298293f698d8409854a71))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.55 ([2a7fd0e](https://github.com/DanySK/gradle-kotlin-qa/commit/2a7fd0e2e97133977164ac61c76d14c60aec124c))
* **deps:** update kotest to v5.7.2 ([f253884](https://github.com/DanySK/gradle-kotlin-qa/commit/f2538843f6feaf262a643e0c1bd2fcc69198a8c9))
* **deps:** update plugin com.gradle.enterprise to v3.15 ([0c6aa67](https://github.com/DanySK/gradle-kotlin-qa/commit/0c6aa67c6d3f7bd0ec97850e12716bc574f96346))


### Build and continuous integration

* **deps:** update actions/checkout action to v4 ([1d03d6c](https://github.com/DanySK/gradle-kotlin-qa/commit/1d03d6c6c8ab82ffdff6d2ee517185edaeb7c8c1))
* **deps:** update danysk/action-checkout action to v0.2.12 ([b366fc9](https://github.com/DanySK/gradle-kotlin-qa/commit/b366fc9ec416314e15aa0492f9ccf6066c65031f))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.9 ([fd33618](https://github.com/DanySK/gradle-kotlin-qa/commit/fd3361847fb71d9b56169c62ffa7545687d30c4e))

## [0.49.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.49.0...0.49.1) (2023-09-01)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.6.0 ([de605ec](https://github.com/DanySK/gradle-kotlin-qa/commit/de605ecd0f6c3a9aca180d3fc2fbdf8675d73b35))
* **deps:** update danysk/action-checkout action to v0.2.11 ([87fdcdb](https://github.com/DanySK/gradle-kotlin-qa/commit/87fdcdb177c251c9fc1292245a3faf0c241479f1))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.9.0 ([46f2666](https://github.com/DanySK/gradle-kotlin-qa/commit/46f2666282cccb853f3ac41819ce916f2fc5358d))
* **deps:** update dependency org.mockito:mockito-core to v5.5.0 ([b9b42e1](https://github.com/DanySK/gradle-kotlin-qa/commit/b9b42e1479498dbfd874cf9923bc6c754336497a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.44 ([65cced4](https://github.com/DanySK/gradle-kotlin-qa/commit/65cced4ffb41f9942451a8b57511889c70f84fdf))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.45 ([bd55fda](https://github.com/DanySK/gradle-kotlin-qa/commit/bd55fdaa979340906f61b1c8ffbe2de907ab990f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.46 ([bc1adf8](https://github.com/DanySK/gradle-kotlin-qa/commit/bc1adf88d3ca538a09dc6eeb85b6f1b7bcbdcf32))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.47 ([d07ab17](https://github.com/DanySK/gradle-kotlin-qa/commit/d07ab176eb0dafca19d541ad167b8cdcf7cfeed1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.48 ([12ab7e8](https://github.com/DanySK/gradle-kotlin-qa/commit/12ab7e8c4b9ebe7fd4f6fb8407c8f6827d507cb6))
* **deps:** update plugin gradlepluginpublish to v1.2.1 ([c41b280](https://github.com/DanySK/gradle-kotlin-qa/commit/c41b280846fb673872fbfe517ee04967496c3a17))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.10 ([8750f44](https://github.com/DanySK/gradle-kotlin-qa/commit/8750f44b213f91fa1b754de24b8cd3dc83cef8fb))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.7.0 ([5bd5c07](https://github.com/DanySK/gradle-kotlin-qa/commit/5bd5c073aa1c3f6ca34f55bfec25dd0daab2de20))

## [0.49.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.48.0...0.49.0) (2023-08-07)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.5.1 ([728fdfb](https://github.com/DanySK/gradle-kotlin-qa/commit/728fdfb5ad9b66d4e90690c10b5e7d312d047bd8))

## [0.48.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.47.1...0.48.0) (2023-07-29)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.7 ([967d1c6](https://github.com/DanySK/gradle-kotlin-qa/commit/967d1c63a0ed105ce40a6899be1859c04b3b9fbb))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.8 ([44d48a2](https://github.com/DanySK/gradle-kotlin-qa/commit/44d48a214504e48c3d2f784f484801ca89269f34))


### Dependency updates

* **api-deps:** update detekt to v1.23.1 ([98fbb59](https://github.com/DanySK/gradle-kotlin-qa/commit/98fbb59af4e8d0269a8388b0b3f0f3568d446a43))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.40 ([9821173](https://github.com/DanySK/gradle-kotlin-qa/commit/9821173a823492bc894eb49ef1457f9e6b9c8b75))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.41 ([5ff20c9](https://github.com/DanySK/gradle-kotlin-qa/commit/5ff20c975026c1bf1d0bc332cb3c68c311d21a6d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.42 ([a985741](https://github.com/DanySK/gradle-kotlin-qa/commit/a98574119c72e8e5a2c17d71a5720c05f1164cff))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.43 ([e8d643f](https://github.com/DanySK/gradle-kotlin-qa/commit/e8d643f56be2dded8be2395466c933aeaa9dca8e))
* **deps:** update node.js to 18.17 ([d1fa879](https://github.com/DanySK/gradle-kotlin-qa/commit/d1fa879d17d446ea70231b0716bdd628fd63552b))
* **deps:** update plugin com.gradle.enterprise to v3.14 ([e48dbe1](https://github.com/DanySK/gradle-kotlin-qa/commit/e48dbe1a5a5d59003b4209a08bec3ed8f62165b1))
* **deps:** update plugin com.gradle.enterprise to v3.14.1 ([2cff5b0](https://github.com/DanySK/gradle-kotlin-qa/commit/2cff5b0652aadc134dbec3851bcb3e70ee53bb1f))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.6.0 ([f20927c](https://github.com/DanySK/gradle-kotlin-qa/commit/f20927cdf884a29e15c01c8e6fa3f98091590eef))

## [0.47.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.47.0...0.47.1) (2023-07-10)


### Dependency updates

* **core-deps:** update dependency gradle to v8.2.1 ([9530347](https://github.com/DanySK/gradle-kotlin-qa/commit/95303475690d645d809dea59605509481329f0d8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.39 ([e6cac39](https://github.com/DanySK/gradle-kotlin-qa/commit/e6cac39e9d8927867268562d700a70f2b574d4f6))

## [0.47.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.46.1...0.47.0) (2023-07-04)


### Dependency updates

* **api-deps:** update dependency com.pinterest:ktlint to v0.50.0 ([03bdaaf](https://github.com/DanySK/gradle-kotlin-qa/commit/03bdaaf582ecf022ab086d126d99d841e8133af6))
* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.5.0 ([f34a9fb](https://github.com/DanySK/gradle-kotlin-qa/commit/f34a9fb5aa1307f84688c37bceb26dd68742468e))

## [0.46.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.46.0...0.46.1) (2023-06-30)


### Dependency updates

* **core-deps:** update dependency gradle to v8.2 ([56febe7](https://github.com/DanySK/gradle-kotlin-qa/commit/56febe7c4c1c003ed82166344df03cf2ef0c042c))
* **deps:** update dependency io.github.mirko-felice.testkit:core to v0.9.0 ([bb1327f](https://github.com/DanySK/gradle-kotlin-qa/commit/bb1327f9028ccdced25e6055975b1553f0d7c7cc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.38 ([4834da9](https://github.com/DanySK/gradle-kotlin-qa/commit/4834da94209301f7887175dfec41d33400b09308))

## [0.46.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.45.0...0.46.0) (2023-06-22)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.4.2 ([b1273c7](https://github.com/DanySK/gradle-kotlin-qa/commit/b1273c7c56997985617c0c87f06d5515ec445bb6))

## [0.45.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.44.0...0.45.0) (2023-06-21)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.3 ([76fb516](https://github.com/DanySK/gradle-kotlin-qa/commit/76fb516e5342005df77bc70b3333e9ee712a83d3))
* **deps:** update danysk/action-checkout action to v0.2.10 ([485d985](https://github.com/DanySK/gradle-kotlin-qa/commit/485d985b296321b4111ff9332b182aa458567d41))
* disable the fail fast mode on matrix jobs ([ccdf66b](https://github.com/DanySK/gradle-kotlin-qa/commit/ccdf66b59c8f06de7a400bfbe8c8cc8c3e77d5df))


### Tests

* use the new testkit library ([#489](https://github.com/DanySK/gradle-kotlin-qa/issues/489)) ([48d46af](https://github.com/DanySK/gradle-kotlin-qa/commit/48d46af4564ad2d3a6b0b81363255a0f1aa91a42))


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.4.1 ([103ef7d](https://github.com/DanySK/gradle-kotlin-qa/commit/103ef7d9c681667151de291c4b7d38c9bb1a348d))
* **deps:** update dependency io.github.mirko-felice.testkit:core to v0.8.4 ([95458b6](https://github.com/DanySK/gradle-kotlin-qa/commit/95458b6a5126ba9e00d13409e71910b578545345))
* **deps:** update dependency org.mockito:mockito-core to v5.4.0 ([5422076](https://github.com/DanySK/gradle-kotlin-qa/commit/5422076424e6849460ba8fa0bfae3f22f4887ed5))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.32 ([5e0d03f](https://github.com/DanySK/gradle-kotlin-qa/commit/5e0d03f7b1fe5be6c139fed53053e1f93d5b214e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.35 ([e501eaa](https://github.com/DanySK/gradle-kotlin-qa/commit/e501eaad51cfe07aeb5c4f23b066361888420277))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.36 ([1e420e7](https://github.com/DanySK/gradle-kotlin-qa/commit/1e420e7d25a3efb04932e856f512640cd01c87f8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.37 ([8ff51d2](https://github.com/DanySK/gradle-kotlin-qa/commit/8ff51d204d3d4eae855c875568349eab13f2c01d))
* **deps:** update plugin com.gradle.enterprise to v3.13.4 ([43163d4](https://github.com/DanySK/gradle-kotlin-qa/commit/43163d42ea152440615b40ba109b3c972b3148bb))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.9 ([103af25](https://github.com/DanySK/gradle-kotlin-qa/commit/103af25ddb27bf881b135c09a220cff8c63fe54b))

## [0.44.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.43.0...0.44.0) (2023-06-06)


### Dependency updates

* **api-deps:** update dependency com.pinterest:ktlint to v0.49.1 ([3c26449](https://github.com/DanySK/gradle-kotlin-qa/commit/3c26449eb232efa94ab19710ee0f859965ac2260))

## [0.43.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.42.1...0.43.0) (2023-06-06)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.4.0 ([a30bb2a](https://github.com/DanySK/gradle-kotlin-qa/commit/a30bb2ac54f7f55fa7102bab0a4a1c0b567d3ece))
* **deps:** update plugin gitsemver to v1.1.10 ([c1b50e7](https://github.com/DanySK/gradle-kotlin-qa/commit/c1b50e735c793d23350f473cf5328287fbac7463))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.8 ([afd0dea](https://github.com/DanySK/gradle-kotlin-qa/commit/afd0dea2002f03bc3fb22e7126dbf75bcbf48899))

## [0.42.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.42.0...0.42.1) (2023-06-05)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.8.20 ([1333528](https://github.com/DanySK/gradle-kotlin-qa/commit/133352827f80eb2c78d6e6c9192a61903b29dcfe))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.27 ([5132bd0](https://github.com/DanySK/gradle-kotlin-qa/commit/5132bd03ce90d157ceb14ce63b8289e024e965d3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.28 ([948ce59](https://github.com/DanySK/gradle-kotlin-qa/commit/948ce593806c7c48061125b9451c929d19b6081f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.29 ([0260504](https://github.com/DanySK/gradle-kotlin-qa/commit/0260504835216b19934a138282075584597819f7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.30 ([0f31559](https://github.com/DanySK/gradle-kotlin-qa/commit/0f31559bd755d7e69b14391aa9c3971ed64029c3))
* **deps:** update plugin com.gradle.enterprise to v3.13.3 ([1854f9d](https://github.com/DanySK/gradle-kotlin-qa/commit/1854f9dbff9b2fe5b904f3d708d4c7f2ec3782db))

## [0.42.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.41.0...0.42.0) (2023-05-24)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.5 ([fe4a327](https://github.com/DanySK/gradle-kotlin-qa/commit/fe4a327ebded45531fa66c0f716b521e932881ae))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.6 ([119ab7c](https://github.com/DanySK/gradle-kotlin-qa/commit/119ab7c0b9a8833bc5d6b9407f8b46e868bbbbec))


### Dependency updates

* **api-deps:** update detekt to v1.23.0 ([9135ba7](https://github.com/DanySK/gradle-kotlin-qa/commit/9135ba7097368f8bbefe315bcdb01de25b49aaba))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.158 ([28de641](https://github.com/DanySK/gradle-kotlin-qa/commit/28de6412017cb32218e5920ed515c3c2610ef528))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.159 ([d1f1e24](https://github.com/DanySK/gradle-kotlin-qa/commit/d1f1e24056174326c0bb65b8c096525e30cf7ea4))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.160 ([210ed8e](https://github.com/DanySK/gradle-kotlin-qa/commit/210ed8e7cc0ae86c220b18773e089c30c2679517))
* **deps:** update kotest to v5.6.2 ([d253a64](https://github.com/DanySK/gradle-kotlin-qa/commit/d253a649106365b79721f9e4ab697ec3e737fa3f))
* **deps:** update plugin com.gradle.enterprise to v3.13.2 ([c08e774](https://github.com/DanySK/gradle-kotlin-qa/commit/c08e774c9542dc9d6a25185758e0bda76e2e2133))

## [0.41.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.40.0...0.41.0) (2023-05-05)


### Dependency updates

* **api-deps:** update detekt to v1.23.0-rc3 ([128855a](https://github.com/DanySK/gradle-kotlin-qa/commit/128855a98799aff58dc759900c78b62a5274a144))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.26 ([1b17938](https://github.com/DanySK/gradle-kotlin-qa/commit/1b17938275b71a6f9c84503f74aa934d26822c59))
* **deps:** update jacoco to v0.8.10 ([caf4a85](https://github.com/DanySK/gradle-kotlin-qa/commit/caf4a85683c851c841f0937cbae092f8983e4702))
* **deps:** update plugin com.gradle.enterprise to v3.13.1 ([501f369](https://github.com/DanySK/gradle-kotlin-qa/commit/501f36982127719ecba0384c55f45582373a45a9))
* **deps:** update plugin jacoco-testkit to v1.0.12 ([1701e9b](https://github.com/DanySK/gradle-kotlin-qa/commit/1701e9b614b7b9b0055b8b0cdef8c6aecd3110e3))
* **deps:** update plugin kotlin-qa to v0.40.0 ([6e696b1](https://github.com/DanySK/gradle-kotlin-qa/commit/6e696b1672f6d7533e287ca66e64d7bbb6e66605))

## [0.40.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.39.0...0.40.0) (2023-04-25)


### Dependency updates

* **api-deps:** update dependency org.jlleitschuh.gradle:ktlint-gradle to v11.3.2 ([2171d1c](https://github.com/DanySK/gradle-kotlin-qa/commit/2171d1cbce89dd8577c9d38acc7b0a4a98b48651))
* **deps:** update plugin kotlin-qa to v0.39.0 ([2e2c601](https://github.com/DanySK/gradle-kotlin-qa/commit/2e2c6017fb19dc26fd5ccb4f477d979c1fef9451))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.7 ([bc36fc2](https://github.com/DanySK/gradle-kotlin-qa/commit/bc36fc25c8a8e82527e33ecc243197bf31f039ff))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.5.0 ([27c8f1b](https://github.com/DanySK/gradle-kotlin-qa/commit/27c8f1b4d3dd0636daa3dfeef7700db2d84921ae))

## [0.39.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.38.2...0.39.0) (2023-04-23)


### Dependency updates

* **api-deps:** update detekt to v1.23.0-rc2 ([9c637dd](https://github.com/DanySK/gradle-kotlin-qa/commit/9c637dd3c32a4cc6a8e366311c81cc162910fc4b))
* **deps:** update plugin kotlin-qa to v0.38.2 ([0f2076d](https://github.com/DanySK/gradle-kotlin-qa/commit/0f2076d42da3346a769c8bb512604a0646a4599c))
* **deps:** update plugin publishoncentral to v5.0.4 ([b188987](https://github.com/DanySK/gradle-kotlin-qa/commit/b188987efc4471bd7d4a95740eab6432c2b7cb34))

## [0.38.2](https://github.com/DanySK/gradle-kotlin-qa/compare/0.38.1...0.38.2) (2023-04-22)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.1 ([816c0bf](https://github.com/DanySK/gradle-kotlin-qa/commit/816c0bf0a3d46f4d2f90a42c10c7c312017c6b29))
* **deps:** update actions/checkout action to v3.5.2 ([c0b5947](https://github.com/DanySK/gradle-kotlin-qa/commit/c0b59477f4707c5ac3a08fa591a28b55c604f0a5))
* **deps:** update danysk/action-checkout action to v0.2.8 ([474a17e](https://github.com/DanySK/gradle-kotlin-qa/commit/474a17ed3e5aafc02f6edf0ce4254bdc6e4b7f0d))
* **deps:** update danysk/action-checkout action to v0.2.9 ([f4a325d](https://github.com/DanySK/gradle-kotlin-qa/commit/f4a325d665739a032d6cc8327bb0b0a8d6afe522))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.4 ([ccef179](https://github.com/DanySK/gradle-kotlin-qa/commit/ccef17903c34b2480f457fa8116598b7df5b5605))


### Dependency updates

* **core-deps:** update dependency gradle to v8.1.1 ([#426](https://github.com/DanySK/gradle-kotlin-qa/issues/426)) ([5432372](https://github.com/DanySK/gradle-kotlin-qa/commit/54323722b6bfe97e34378d4f15271c9d8125d8d0))
* **deps:** update dependency org.mockito:mockito-core to v5.3.1 ([ac8abd3](https://github.com/DanySK/gradle-kotlin-qa/commit/ac8abd3c10d6aa3f1b8458f642267631b2f5c581))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.24 ([cc23be3](https://github.com/DanySK/gradle-kotlin-qa/commit/cc23be3508f932bd7229855e444c5f8461c84c38))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.25 ([3206bed](https://github.com/DanySK/gradle-kotlin-qa/commit/3206bed82b2bf98181b37b83f40afe2505ae533a))
* **deps:** update kotest to v5.6.0 ([f792d12](https://github.com/DanySK/gradle-kotlin-qa/commit/f792d12ff44cabf5c5d3a6c521a9b0df09500539))
* **deps:** update kotest to v5.6.1 ([d08b910](https://github.com/DanySK/gradle-kotlin-qa/commit/d08b9108081d8867251114c13616b2e3784cd594))
* **deps:** update node.js to 18.16 ([b3d9995](https://github.com/DanySK/gradle-kotlin-qa/commit/b3d9995858a56590879d6a3b4f92b4a664648073))
* **deps:** update plugin com.gradle.enterprise to v3.13 ([8fe0fc6](https://github.com/DanySK/gradle-kotlin-qa/commit/8fe0fc6de0180beb7f9dc5a1c2cda1447f9e4a0b))
* **deps:** update plugin gitsemver to v1.1.7 ([b64a757](https://github.com/DanySK/gradle-kotlin-qa/commit/b64a757a55cb86a756e1a2019b61c4baef7b5b51))
* **deps:** update plugin gitsemver to v1.1.8 ([ec6e642](https://github.com/DanySK/gradle-kotlin-qa/commit/ec6e642b56b49871d63257fdf16f49a88814d14a))
* **deps:** update plugin gitsemver to v1.1.9 ([f307824](https://github.com/DanySK/gradle-kotlin-qa/commit/f307824949d577747727b73952a25a91a5541dda))
* **deps:** update plugin kotlin-qa to v0.38.0 ([#425](https://github.com/DanySK/gradle-kotlin-qa/issues/425)) ([c9cb200](https://github.com/DanySK/gradle-kotlin-qa/commit/c9cb200b214ee8469ef8f5eaf4e796045fc967bb))
* **deps:** update plugin kotlin-qa to v0.38.1 ([8783ac4](https://github.com/DanySK/gradle-kotlin-qa/commit/8783ac4827724ca17028f880bf27329120039ccb))
* **deps:** update plugin multijvmtesting to v0.4.21 ([c022fdf](https://github.com/DanySK/gradle-kotlin-qa/commit/c022fdfc31176b17dc70df433c53ef8109c8e8ab))
* **deps:** update plugin multijvmtesting to v0.4.22 ([96cae83](https://github.com/DanySK/gradle-kotlin-qa/commit/96cae832486845d8df3cf76debf9d27c9787fe14))
* **deps:** update plugin multijvmtesting to v0.4.23 ([514baec](https://github.com/DanySK/gradle-kotlin-qa/commit/514baecebd900a9a361a6bb1ca55cfb2d749626a))
* **deps:** update plugin publishoncentral to v4.1.0 ([3f1101c](https://github.com/DanySK/gradle-kotlin-qa/commit/3f1101c5b3937d8c408fb1164a33ab0bb5bdea40))
* **deps:** update plugin publishoncentral to v4.1.1 ([15a25d0](https://github.com/DanySK/gradle-kotlin-qa/commit/15a25d0d384678b97f3d3180da9e1068b5aac5af))
* **deps:** update plugin publishoncentral to v5 ([d3df400](https://github.com/DanySK/gradle-kotlin-qa/commit/d3df4007209d1bb9942dbded3ef1f0d3bd049269))
* **deps:** update plugin publishoncentral to v5.0.2 ([7f82b0b](https://github.com/DanySK/gradle-kotlin-qa/commit/7f82b0b71f0165bc1059dd870fa1b3a94e2e26c3))
* **deps:** update plugin publishoncentral to v5.0.3 ([1f23604](https://github.com/DanySK/gradle-kotlin-qa/commit/1f2360428c0db85c73fdb843354465f16d1db838))

## [0.38.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.38.0...0.38.1) (2023-04-12)


### Dependency updates

* **core-deps:** update dependency gradle to v8 ([b89cb11](https://github.com/DanySK/gradle-kotlin-qa/commit/b89cb112041ee39d35c862ddc05ebd9fef11ba52))
* **deps:** update dependency org.mockito:mockito-core to v5.3.0 ([18a9794](https://github.com/DanySK/gradle-kotlin-qa/commit/18a9794a1cb41e7acba0c6dd0d05eac7990d568c))


### Build and continuous integration

* run tests after generateJacocoTestKitProperties ([4be9f2b](https://github.com/DanySK/gradle-kotlin-qa/commit/4be9f2bd3a95c6e2f80056d6f5c4f40f353bdfb5))

## [0.38.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.37.0...0.38.0) (2023-04-12)


### Build and continuous integration

* **deps:** update danysk/action-checkout action to v0.2.7 ([d77881a](https://github.com/DanySK/gradle-kotlin-qa/commit/d77881a27fb245f53ca8f1e71b8a4273f02ef0f4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.3 ([a4f2d98](https://github.com/DanySK/gradle-kotlin-qa/commit/a4f2d98221f1b3db991154b640b74bfc37104031))


### Dependency updates

* **api-deps:** update dependency com.pinterest:ktlint to v0.48.2 ([514ce7c](https://github.com/DanySK/gradle-kotlin-qa/commit/514ce7cc7d853cd793d8fe38d9a1b413106c336e))
* **deps:** update jacoco to v0.8.9 ([a994643](https://github.com/DanySK/gradle-kotlin-qa/commit/a9946438b2e89d00605dd610f88b661d3b8b4613))
* **deps:** update node.js to 18.15 ([0614e3f](https://github.com/DanySK/gradle-kotlin-qa/commit/0614e3fce56d859b58dacb4ec27f01f5fb572acf))
* **deps:** update plugin gitsemver to v1.1.6 ([3efd9d4](https://github.com/DanySK/gradle-kotlin-qa/commit/3efd9d40323d1800efaa3814b78aa1699c28ee1f))
* **deps:** update plugin multijvmtesting to v0.4.20 ([94f312b](https://github.com/DanySK/gradle-kotlin-qa/commit/94f312b0514bf5b6050979cdd39bc8ce73ce2fc2))

## [0.37.0](https://github.com/DanySK/gradle-kotlin-qa/compare/0.36.1...0.37.0) (2023-04-11)


### Features

* use the latest beta of this plugin on itself ([3b3e211](https://github.com/DanySK/gradle-kotlin-qa/commit/3b3e211ca61cbbf83a9db139aa04f377179a85c1))


### Bug Fixes

* remove call to deprecated method ([53cf02f](https://github.com/DanySK/gradle-kotlin-qa/commit/53cf02fca9c30fed445cd1e3e8c0d3e0d06e0c78))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.0 ([3f561b0](https://github.com/DanySK/gradle-kotlin-qa/commit/3f561b0091668dd0b2c7036851b11d4f8ddf8aad))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.2 ([9fae157](https://github.com/DanySK/gradle-kotlin-qa/commit/9fae157e782089a4322527cf66a82d7d837cc972))
* **mergify:** disable auto-rebasing due to Mergifyio/mergify[#5074](https://github.com/DanySK/gradle-kotlin-qa/issues/5074) ([3e1059d](https://github.com/DanySK/gradle-kotlin-qa/commit/3e1059da4f893beba2b745dc0396493d18553ac1))


### Dependency updates

* **api-deps:** update detekt to 1.23.0-RC1 ([160a800](https://github.com/DanySK/gradle-kotlin-qa/commit/160a8009532c9421b8c9fae5c9465e031b49f9af))
* **deps:** update dependency io.github.classgraph:classgraph to v4.8.157 ([0fbabe6](https://github.com/DanySK/gradle-kotlin-qa/commit/0fbabe6fcfbe829134ce185cdcc962f68a91b227))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.17 ([fcf7467](https://github.com/DanySK/gradle-kotlin-qa/commit/fcf746753e88f3f7bd28fd299a00bd04a85990ab))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.19 ([f0e9d79](https://github.com/DanySK/gradle-kotlin-qa/commit/f0e9d79ff335aee3ca1e6cfe76b43c3ca6c9193f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.20 ([0ea9842](https://github.com/DanySK/gradle-kotlin-qa/commit/0ea9842b507bbf8437637ccaf88642803271121f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.21 ([00c47b3](https://github.com/DanySK/gradle-kotlin-qa/commit/00c47b32aef38f2e17c03e23b918a77774b9e28b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.22 ([5b7cbff](https://github.com/DanySK/gradle-kotlin-qa/commit/5b7cbff10b95f45cc788ae1d1e6d26e71f14f9cd))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.23 ([346e4c8](https://github.com/DanySK/gradle-kotlin-qa/commit/346e4c8a356b3362801420efea03035e54bee449))
* **deps:** update plugin com.gradle.enterprise to v3.12.6 ([01149c0](https://github.com/DanySK/gradle-kotlin-qa/commit/01149c08f83ef9e1e6362e1fd1ffa65781ab4ff3))
* **deps:** update plugin gitsemver to v1.1.4 ([12e434f](https://github.com/DanySK/gradle-kotlin-qa/commit/12e434f30f87569ac8f46280f737bfa5d04bc692))
* **deps:** update plugin gradlepluginpublish to v1.2.0 ([134c90d](https://github.com/DanySK/gradle-kotlin-qa/commit/134c90d74b20f50bc71a0fc7cf4a912b9bd6a49d))
* **deps:** update plugin kotlin-qa to v0.36.0 ([7e5118a](https://github.com/DanySK/gradle-kotlin-qa/commit/7e5118ab1d90ec71484052c4d27419db7a95846c))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.5 ([7a707f3](https://github.com/DanySK/gradle-kotlin-qa/commit/7a707f399179c3d79f68a4df880ce19bed908d8f))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.6 ([cda2a14](https://github.com/DanySK/gradle-kotlin-qa/commit/cda2a1414941a22675febf8636b92a62fe6d7b74))
* **deps:** update plugin publishoncentral to v3.4.0 ([32809cb](https://github.com/DanySK/gradle-kotlin-qa/commit/32809cb1b3b44dbf5c280525dcc17ccfc02422aa))
* **deps:** update plugin publishoncentral to v4 ([0a949c9](https://github.com/DanySK/gradle-kotlin-qa/commit/0a949c90e0cdf02a1ba97a4d3577c06b5b21f81c))


### Style improvements

* anonymize unused `it` variable ([134768e](https://github.com/DanySK/gradle-kotlin-qa/commit/134768e0fd941a80b57b6da82c764f12ae1f293e))
* avoid shadowing `it` ([52b5381](https://github.com/DanySK/gradle-kotlin-qa/commit/52b5381b5e78157a6c54f18cfc583a37de845903))
* avoid template strings in logging call ([40b5efd](https://github.com/DanySK/gradle-kotlin-qa/commit/40b5efd31db0fc869563ce7987a1a622d0b2f95b))
* explicitly declare a platform type ([89ce9d8](https://github.com/DanySK/gradle-kotlin-qa/commit/89ce9d8f66f6c6e4acd7de63911be9c87f785a76))

## [0.36.1](https://github.com/DanySK/gradle-kotlin-qa/compare/0.36.0...0.36.1) (2023-03-04)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.8.10 ([03f409a](https://github.com/DanySK/gradle-kotlin-qa/commit/03f409ad34b749d2cf1e9272f5c6626c226869fe))

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
