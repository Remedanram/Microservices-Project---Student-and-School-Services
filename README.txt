Microservices Project - Student and School Services
This project is a simple implementation of a microservices architecture that includes multiple services for managing students and schools. The project leverages several key microservice patterns and tools to build a robust and scalable system.

Key Features:
Student Service: Manages student-related data and operations.
School Service: Handles school-related data and operations.
Config Server: Centralized configuration management for all services.
Service Discovery with Eureka: Facilitates service registration and discovery for seamless communication between services.
API Gateway: Acts as a single entry point for all client requests, routing them to the appropriate services.
Distributed Tracing with Zipkin: Provides end-to-end tracing of requests across services to monitor performance and troubleshoot issues.
Communication through OpenFeign: Enables declarative REST client communication between services using OpenFeign.
Technologies Used:
Spring Boot: For developing microservices.
Eureka: For service discovery and registration.
Spring Cloud Config: For externalized configuration management.
Spring Cloud Gateway: For routing and filtering HTTP requests across microservices.
Zipkin: For distributed tracing and monitoring.
OpenFeign: For simplifying HTTP communication between microservices.
Architecture
The project follows a microservices architecture with the following key components:

Student Service: A RESTful service that handles student CRUD operations.
School Service: A RESTful service that manages school-related data and operations.
Config Server: Manages configuration properties centrally and serves configurations to all microservices.
Eureka Server: A service registry that allows other microservices to register themselves and discover each other.
API Gateway: A gateway that routes incoming requests to the appropriate microservice.
Zipkin: A distributed tracing system that helps track requests as they travel across different microservices.
OpenFeign: An HTTP client for communication between the Student and School services.
Setup
Clone the repository:

bash
Copy code
git clone <repository_url>
Set up the Config Server:

Ensure all microservices are configured to read their properties from the config server.
Start Eureka Server:

Run the Eureka service first. This will act as the service registry.
Start the Student and School Services:

Each service will register with Eureka, making it discoverable by other services.
Start the API Gateway:

The API Gateway will handle routing the requests to the correct services.
Zipkin Tracing:

Once all services are running, Zipkin will track the requests across services for better observability.
Run the application:

Build the project using Maven or Gradle:
bash
Copy code
mvn clean install
Run the application:
bash
Copy code
mvn spring-boot:run
Access the Gateway:

After the application starts, access the API Gateway at http://localhost:8222 to interact with the services.