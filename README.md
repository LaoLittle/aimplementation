# aimplementation

一个前置插件

```kotlin
dependencies {
    val exposedVersion = "0.37.1"
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
    implementation("com.alibaba:druid:1.2.8")
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
}
```