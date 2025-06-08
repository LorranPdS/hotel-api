FROM maven:3.6.3-openjdk-17
WORKDIR /hotel-api
COPY . .
RUN mvn clean install -DskipTests
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]

# Run the command 'docker build -t hotel-api .' in the same directory that's Dockerfile to generate image this project
# Run the command 'docker run --name hotel-api -p 8080:8080 hotel-api' to create container this project
