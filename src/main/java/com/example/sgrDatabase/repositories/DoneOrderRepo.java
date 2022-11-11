package com.example.sgrDatabase.repositories;

import com.example.sgrDatabase.models.DoneOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoneOrderRepo extends JpaRepository<DoneOrder, Integer> {
}
