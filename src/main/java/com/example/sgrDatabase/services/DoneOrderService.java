package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.DoneOrderDao;
import com.example.sgrDatabase.interfaces.UserDao;
import com.example.sgrDatabase.models.DoneOrder;
import com.example.sgrDatabase.models.Waiter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoneOrderService implements DoneOrderDao {
    @Override
    public void addDoneOrder(DoneOrder doneOrder) {

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
