FROM openjdk:14-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080 5005

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]