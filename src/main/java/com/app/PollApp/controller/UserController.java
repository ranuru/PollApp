package com.app.PollApp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.PollApp.model.User;
import com.app.PollApp.service.PollManager;

@RestController
public class UserController {

    @Autowired
    PollManager manager;

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        manager.addUser(user);
        return "User created";
}

    @GetMapping("/users")
    public Collection<User> getUsers() {
        return manager.getUsers();
}
}