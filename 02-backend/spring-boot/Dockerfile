# Use a base image with Java and Maven installed
FROM maven:3.8.6-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and the source code
COPY mvn/wrapper/pom.xml ./
COPY mvn/wrapper/src ./src

# Package the application
RUN mvn clean package

# Create a new image to run the application
FROM openjdk:17-jdk
COPY --from=build /app/target/*.jar /app/app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
