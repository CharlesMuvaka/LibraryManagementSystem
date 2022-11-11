package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.User;

public interface UserDao {
    //Create
    void addUser(User user);
    //Read
    User getUserById(int id);
}
