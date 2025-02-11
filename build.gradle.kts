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

// Disable bootJar for the root project since it's just a container for submodules
tasks.bootJar {
    enabled = false
}

// Also disable jar for the root project
tasks.jar {
    enabled = false
}