FROM intellectdevcloud/platform-java:11

ARG JAR_FILE=./kube-service.jar


# cd /usr/local/runme
WORKDIR /usr/local/runme

# copy target/find-links.jar /usr/local/runme/app.jar
COPY ${JAR_FILE} kube-service.jar


# java -jar /usr/local/runme/kube-service.jar
ENTRYPOINT ["java","-jar","kube-service.jar"]