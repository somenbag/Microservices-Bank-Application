# Use an existing image as a base images
FROM openjdk:17-jdk-slim

# Set author label
LABEL authors="somen"

# Copy the current directory contents into the container at /app
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Set the default command to run when the container starts
ENTRYPOINT ["java", "-jar","accounts-0.0.1-SNAPSHOT.jar"]