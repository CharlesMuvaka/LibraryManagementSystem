package com.example.sgrDatabase.repositories;

import com.example.sgrDatabase.models.Waiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepo extends JpaRepository<Waiter, Integer> {
}
