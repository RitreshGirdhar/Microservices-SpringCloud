FROM openjdk:8-jdk-alpine
VOLUME /tmp
#ARG JAR_FILE
ADD target/ms1.jar ms1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","ms1.jar"]
