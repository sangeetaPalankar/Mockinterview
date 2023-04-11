FROM openjdk:17
COPY /target/demo1-1-0.0.1-SNAPSHOT.jar /demo.jar
CMD ["java","-jar","demo.jar"]