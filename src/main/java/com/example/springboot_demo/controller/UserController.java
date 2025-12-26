package com.example.springboot_demo.controller;

import com.example.springboot_demo.entity.User;
import com.example.springboot_demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestParam String name, @RequestParam String email) {
        return userService.createUser(name, email);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
