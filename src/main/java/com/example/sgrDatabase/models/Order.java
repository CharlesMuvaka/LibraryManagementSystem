package com.example.sgrDatabase.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    @SequenceGenerator(name = "order_sequence",
            sequenceName = "order_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "order_sequence")
    private int id;
    @Column(name = "user_id",
            columnDefinition = "INTEGER")
    private int userId;
    @Column(name = "meal_id",
            columnDefinition = "INTEGER")
    private int mealId;
    @CreationTimestamp
    @Column(
            updatable = false,
            name = "created_at"
    )
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
