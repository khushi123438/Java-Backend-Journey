package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
