package com.amal.service;

import com.amal.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final List<User> data = new ArrayList<>();

    @Override
    public void addUser(User user) {
        data.add(user);
    }
}
