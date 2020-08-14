package com.amal.model;

import org.jetbrains.annotations.NotNull;

public class User {
    private final String name;
    private final String email;
    private final String password;

    public User(@NotNull String name, @NotNull String email, @NotNull String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    @NotNull
    public String getPassword() {
        return password;
    }
}
