package com.example.sgrDatabase.repositories;

import com.example.sgrDatabase.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
