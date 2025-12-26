package com.example.springboot_demo.controller;

import com.example.springboot_demo.service.AutowiredService;
import com.example.springboot_demo.service.ConstructorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ConstructorService constructorService;
    private final AutowiredService autowiredService;

    public HelloController(ConstructorService constructorService, AutowiredService autowiredService) {
        this.constructorService = constructorService;
        this.autowiredService = autowiredService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    
    @GetMapping("/hellogg")
    public void testprint() {
        autowiredService.testPrintSomething();
    }

    @GetMapping("/autowired")
    public String testAutowired() {
        return autowiredService.sayHello();
    }

    @GetMapping("/constructor")
    public String testConstructor() {
        return constructorService.sayHello();
    }
}
