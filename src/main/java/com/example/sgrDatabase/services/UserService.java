package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.UserDao;
import com.example.sgrDatabase.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDao {
    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAlUsers() {
        return null;
    }
}
