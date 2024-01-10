#FROM maven:3.8.4-openjdk-17-slim AS build
#WORKDIR /app
#COPY . /app
#RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean install

FROM openjdk:17-jdk-slim
WORKDIR /app/owner-service
COPY build/libs/owner-service-0.0.1.jar owner-service-0.0.1.jar
EXPOSE 8082
ENTRYPOINT ["java"]
CMD ["-jar", "owner-service-0.0.1.jar"]

# docker image build -t owner-image .
# docker rmi `docker images --filter dangling=true -q`