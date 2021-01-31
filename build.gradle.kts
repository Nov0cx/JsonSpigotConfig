import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "2.0.4"
}

group = "com.nov0cx"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.9.9")
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.9")
    compileOnly("com.github.SpigotMC:Spigot-Api:1.7.3-R3")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.15"
}