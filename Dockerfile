FROM openjdk:8-jdk-alpine
EXPOSE 8084:8084

RUN mkdir /app
WORKDIR /app
ADD /target/docker-test-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]

