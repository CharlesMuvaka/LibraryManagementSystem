package com.example.sgrDatabase.repositories;

import com.example.sgrDatabase.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepo extends JpaRepository<Meal, Integer> {
}
