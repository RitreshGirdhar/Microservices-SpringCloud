FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/ms3.jar ms3.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","ms3.jar"]
