FROM openjdk:8-jdk-alpine
VOLUME /tmp
#ARG JAR_FILE
ADD target/config.jar config.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","config.jar"]
