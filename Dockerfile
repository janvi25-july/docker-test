FROM openjdk:21

COPY target/docker-server.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker-server.jar"]