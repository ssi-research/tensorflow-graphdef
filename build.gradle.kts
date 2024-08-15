import com.google.protobuf.gradle.*
import java.net.URI
import java.io.*

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.9.23"
    id("com.google.protobuf") version "0.8.18"
    kotlin("plugin.serialization") version "1.9.23"
    `maven-publish`
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("org.beryx.runtime") version "1.12.6"
}
val protobufVersion = "3.25.3"
val artifactory_publish_url: String by properties
val artifactory_username: String by properties
val artifactory_password: String by properties
val projectVersion = "${protobufVersion}-2.13"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.0")
    implementation("org.reflections:reflections:0.10.2")
    implementation("com.google.guava:guava:32.1.3-jre")
    implementation("com.lordcodes.turtle:turtle:0.8.0")
    implementation("com.google.protobuf:protobuf-java:${protobufVersion}")
    implementation("com.google.protobuf:protobuf-kotlin:${protobufVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:1.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
}

group = "conv"

var artifactory_publishing_url = artifactory_publish_url

repositories {
    mavenCentral()
}

tasks.jar {
    archiveBaseName.set("tensorflow-graphdef-${protobufVersion}")
    archiveVersion.set("2.13")
    from("src-gen/main/kotlin") {
        into("kotlin")
    }
    from("src-gen/main/java") {
        into("java")
    }
    from("src/proto") {
        into("proto")
    }
    from("src-gen/main/resources") {
        into("resources")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven_publish") {
            from(components["java"])
            artifactId = "tensorflow-graphdef"
            version = projectVersion
        }
    }

    repositories {
        maven {
            url = uri(artifactory_publishing_url)
            credentials {
                username = artifactory_username
                password = artifactory_password
            }
        }
    }
}
