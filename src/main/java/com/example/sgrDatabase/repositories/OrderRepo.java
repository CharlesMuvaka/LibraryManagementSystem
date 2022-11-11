package com.example.sgrDatabase.repositories;

import com.example.sgrDatabase.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
