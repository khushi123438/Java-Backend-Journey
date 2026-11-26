# Lecture 05 – IoC Container, Beans & Annotations

A **Spring Bean** is an object created, configured and managed by the Spring IoC container.

- `@Component`: marks a class for component scanning.
- `@Autowired`: asks Spring to inject a matching dependency. Constructor injection is preferred.
- `@Configuration`: marks a configuration class.
- `@Bean`: declares a bean from a method's return value.

These are focused snippets. Put them in the same package under a Spring Boot application whose component scan includes this package.
