# Demo Project

## Overview
This project showcases soft delete functionality using Spring Boot and JPA.

## Getting Started

### Prerequisites
- Java 21
- Gradle 8.13
- Docker compose

### Building Postgres Docker Image
To build the Postgres Docker image, run:
```bash
docker compose up --build
```

### Building the Project
To build the project, run:

```bash
./gradlew clean build
```

### Running the Application
To run the application locally:

```bash
./gradlew bootRun
```

### To acces the Swagger UI
```bash
http://localhost:8081/swagger-ui/index.html
```

## Configuration
Configuration details can be found in the `application.properties` or `application.yml` file in the resources directory.


