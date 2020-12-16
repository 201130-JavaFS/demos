

## **Installation**

To build and manage Docker containers, we will be using Docker Desktop. To run linux containers, WSL linux kernel package will also need to be installed. The specific instructions for a Windows home system can be found [here](https://docs.docker.com/docker-for-windows/install-windows-home/)

### **Build Project**

We want to generate a WAR file from the project. To do so, we right click and select Run as -> Maven build. A new window will open (Edit configuration), inside of which there is Goals. Enter "clean compile install" into Goals and select Run. 

The WAR file will be created under the target folder of your project (by default a new project WAR file will look like "<name_of_project>-0.0.1-SNAPSHOT.war" ). 

A WAR file has already been provided in the folder. Sending a GET request to http://localhost:8080/sample will show a sample "Hello World" application. NOTE: If you change the name of the project in the docker image, the url will change to reflect the new name i.e. http://localhost:8080/<war-file-name>/


## **Dockerfile**

Inside the project, create a file "DockerFile" in the root folder.
Inside the file, insert:

    FROM tomcat:8-jre8-alpine 
    RUN rm -rf /usr/local/tomat/webapps/* 
    COPY sample.war /usr/local/tomcat/webapps/demo.war
    CMD ["catalina.sh", "run"] 

- `FROM` is typically the first instruction and sets the base image. Images can be built on top of other pre-made images, images can be found on dockerhub. 
- `RUN` is executed as the docker image is being built. Multiple RUN statements can be used (unlike CMD where only the final CMD layer will execute). In this case the RUN statement is used to remove any files in the webapps folder before adding our file.
- `COPY` will copy images from the host machine to the container's file system. In this case the war file is being added to the tomcat webapps folder so that tomcat will automcatilly run it, and being rename from 'sample.war' to 'demo.war'.
- `CMD` will specify the runtime arguments to be executed. In this case it will execute a script to get tomcat up and running.

This is one example of how a Docker File can be configured. Additional instructions exist for creating more advance [docker images](https://kapeli.com/cheat_sheets/Dockerfile.docset/Contents/Resources/Documents/index)

## **Generating a docker image and running a container**

Windows command line or Linux terminal (via Git Bash) can be used. This example will use Git Bash. 

1. Navigate to the project folder from the command line. `cd <filespace>`
2. Ensure docker is installed by checking what version it is: `docker  -v`
    - If Docker is installed, the result should be of a similar format to : `Docker version 19.03.8, build afacb8b` 
3. Create a docker image from the file using (-t allows the image to be named): `docker build -t <imagename> .` i.e. `docker build -t planetdemo .`
    - If `"docker build" requires exactly 1 argument"` appears, remember to put a full stop after the command.
    - `-t` allows us to associate a tag with the image.
    - To get a list of all the images available, input `docker image ls` 
4. To run the docker image: `docker run -d -p <host port>:<docker port>` i.e. `docker run -d -p 9999:8080`
    -  `-d` run the container in detached mode, container will run in the background 
    -  `-p` allows us to map container ports to the host ports. The ports do not have to be the same, in the example we map the host port 9999 to the  container port of 8080.  So the url will then become http://localhost:9999/demo/.
5. To verify how many containers are currently running in your system: `docker ps` (or `docker ps -a` for a list of all containers).
6. To shut down a container, input `docker container stop <container name or container id>`, to start a container input a similar command `docker container start <container name or container id>`




