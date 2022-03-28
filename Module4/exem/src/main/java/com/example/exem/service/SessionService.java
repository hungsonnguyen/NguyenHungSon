package com.example.exem.service;


import org.hibernate.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessionService {
    Page<Session> findByName(String name, Pageable pageable);
    Page<Session> findAll(Pageable pageable);

    Session findById(int id);

    void save(Session customer);

    void remove(int id);

}
