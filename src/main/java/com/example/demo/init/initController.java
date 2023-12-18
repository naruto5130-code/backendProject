package com.example.demo.init;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class initController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to the Spring Boot world!";
    }
}
