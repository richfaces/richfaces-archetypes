========================================================================

                      RichFaces - Ajax enabled JSF 2.0 component library

                                 RichFaces 4.5.17.Final ARCHETYPE PROJECT
                                                    http://richfaces.org
                                                              March 2011
                     This software is distributed under the terms of the 
                            FSF Lesser Gnu Public License (see lgpl.txt)

========================================================================

This archetype will create a basic application generated with richfaces.
This file explains how to build and set up the project using Maven. If you
find any issue related to RichFaces framework, please report the issue on
the RichFaces user forum (http://community.jboss.org/en/richfaces) or
jira (https://issues.jboss.org/browse/RF).


SETTING UP THE APPLICATION
--------------------------

1. Requirements

In order to build the Examples applications you will need:
    - Maven 3.0.x or later
    - Servers: Apache Tomcat 6.0 or any JEE6 application server 
      (e.g. Jboss AS 7/EAP6)
    - JDK 1.6

Also optional additional Software would make it easy for you to work 
with the sources of the application:

    - Eclipse IDE + JBoss Tools (to explore and run the application 
      in IDE). You're obviously free to use any other IDE you wish, but
      JBoss Tools is recommended. 

2. Generate the project using the archetype.

Maven will automatically create a project for you using the archetype
command below.  Just provide the variables and maven will do the rest.

   mvn archetype:generate \
       -DarchetypeGroupId=org.richfaces.archetypes \
       -DarchetypeArtifactId=richfaces-archetype-simpleapp \
       -DarchetypeVersion=4.5.17.Final \
       -DgroupId=<yourGroupId> \
       -DartifactId=<yourArtifactId> \
       -Dversion=<yourSnapshotVersion>

3. Build/Deploy

    - Deploying on Tomcat

      To build the project for Tomcat you need to navigate to the 
      /examples/richfaces-showcase and run:
          
          mvn clean package
	
      When you see the BUILD SUCCESSFUL message you can deploy the 
      application on the server. To deploy it on Tomcat, copy the .war 
      file from 'target' folder to TOMCAT_HOME/webapps folder. Then, 
      launch the startup.sh or startup.bat script from TOMCAT_HOME/bin/ 
      directory to start the server.

    - Deploying on JEE6 server (JBoss AS 6)
       	 
      To build the project for a JEE6 server you need to navigate to the 
      /examples/richfaces-showcase and run

          mvn clean package -Pjee6

      When you see the BUILD SUCCESSFUL message you can deploy the 
      application on the server. To deploy it on the application server 
      copy the .war file from 'target' folder to the JBOSS_HOME/server/default/deploy 
      folder (or change "default/" to used profile folder). Then, launch 
      the run.sh or run.bat script from JBOSS_HOME/bin/ directory to start 
      the server.


    - If you wan to create a binaries for both Tomcat 6 and JBoss 6 run

          mvn clean package -P release


After deploying the examples to your server open a browser and type 
http://localhost:8080/projectName to execute the application.


MORE INFORMATION AND RESOURCES
------------------------------

For more information on this project please contact the developer.

For more information on RichFaces 4, please visit RichFaces 
website at:

    - http://richfaces.org
