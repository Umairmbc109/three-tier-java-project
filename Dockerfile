FROM openjdk:11-jre-slim

WORKDIR /app

COPY src/main/java/presentation/Main.java .

CMD ["java", "presentation/Main"]

