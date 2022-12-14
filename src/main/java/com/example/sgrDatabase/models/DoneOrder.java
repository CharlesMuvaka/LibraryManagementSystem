package com.example.sgrDatabase.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "done_orders")
public class DoneOrder {
    @Id
    @Column(name = "user_id")
    @SequenceGenerator(name = "done_order_sequence",
                        sequenceName = "done_order_sequence",
                        initialValue = 1,
                        allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "done_order_sequence")
    private int id;
    @Column(name = "waiter_id",
            columnDefinition = "INTEGER")
    private int waiterId;
    @Column(name = "meal_id",
            columnDefinition = "INTEGER")
    private int mealId;
    @Column(name = "user_id",
            columnDefinition = "INTEGER")
    private int userId;
    @CreationTimestamp
    @Column(
            updatable = false,
            name = "created_at"
    )
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
