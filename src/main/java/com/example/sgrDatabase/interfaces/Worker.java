package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Waiter;

import java.util.List;

public interface Worker {
    //Create
    void addWorker(Waiter waiter);
    //Read
    Waiter getaWaiterById(Waiter waiter);
    List<Waiter> getWaiters();
}
