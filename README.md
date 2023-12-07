# MicroService_docker_Reda_makaoui

## Project Overview

This project consists of four microservices developed using Spring Boot:

1. **Gateway Service**: Acts as the entry point for all incoming requests, routing them to the appropriate microservices.
   
2. **Client Service**: Manages information related to clients. Utilizes a separate database (`dbMS1`) for data storage.

3. **Voiture Service**: Manages information related to vehicles. Utilizes another separate database (`dbMS2`) for data storage.

4. **Eureka Service**: Service registry and discovery for the microservices, enabling them to locate and communicate with each other.

![image](https://github.com/rmakaoui/MicroService_docker_Reda_makaoui/assets/101502312/50d57e49-d0ed-43c8-81fd-299413e5d8aa)


## Technologies Used

- **Spring Boot**: Framework for building microservices.
  
- **Eureka Server**: Service registry for microservices.

![image](https://github.com/rmakaoui/MicroService_docker_Reda_makaoui/assets/101502312/c8978075-a3be-4299-acf7-da4d0a1147e2)

  
- **Spring Cloud Gateway**: Provides a simple, yet effective way to route to APIs and provide cross-cutting concerns.

## Project Structure

The project is organized into the following modules:

- **gateway-service**: Gateway service module.


![image](https://github.com/rmakaoui/MicroService_docker_Reda_makaoui/assets/101502312/12092eb4-420a-4d1a-b7ec-dafd55d8c03d)
  
- **client-service**: Microservice for client information.

![image](https://github.com/rmakaoui/MicroService_docker_Reda_makaoui/assets/101502312/b61c0e4d-5b7d-4f95-989b-046f17a05e02)

  
- **voiture-service**: Microservice for vehicle information.

![image](https://github.com/rmakaoui/MicroService_docker_Reda_makaoui/assets/101502312/c93f811f-2109-4772-aed3-e411c9ff9b00)

  
- **eureka-service**: Service registry and discovery module.

![image](https://github.com/rmakaoui/MicroService_docker_Reda_makaoui/assets/101502312/c8978075-a3be-4299-acf7-da4d0a1147e2)

## Database Configuration

- **dbMS1**: Database for the `client-service`.
  
- **dbMS2**: Database for the `voiture-service`.

## Running the Project

1. Ensure you have Docker and Docker Compose installed on your machine.

2. Clone the repository:

    ```bash
    git clone https://github.com/your-username/microservices-project.git
    cd microservices-project
    ```

3. Run Docker Compose:

    ```bash
    docker-compose up
    ```

    This command will start the microservices, databases, and Eureka server.

4. Access Eureka Dashboard:

    Open your browser and navigate to [http://localhost:8761](http://localhost:8761) to view the Eureka server dashboard.

5. Access Gateway Service:

    The Gateway Service is available at [http://localhost:8888](http://localhost:8888).

## Service Endpoints

- **Gateway Service**:
    - http://localhost:8088/client/**
    - http://localhost:8089/voiture/**
  
- **Client Service**:
    - http://localhost:8088/clients/**

- **Voiture Service**:
    - http://localhost:8089/voitures/**

## Notes

- Ensure that the necessary configurations (e.g., database connection properties) are correctly set in each microservice's `application.properties` or `application.yml` file.

- For production use, consider securing communication between microservices, configuring externalized configuration (e.g., Spring Cloud Config), and handling service resilience and fault tolerance.

- Additional documentation for each microservice and the technologies used can be found in their respective modules.

Feel free to explore and expand upon this project according to your specific requirements!
