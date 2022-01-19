plugins {
    val kotlinVersion = "1.5.30"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.9.0-M1"
}

group = "org.laolittle.plugin"
version = "1.0"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

dependencies {
    val exposedVersion = "0.37.2"
    val kumoVersion = "1.28"
    implementation("org.quartz-scheduler:quartz:2.3.2")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
    implementation("com.alibaba:druid:1.2.8")
    implementation("com.kennycason:kumo-core:$kumoVersion")
    implementation("com.kennycason:kumo-tokenizers:$kumoVersion")
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-java-time:$exposedVersion")
    implementation(fileTree(mapOf("dir" to "lib", "include" to listOf("*.jar"))))
}