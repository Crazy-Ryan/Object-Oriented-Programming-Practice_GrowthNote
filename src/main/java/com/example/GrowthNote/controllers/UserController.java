package com.example.GrowthNote.controllers;

import com.example.GrowthNote.services.UserService;

public class UserController {

    public boolean getUserByNameAndPassword(String name, String password) {
        UserService userService = new UserService();
        return userService.getUserByNameAndPassword(name, password);
    }

    public boolean addANewUser(String name, String password) {
        UserService userService = new UserService();
        return userService.addANewUser(name, password);
    }

}