FROM openjdk:11
ADD src /code/src  
RUN ["mvn", "package"]
ADD target/customermanagement.jar customermanagement.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customermanagement.jar"]
