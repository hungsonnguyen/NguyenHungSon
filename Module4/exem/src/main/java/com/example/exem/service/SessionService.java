package com.example.exem.service;


import com.example.exem.model.TranSaction;
import org.hibernate.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessionService {
    Page<TranSaction> findByName(String name, Pageable pageable);
    Page<TranSaction> findAll(Pageable pageable);

    TranSaction findById(int id);

    void save(TranSaction tranSaction);

    void remove(int id);

}
