package com.example.sgrDatabase.interfaces;

import com.example.sgrDatabase.models.Order;

import java.util.List;

public interface OrderDao {
    //Create
    void addOrder(Order order);
    //Read
    Order getOrderById(int id);
    List<Order> getAllOrders();
    List<Order> getOrdersByUser(int id);
}
