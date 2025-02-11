plugins {
    id("org.springframework.boot") version "3.1.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

springBoot {
    mainClass.set("com.example.servicec.ServiceCApplication")
}

// Disable bootJar for the services module since it's just a container
tasks.bootJar {
    enabled = false
}

// Also disable jar for this module
tasks.jar {
    enabled = false
}