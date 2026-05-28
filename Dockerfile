FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/employee-management-app-1.0-SNAPSHOT.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "app.jar", "--server.port=8081"]
