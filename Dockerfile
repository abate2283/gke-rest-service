FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/gke-rest-service.jar app.jar
ENTRYPOINT  ["java", "-jar", "/app.jar"]
