package com.example.sgrDatabase.models;

import java.sql.Timestamp;

public class DoneOrder {

    private int id;
    private int waiterId;
    private int mealId;
    private int userId;
    private Timestamp doneTime;

    public DoneOrder(int waiterId, int mealId, int userId, Timestamp doneTime) {
        this.waiterId = waiterId;
        this.mealId = mealId;
        this.userId = userId;
        this.doneTime = doneTime;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(Timestamp doneTime) {
        this.doneTime = doneTime;
    }
}