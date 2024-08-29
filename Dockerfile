FROM openjdk:21
WORKDIR /app
COPY build/libs/dbmapping-0.0.1-SNAPSHOT.jar /app/application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]