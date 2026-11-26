package com.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Use @Bean when you want to explicitly define/configure an object.
    @Bean
    public Course course() {
        return new Course("Spring Boot");
    }
}
