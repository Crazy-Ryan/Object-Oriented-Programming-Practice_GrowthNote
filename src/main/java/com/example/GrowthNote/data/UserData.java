package com.example.GrowthNote.data;

import com.example.GrowthNote.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData {
    // jack：123456
    // xiaoming：2345678
    public static List<User> userLists = new ArrayList(Arrays.asList(
            new User("f8d809a3-6206-4d93-ae2c-3995868535b6", "jack", "123456-1"),
            new User("38d76638-91a6-49dc-b31a-418d2a0c3e0a", "xiaoming", "23456-1")));
}
