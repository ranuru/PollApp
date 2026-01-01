package com.app.PollApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.PollApp.model.User;

@RestController
public class UserController {

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return "User created";
    
}}
