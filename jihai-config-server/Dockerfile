FROM openjdk:8-jre-alpine
MAINTAINER  kevin  <gchen@gizwits.com>
VOLUME /tmp
ADD build/libs/config-server-1.0.0.jar .
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-server-1.0.0.jar"]