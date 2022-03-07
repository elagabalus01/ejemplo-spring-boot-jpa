from openjdk:8u151-jre-slim
expose 8080
copy ./target/spring_jpa-0.0.1-SNAPSHOT.jar /app/spring_jpa.jar
entrypoint java -jar /app/spring_jpa.jar
