# Lecture 03 – Apache Maven

Maven is a build automation and dependency-management tool for Java projects.

## Important files
- `pom.xml`: project configuration, dependencies, plugins and build settings.
- `src/main/java`: application source code.
- `src/test/java`: test source code.
- `target/`: generated build output.

## Common commands

```bash
mvn clean       # remove previous build output
mvn compile     # compile source code
mvn test        # run tests
mvn package     # create JAR/WAR package
mvn install     # install artifact in local Maven repository
mvn spring-boot:run
```

See `code/pom-example.xml` for a minimal Spring Boot Maven configuration.
