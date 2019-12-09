#FROM openjdk:8-jdk-alpine
FROM hub.c.163.com/dwyane/openjdk:8
MAINTAINER red-eric 13275646@qq.com
ADD user.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]