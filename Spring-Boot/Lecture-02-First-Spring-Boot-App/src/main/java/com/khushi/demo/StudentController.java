package com.khushi.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/student")
    public Map<String, Object> getStudent() {
        return Map.of(
            "name", "Khushi",
            "course", "B.Tech CSE (AI)",
            "year", 3
        );
    }
}
