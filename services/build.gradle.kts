plugins {
    id("org.springframework.boot") version "3.1.0"
}

// Disable bootJar for the services module since it's just a container
tasks.bootJar {
    enabled = false
}

// Also disable jar for this module
tasks.jar {
    enabled = false
} 