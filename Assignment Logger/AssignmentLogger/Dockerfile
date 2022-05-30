FROM openjdk:11
ADD target/product-docker.jar product-docker.jar
ENTRYPOINT ["java", "-jar","/product-docker.jar"]
EXPOSE 8989