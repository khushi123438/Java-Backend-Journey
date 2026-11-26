# Lecture 10 – application.properties, @Value & Runner Interfaces

## application.properties
A configuration file normally placed at `src/main/resources/application.properties`.

## @Value
Injects a property value into a Spring-managed bean.

## CommandLineRunner
Runs code after the Spring application context has started. It receives raw command-line arguments as `String... args`.

## ApplicationRunner
Also runs after startup, but receives parsed arguments through `ApplicationArguments`.

Both interfaces are useful for startup tasks. If multiple runners exist, `@Order` can control their execution order.
