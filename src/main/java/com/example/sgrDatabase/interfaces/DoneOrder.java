package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Waiter;

import java.util.List;

public interface DoneOrder {
    //create
    void addDoneOrder(DoneOrder doneOrder);
    //Read
    DoneOrder getDoneOrderById(int id);
    List<Waiter> getWaitersDoneOrdersById(int id);
    List<DoneOrder> getAllDoneOrders();
    List<User> getUsersOrders(int id);



    //Update
    //delete
}
