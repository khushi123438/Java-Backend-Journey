# Spring Boot – Phase 1: Lecture-wise Code

**Course:** Coder Army Spring Boot playlist  
**Coverage:** Lectures 1–10  
**Language:** Java  
**Framework:** Spring Boot

This folder contains lecture-wise code examples and short explanations. The examples are separated intentionally: some are standalone Java demonstrations, while others are Spring-managed examples.

## Contents

| Lecture | Folder | Main concepts |
|---|---|---|
| 01 | `Lecture-01-Introduction` | Spring vs Spring Boot, project overview |
| 02 | `Lecture-02-First-Spring-Boot-App` | First application, REST API |
| 03 | `Lecture-03-Maven` | `pom.xml`, dependencies, Maven commands |
| 04 | `Lecture-04-IoC-and-DI` | IoC, constructor injection |
| 05 | `Lecture-05-Beans-and-Container` | IoC container, `@Component`, `@Autowired`, `@Bean` |
| 06 | `Lecture-06-Scopes-and-Circular-Dependency` | Scopes, lazy/eager, circular dependency |
| 07 | `Lecture-07-Bean-Lifecycle` | `@PostConstruct`, `@PreDestroy` |
| 08 | `Lecture-08-XML-Configuration` | XML bean configuration |
| 09 | `Lecture-09-Auto-Configuration` | `@SpringBootApplication`, auto-configuration |
| 10 | `Lecture-10-Properties-and-Runners` | properties, `@Value`, runners |

## How to use

- Read each lecture's `README.md` first.
- Open the Java/XML/properties files in that lecture's `code` folder.
- The Spring Boot examples use **Java 17+** and **Spring Boot 3.x**.
- For runnable Spring Boot examples, open the relevant lecture folder as a Maven project and run:

```bash
mvn spring-boot:run
```

**Important:** Not every folder is a separate complete Maven project. Lecture 02 is a complete runnable starter project. Other folders contain focused examples/snippets intended to be copied into a Spring Boot project when indicated. The circular-dependency example in Lecture 06 is intentionally invalid at startup so you can observe the problem.

## Learning tip

After reading a code example, try changing one thing yourself:
- change an endpoint or return value;
- replace field injection with constructor injection;
- compare singleton and prototype bean instances;
- observe when lifecycle methods execute;
- change a value in `application.properties`.

