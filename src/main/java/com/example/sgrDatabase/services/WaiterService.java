package com.example.sgrDatabase.services;

import com.example.sgrDatabase.interfaces.Worker;
import com.example.sgrDatabase.models.Waiter;
import com.example.sgrDatabase.repositories.WorkerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaiterService implements Worker {
    private WorkerRepo repo;

    public WaiterService(WorkerRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addWorker(Waiter waiter) {
        repo.save(waiter);
    }

    @Override
    public Waiter getaWaiterById(int waiterId) {
        return repo.getReferenceById(waiterId);
    }

    @Override
    public List<Waiter> getWaiters() {
        return null;
    }
}
