package com.example.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind to.annotation.RestController;

/**
 * 一个简单的 REST 控制器
 */
public class HelloController {

    /**
     * 处理对 "/hello" 路径的 GET 请求
     * @return 返回一个简单的字符串
     */

    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}