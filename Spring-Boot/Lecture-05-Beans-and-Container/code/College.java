package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class College {
    private final Student student;

    // A single constructor is automatically used for injection.
    public College(Student student) {
        this.student = student;
    }

    public void display() {
        System.out.println("Student: " + student.getName());
    }
}
