package com.example.springboot_demo.component;

import org.springframework.stereotype.Component;

@Component
public class DemoComponent {
    public String sayHello() {
        return "Hello from DemoComponent!";
    }
}
