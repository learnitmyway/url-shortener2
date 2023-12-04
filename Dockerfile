FROM openjdk:17
COPY build/libs/url-shortener2-*.jar /app/main.jar
WORKDIR /app
CMD ["java", "-jar", "/app/main.jar"]
