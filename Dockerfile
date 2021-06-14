FROM openjdk:18
EXPOSE 8080
COPY ./build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]