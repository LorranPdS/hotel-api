FROM maven:3.6.3-openjdk-17
WORKDIR /hotel-api
COPY . .
RUN mvn clean install -DskipTests
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]
