FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/Gateway-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Gateway-0.0.1-SNAPSHOT.jar

EXPOSE 8889

ENTRYPOINT ["java", "-jar", "/Gateway-0.0.1-SNAPSHOT.jar"]
