# Use an official Maven image to build the app
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package

# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim
WORKDIR /app

# Copy the packaged application
COPY --from=build /app/target/your-app-name.jar ./your-app-name.jar

# Run the Java application
ENTRYPOINT ["java", "-jar", "HelloWorldTest.java"]

