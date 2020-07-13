FROM intellectdevcloud/platform-java:11

ARG JAR_FILE=./students-service.jar


# cd /usr/local/runme
WORKDIR /usr/local/runme

# copy target/find-links.jar /usr/local/runme/app.jar
COPY ${JAR_FILE} students-service.jar


# java -jar /usr/local/runme/students-service.jar
ENTRYPOINT ["java","-jar","students-service.jar"]