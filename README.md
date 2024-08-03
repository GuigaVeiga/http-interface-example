### README for the "Spring HTTP Interface Example" Project

# Spring HTTP Interface Example

This project demonstrates the use of the new HTTP Interface in Spring 6, which simplifies communication with REST APIs through a more declarative and less verbose approach.

## About the Project

The project utilizes various techniques and tools from the Spring ecosystem to create efficient and easy-to-maintain HTTP clients:

- **Spring Boot**: Simplifies the configuration and running of Spring-based applications.
- **Spring WebFlux**: Provides support for reactive programming in Spring.
- **Spring Cloud OpenFeign**: Allows for declarative HTTP client declaration.
- **RestTemplate**: Used for synchronous HTTP calls in Spring.
- **`Post` Model**: Represents the data manipulated by the HTTP clients.

## Project Structure

The project structure includes packages for configurations, clients, and models, organized clearly and modularly to facilitate understanding and maintenance.

## Technologies Used

- **Spring Boot 3.3.2**
- **Java 21**
- **Gradle** - for dependency management and project building.

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Run the command `./gradlew bootRun` to start the application.

## References

- [Official Spring Documentation](https://docs.spring.io/spring-framework/reference/integration/rest-clients.html#rest-http-interface) - For details on HTTP interfaces in Spring 6.
- [Baeldung on Spring 6 HTTP Interface](https://www.baeldung.com/spring-6-http-interface) - An explanatory article on how to use the HTTP Interface in Spring 6.
