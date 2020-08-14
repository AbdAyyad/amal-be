package com.amal.controller;

import com.amal.model.User;
import com.amal.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/user")
    Map<String, String> createUser(@RequestBody User user) {
        userService.addUser(user);
        return Collections.singletonMap("status", "ok");
    }
}
