FROM openjdk:11
ADD target/customermanagement.jar customermanagement.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customermanagement.jar"]
