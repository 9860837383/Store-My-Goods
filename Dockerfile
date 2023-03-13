
FROM openjdk:17

COPY target/store.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar","store.jar"]