package com.amal.service;

import com.amal.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void addUser(User user);
}
