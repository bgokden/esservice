FROM java:8-jre

ADD /target/esservice-0.0.1-SNAPSHOT.jar  /etc/esservice.jar

ENTRYPOINT ["java", "-jar", "/etc/esservice.jar"]
