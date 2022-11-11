package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Waiter;

public interface Worker {
    //Create
    void addWorker(Waiter waiter);
    //Read
    Waiter getaWaiterById(Waiter waiter);
}
