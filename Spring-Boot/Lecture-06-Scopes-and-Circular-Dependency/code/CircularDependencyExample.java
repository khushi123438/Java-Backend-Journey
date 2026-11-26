package com.example.circular;

import org.springframework.stereotype.Component;

// Intentionally causes a circular-dependency startup error.
@Component
class ServiceA {
    ServiceA(ServiceB serviceB) {
    }
}

@Component
class ServiceB {
    ServiceB(ServiceA serviceA) {
    }
}
