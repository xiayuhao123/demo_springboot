package com.example.springboot_demo.service;

import com.example.springboot_demo.component.DemoComponent;
import org.springframework.stereotype.Service;

@Service
public class ConstructorService {

    private final DemoComponent demoComponent;

    // Constructor Injection (Spring 4.3+ no longer requires @Autowired on single constructor)
    public ConstructorService(DemoComponent demoComponent) {
        this.demoComponent = demoComponent;
    }

    public String sayHello() {
        return "ConstructorService calling: " + demoComponent.sayHello();
    }
}
