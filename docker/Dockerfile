FROM jboss/base-jdk:8

ADD microservice.jar /opt/jboss/microservice.jar

EXPOSE 8080 8080

ENTRYPOINT ["java", "-jar", "microservice.jar"]
