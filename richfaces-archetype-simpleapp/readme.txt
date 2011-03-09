========================================================================

                      RichFaces - Ajax enabled JSF 2.0 component library

                                              RichFaces 4.0.CR1 EXAMPLES
					      	    http://richfaces.org
                                                              March 2011
                     This software is distributed under the terms of the 
                            FSF Lesser Gnu Public License (see lgpl.txt)

========================================================================

RichFaces 4 is a component library for JSF2 and an advanced framework for
easily integrating AJAX capabilities into business applications.

This file explains how to generate a RichFaces application as a Maven 2
project. If you find any issue with the project, please report 
the issue on the RichFaces user forum (http://community.jboss.org/en/richfaces) 
or jira (https://issues.jboss.org/browse/RF).


USING THE ARCHETYPE:
--------------------


1. Install Maven 2 (see http://maven.apache.org for details)
    
2. Generate the project from the archetype 
    
After installing Maven 2, open a terminal inside the directory you
want your project to be created and execute the command below:
       
       mvn archetype:generate -DarchetypeGroupId=org.richfaces.archetypes 
              		      -DarchetypeArtifactId=richfaces-archetype-simpleapp 
    			      -DarchetypeVersion=<version> 
			      -DgroupId=<yourGroupId> 
			      -DartifactId=<yourArtifactId> 
			      -Dversion=1.0-SNAPSHOT

After executing the command, Maven will generate your project structure.
Make sure you replace the parameters values enclosed by < > according 
to your needs. 
   


MORE INFORMATION AND RESOURCES
------------------------------

For more information on RichFaces 4 features, how to migrate from
previous versions, and answers to the most frequently asked questions (FAQ),
please visit RichFaces website at:

http://www.jboss.org/richfaces.

Or the Wiki at:

    - http://community.jboss.org/wiki/richfaceswikihomepage

To report or check the status of issues related to RichFaces use the 
project's Jira at:

    - https://issues.jboss.org/browse/RF

Community support and help can be obtained from the RichFaces forums at:

    - http://community.jboss.org/en/richfaces?view=discussions


###
