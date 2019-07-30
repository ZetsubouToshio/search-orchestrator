FROM openjdk:11-slim
VOLUME /tmp
COPY /target/search-orchestrator-0.0.1-SNAPSHOT.jar app.jar
ENV SPRING_DATASOURCE_URL=""
ENV SPRING_DATASOURCE_USERNAME=""
ENV SPRING_DATASOURCE_PASSWORD=""
# RUN echo "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" > /run.sh
# ENTRYPOINT ["/bin/bash", "/run.sh"]

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /app.jar