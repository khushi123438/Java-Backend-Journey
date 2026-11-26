package com.example.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeanLookupExample implements CommandLineRunner {
    private final College college;
    private final Course course;

    public BeanLookupExample(College college, Course course) {
        this.college = college;
        this.course = course;
    }

    @Override
    public void run(String... args) {
        college.display();
        System.out.println("Course: " + course.getTitle());
    }
}
