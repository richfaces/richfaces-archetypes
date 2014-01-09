This archetype is generated using the qstools archetypeSync maven plugin:

https://github.com/jboss-developer/maven-qstools-plugin

The plugin synchronizes the source of this archetype with the quickstart available at:

https://github.com/richfaces/jdf-quickstarts/tree/master/kitchensink-rf

To perform this source synchornisation, run the command:

    mvn clean qstools:archetypeSync

Until JDF-592 (https://issues.jboss.org/browse/JDF-592) is resolved, we have to patch the genrerated pom.  Do this by running the command:

    patch -p2  < post-qstool-archetype-sync.patch
