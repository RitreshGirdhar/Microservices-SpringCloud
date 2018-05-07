FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/serviceregistry.jar serviceregistry.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","serviceregistry.jar"]
