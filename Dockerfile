FROM openjdk:17
COPY /target/demo11.jar /demo.jar
CMD ["java","-jar","demo.jar"]