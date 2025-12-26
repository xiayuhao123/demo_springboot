package com.example.springboot_demo.service;

import com.example.springboot_demo.component.DemoComponent;
import com.example.springboot_demo.component.PrintSomething;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowiredService {

    @Autowired
    private DemoComponent demoComponent;

    @Autowired
    private PrintSomething printSomething;

    public String sayHello() {
        return "AutowiredService calling: " + demoComponent.sayHello();
    }

    public void testPrintSomething() {
        printSomething.print();
    }
}
