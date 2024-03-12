FROM openjdk:17-jdk-slim AS builder
LABEL maintainer="lts"
ARG JAR_FILE=target/funfun-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} funfun-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/funfun-springboot.jar"]