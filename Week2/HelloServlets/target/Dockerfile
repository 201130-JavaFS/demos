FROM tomcat:jdk8-openjdk
RUN rm -rf /usr/local/tomact/webapps/*
COPY HelloServlets-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/HelloServlets.war
CMD ["catalina.sh", "run"]
