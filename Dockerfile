FROM openjdk:8-jdk-alpine
EXPOSE 8773:8084
RUN mkdir "bin/app"
WORKDIR bin/app
ADD target/docker-test-0.0.1-SNAPSHOT.jar bin/app/app.jar
ENTRYPOINT ["java","-jar","bin/app/app.jar"]