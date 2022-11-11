package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.UserDao;
import com.example.sgrDatabase.models.User;
import com.example.sgrDatabase.repositories.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDao {
    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addUser(User user) {
        repo.save(user);
    }

    @Override
    public User getUserById(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public List<User> getAlUsers() {
        return repo.findAll();
    }
}
