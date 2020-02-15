package com.example.GrowthNote.services;

import com.example.GrowthNote.repositories.UserRepository;

public class UserService {
    public boolean getUserByNameAndPassword(String name, String password) {
        UserRepository userRepo = new UserRepository();
        return userRepo.getUserByNameAndPassword(name, (password + "-1"));
    }

    public boolean addANewUser(String name, String password) {
        UserRepository userRepo = new UserRepository();
        return userRepo.addANewUser(name, (password + "-1"));
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getUserByNameAndPassword("jack","123456"));
    }

}
