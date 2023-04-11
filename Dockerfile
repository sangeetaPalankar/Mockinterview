FROM openjdk:17
EXPOSE 9011
ADD /target/demo1-1-0.0.1-SNAPSHOT.jar /demo.jar
ENTRYPOINT ["java","-jar","demo.jar"]

