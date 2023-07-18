# Stage 1: Xây dựng ứng dụng Spring Boot với Maven
FROM maven:3.8.1-jdk-8 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package

# Stage 2: Tạo image nhỏ gọn chỉ chứa file .jar đã được đóng gói
FROM adoptopenjdk/openjdk8
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /docker-spring-boot.jar
EXPOSE 8099
CMD ["java", "-jar", "/docker-spring-boot.jar"]