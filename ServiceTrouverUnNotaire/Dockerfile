FROM eclipse-temurin:8-jdk

ADD target/servicenotaire-trouver-1.0-SNAPSHOT-jar-with-dependencies.jar servicenotaire-trouver-1.0-SNAPSHOT-jar-with-dependencies.jar

WORKDIR /

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "servicenotaire-trouver-1.0-SNAPSHOT-jar-with-dependencies.jar"]