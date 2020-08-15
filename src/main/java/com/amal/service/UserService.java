package com.amal.service;

import com.amal.model.User;

public interface UserService {
    void addUser(User user);
    User getUserByUserName(String userName);
}
