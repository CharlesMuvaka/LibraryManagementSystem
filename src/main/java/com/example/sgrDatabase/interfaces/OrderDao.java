package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Order;

public interface OrderDao {
    //Create
    void addOrder(Order order);
    //Read
    Order getOrderById(int id);
}
