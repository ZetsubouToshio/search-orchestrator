FROM openjdk:8-slim
VOLUME /tmp
COPY /target/search-orchestrator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
