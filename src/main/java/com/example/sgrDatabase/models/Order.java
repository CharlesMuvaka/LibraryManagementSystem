package com.example.sgrDatabase.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.sql.Timestamp;
@Entity
@Table(name = "orders")
public class Order {
    private int id;
    private int userId;
    private int mealId;
    private Timestamp doneTime;

    public Order(int userId, int mealId, Timestamp doneTime) {
        this.userId = userId;
        this.mealId = mealId;
        this.doneTime = doneTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public Timestamp getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(Timestamp doneTime) {
        this.doneTime = doneTime;
    }
}
