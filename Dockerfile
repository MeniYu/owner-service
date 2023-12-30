FROM openjdk:17-jdk-slim
WORKDIR /app/owner-service
COPY build/libs/owner-service-0.0.1.jar owner-service-0.0.1.jar
EXPOSE 8082
ENTRYPOINT ["java"]
CMD ["-jar", "owner-service-0.0.1.jar"]

# docker image build -t owner-image .