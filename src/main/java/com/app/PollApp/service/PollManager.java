package com.app.PollApp.service;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.app.PollApp.model.Poll;
import com.app.PollApp.model.User;

@Component
public class PollManager {

    HashMap<Long, User> users = new HashMap<>();
    HashMap<Long, Poll> polls = new HashMap<>();

    public Collection<User> getUsers() {
        return users.values();
    }

    public void addUser(User user) {
        user.setId(System.currentTimeMillis());
        users.put(user.getId(), user);
    }
    
}
