RichFaces 4 Archetype

This archetype creates a folder/pom.xml structure for component (like in tables)

/<category>
    /bom
        pom.xml 
    /parent
        pom.xml
    /dist
        /api
            pom.xml
        /impl
            pom.xml
        /ui
            pom.xml
        pom.xml
    pom.xml


To generate a project from the archetype, run

mvn archetype:generate -DarchetypeGroupId=org.richfaces.archetypes -DarchetypeArtifactId=richfaces-components-aggregator
                       -Dcategory=<category>

in such case will be created artifacts with:
    category : <category>
    groupId  : org.richfaces.ui.<category>
    artifact : <category>-<name>
    version  : 4.2.0-SNAPSHOT

TODO link to wiki page
TODO example with panels