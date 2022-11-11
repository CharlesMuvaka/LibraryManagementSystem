package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.OrderDao;
import com.example.sgrDatabase.models.Order;
import com.example.sgrDatabase.repositories.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderDao {
    private OrderRepo repo;

    public OrderService(OrderRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public Order getOrderById(int id) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public List<Order> getOrdersByUser(int id) {
        return null;
    }
}
