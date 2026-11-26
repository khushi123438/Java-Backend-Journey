# Lecture 09 – @SpringBootApplication & Auto Configuration

`@SpringBootApplication` combines three annotations:

- `@SpringBootConfiguration` (a specialized form of `@Configuration`)
- `@EnableAutoConfiguration`
- `@ComponentScan`

Auto-configuration attempts to configure Spring beans based on the dependencies available on the classpath, existing beans and configuration properties. It backs off in many cases when the application defines its own matching configuration.

Run this example as a Spring Boot Maven project with `spring-boot-starter-web`.
