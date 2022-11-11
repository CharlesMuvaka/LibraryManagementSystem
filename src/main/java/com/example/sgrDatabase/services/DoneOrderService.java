package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.DoneOrderDao;
import com.example.sgrDatabase.interfaces.UserDao;
import com.example.sgrDatabase.models.DoneOrder;
import com.example.sgrDatabase.models.Waiter;
import com.example.sgrDatabase.repositories.DoneOrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoneOrderService implements DoneOrderDao {
    private DoneOrderRepo repo;

    public DoneOrderService(DoneOrderRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addDoneOrder(DoneOrder doneOrder) {
        repo.save(doneOrder);
    }

    @Override
    public DoneOrder getDoneOrderById(int id) {
        return null;
    }

    @Override
    public List<Waiter> getWaitersDoneOrdersById(int id) {
        return null;
    }

    @Override
    public List<DoneOrderDao> getAllDoneOrders() {
        return null;
    }

    @Override
    public List<UserDao> getUsersOrders(int id) {
        return null;
    }
}
