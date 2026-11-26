package com.example.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() {
        System.out.println("1. Constructor: object created");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct: dependencies are injected; initialization runs");
    }

    public void study() {
        System.out.println("3. Bean is ready to use");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("4. @PreDestroy: bean is being destroyed");
    }
}
