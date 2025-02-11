    plugins {
        id("org.springframework.boot") version "3.1.0"
        id("io.spring.dependency-management") version "1.1.0"
        java
    }

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-web")
    }

    tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
        mainClass.set("com.example.servicec.ServiceCApplication")
    }
