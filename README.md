# Maven-Hands-On
30 Days Of DevOps | Zero To Hero | Maven Hands-On | Day-2

# https://start.spring.io/ 
is used to generate a Spring Boot project. It allows you to quickly create a skeleton Spring Boot application with the necessary dependencies, packaging format, and project structure.

You typically use it to:

Generate a new Spring Boot project with selected dependencies (e.g., Spring Web, Spring Data JPA, etc.).

Download a pre-configured ZIP file containing the project structure.

Set up Maven or Gradle build files automatically.



Maven Build Lifecycle:
======================

Maven has three built-in build lifecycles: clean, default, and site.

Clean Lifecycle:

clean: Deletes any build output generated by previous builds.

Default Lifecycle:
==================
#validate: Validates the project structure and verifies if all necessary information is available.

#compile: Compiles the project's source code.

#test: Runs unit tests against compiled source code.

#package: Packages the compiled code into a distributable format (e.g., JAR, WAR).

#install: Installs the package into the local repository for use as a dependency in other projects (.m2).

#deploy: Deploys the package to a remote repository for sharing with other developers or environments (e.g., push to Nexus).

Site Lifecycle:
===============
site: Generates project documentation and reports.

site-deploy: Deploys the generated documentation to a remote web server.

Maven Command Examples:
=======================
#mvn compile: Compiles the project's source code.

#mvn test: Runs unit tests against compiled code.

#mvn package: Packages the compiled code into a distributable format.

#mvn install: Installs the package into the local repository.

#mvn deploy: Deploys the package to a remote repository.

#mvn clean:

#mvn clean package: 

#mvn site: Generates project documentation and reports.

#mvn site-deploy: Deploys the generated documentation to a remote web server.


prep the enviroment
====================

#create Group policy 
  #create a new one like attached picture

#Create EC2
#OS: Ubuntu 22.4
#InstanceType: t2.small 
#create your keypair
#config storage : 10G
#login to your instance by MobaXtrem




JDK & Maven Installation
========================
#sudo apt-get update -y
#sudo apt install openjdk-17-jre
#sudo apt-get install maven -y


