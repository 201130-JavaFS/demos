# Create a new group
sudo groupadd jenkins-tomcat
# Add Both jenkins and tomcat users to the group
sudo usermod -aG jenkins-tomcat jenkins
sudo usermod -aG jenkins-tomcat tomcat
# Change the group of the webapps folder so that both jenkins and tomcat have access
sudo chgrp jenkins-tomcat /var/lib/tomcat/webapps
# Restart both services
sudo service tomcat restart
sudo service jenkins restart
