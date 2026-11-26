package com.example.lifecycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LifecycleRunner implements CommandLineRunner {
    private final Student student;

    public LifecycleRunner(Student student) {
        this.student = student;
    }

    @Override
    public void run(String... args) {
        student.study();
    }
}
