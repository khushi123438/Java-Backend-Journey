package com.example.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class StartupCommandLineRunner implements CommandLineRunner {

    private final Student student;

    public StartupCommandLineRunner(Student student) {
        this.student = student;
    }

    @Override
    public void run(String... args) {
        System.out.println("CommandLineRunner executed");
        student.display();
    }
}
