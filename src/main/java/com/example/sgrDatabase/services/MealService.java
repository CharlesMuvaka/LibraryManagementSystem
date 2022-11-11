package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.MealDao;
import com.example.sgrDatabase.models.Meal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService implements MealDao {
    @Override
    public void addMeal(Meal meal) {

    }

    @Override
    public Meal getMealById(int id) {
        return null;
    }

    @Override
    public List<Meal> getAllMeals() {
        return null;
    }

    @Override
    public List<Meal> findByCategory() {
        return null;
    }
}
