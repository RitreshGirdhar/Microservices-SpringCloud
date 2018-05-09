FROM openjdk:8-jdk-alpine
VOLUME /tmp
#ARG JAR_FILE
ADD target/zipkin.jar zipkin.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","zipkin.jar"]
