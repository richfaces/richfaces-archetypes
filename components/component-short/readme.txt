RichFaces 4 Archetype

This archetype creates a folder/pom.xml structure for component (like in tables)

/<artifact-id>
    src/main/java
    pom.xml

To generate a project from the archetype, run

mvn archetype:generate -DarchetypeGroupId=org.richfaces.archetypes -DarchetypeArtifactId=richfaces-component
                       -Dcategory=<version> -Dname=<name>

in such case will be created artifacts with:
    category : <category>
    name     : <name>
    groupId  : org.richfaces.ui.<category>
    artifact : <category>-<name>
    version  : 4.3.0.20120802-M1 

TODO link to wiki page
TODO example with panels