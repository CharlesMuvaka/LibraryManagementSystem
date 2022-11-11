package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Waiter;

import java.util.List;

public interface DoneOrder {
    //create
    void addDoneOrder(DoneOrder doneOrder);
    //Read
    DoneOrder getDoneOrderById(int id);

    //Update
    //delete
}
