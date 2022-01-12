FROM openjdk:11
RUN apt-get update  
RUN apt-get install -y maven
#ADD pom.xml /code/pom.xml 
#RUN ["mvn", "dependency:resolve"]   
CMD  ["mvn", "package"]
ADD target/customermanagement.jar customermanagement.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customermanagement.jar"]
