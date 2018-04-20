FROM lwieske/java-8
MAINTAINER liujiawei
ARG DUBBO_PORT
COPY target/*.jar /app.jar
ENTRYPOINT ["sh","-c","java -jar -Ddubbo.protocol.port=$DUBBO_PORT /app.jar"]
EXPOSE $DUBBO_PORT
