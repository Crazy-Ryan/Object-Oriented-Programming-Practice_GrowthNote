package com.example.GrowthNote.repositories;

import com.example.GrowthNote.data.UserData;
import com.example.GrowthNote.entities.User;

import java.util.List;
import java.util.UUID;

public class UserRepository {
    public boolean getUserByNameAndPassword(String name, String password) {
        List<User> users = UserData.userLists;
        for (User user : users) {
            if (user.getName().equals(name)) {
                if (user.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addANewUser(String name, String password) {
        List<User> users = UserData.userLists;
        User newUser = new User(UUID.randomUUID().toString(), name, password);
        return users.add(newUser);
    }

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        System.out.println(userRepository.addANewUser("tony","aaa"));
    }
}
