FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/ms2.jar ms2.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","ms2.jar"]
