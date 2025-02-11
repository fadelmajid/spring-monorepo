# Spring Boot Monorepo

A monorepo containing multiple Spring Boot microservices.

## Project Structure 
├── services
│ ├── service-a
│ ├── service-b
│ └── service-c
├── build.gradle.kts
├── settings.gradle.kts
└── README.md

## Prerequisites
- Java 17+
- Gradle 8.12+

## Getting Started

### Build all services
```bash
./gradlew build
```

### Build specific service
```bash
./gradlew :services:service-a:build
```

### Run tests
```bash
./gradlew test
```