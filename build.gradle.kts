// build.gradle.kts
plugins {
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
    java
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "java")

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter")
    }

    group = "com.example"
    version = "1.0.0"
}