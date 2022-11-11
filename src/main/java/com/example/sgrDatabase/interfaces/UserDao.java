package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.User;

import java.util.List;

public interface UserDao {
    //Create
    void addUser(User user);
    //Read
    User getUserById(int id);
    List<User> getAlUsers();
}
