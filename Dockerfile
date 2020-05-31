FROM openjdk:11-jre-slim
VOLUME /tmp
ARG JAR_FILE
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]