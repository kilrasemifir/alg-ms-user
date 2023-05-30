# User and Teams Management Microservice

## Requirements
- [Docker](https://docs.docker.com/install/)
- [Docker-compose](https://docs.docker.com/compose/install/)
- [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)
- IDE Java [IntelliJ IDEA](https://www.jetbrains.com/fr-fr/idea/download/#section=windows) ou [Eclipse](https://www.eclipse.org/downloads/)

## Installation

### Development mode

1. Clone the repository
2. run docker-compose for the database
    ```shell
    docker-compose up -d
    ```
3. Execute main class "MsUserApplication.java" in your IDE

## Architecture

This microservice is based on the [Hexagonal Architecture](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software)).

Four use cases are implemented:
- Modify a user
- Read a user
- Modify a team
- Read a team

## Documentation

Documentation is available at [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)