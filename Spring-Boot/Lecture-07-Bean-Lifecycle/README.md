# Lecture 07 – Spring Bean Lifecycle

Simplified lifecycle:

1. Spring creates the bean.
2. Spring injects its dependencies.
3. Initialization callbacks run.
4. Bean is ready to use.
5. On context shutdown, destruction callbacks run for supported bean scopes.

`@PostConstruct` runs after dependency injection. `@PreDestroy` runs before a managed bean is destroyed (for example, during a graceful context shutdown). These annotations are from `jakarta.annotation` in Spring Boot 3.
