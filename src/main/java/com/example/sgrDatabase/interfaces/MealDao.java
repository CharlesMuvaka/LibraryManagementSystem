package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Meal;

public interface MealDao {
    //Create
    void addMeal(Meal meal);
    //Read
    Meal getMealById(int id);
}
