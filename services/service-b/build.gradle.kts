plugins {
    id("org.springframework.boot") version "3.1.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

springBoot {
    mainClass.set("com.example.serviceb.ServiceBApplication")
}