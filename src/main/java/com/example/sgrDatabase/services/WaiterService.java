package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.Worker;
import com.example.sgrDatabase.models.Waiter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaiterService implements Worker {
    @Override
    public void addWorker(Waiter waiter) {

    }

    @Override
    public Waiter getaWaiterById(Waiter waiter) {
        return null;
    }

    @Override
    public List<Waiter> getWaiters() {
        return null;
    }
}
