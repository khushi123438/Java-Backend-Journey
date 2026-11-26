# Lecture 06 – Circular Dependency, Bean Scope, Lazy & Eager

## Bean scopes
- `singleton`: one shared instance per bean definition in a Spring IoC container (default).
- `prototype`: a new instance is created each time the bean is requested from the container.
- `request`: one bean instance per HTTP request (web application).
- `session`: one bean instance per HTTP session (web application).

## Lazy and eager initialization
- Singleton beans are eagerly created by default when the application context starts.
- `@Lazy` delays creation until the bean is first requested.
- `@Lazy(false)` explicitly disables lazy initialization for that bean.

## Circular dependency
A circular dependency occurs when bean A needs bean B and bean B also needs bean A. Constructor-based circular dependencies cannot be resolved by Spring and cause startup failure. The example is intentionally illustrative; do not add it to a running application unless you want to see the startup error.
