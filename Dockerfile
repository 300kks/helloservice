FROM adoptopenjdk/openjdk11
LABEL "Description" = "Hello Service"
COPY target/*.jar hello-service.jar
ENTRYPOINT ["java", "-jar", "/hello-service.jar"]
