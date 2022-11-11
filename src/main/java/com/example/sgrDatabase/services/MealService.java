package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.MealDao;
import com.example.sgrDatabase.models.Meal;
import com.example.sgrDatabase.repositories.MealRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService implements MealDao {
    private MealRepo repo;

    public MealService(MealRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addMeal(Meal meal) {
        repo.save(meal);
    }

    @Override
    public Meal getMealById(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public List<Meal> getAllMeals() {
        return repo.findAll();
    }

    @Override
    public List<Meal> findByCategory() {
        return null;
    }
}
