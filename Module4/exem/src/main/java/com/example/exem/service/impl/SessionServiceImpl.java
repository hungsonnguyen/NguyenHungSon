package com.example.exem.service.impl;


import com.example.exem.repository.SessionRepository;
import com.example.exem.service.SessionService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public Page<Session> findByName(String name, Pageable pageable) {
        return sessionRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<Session> findAll(Pageable pageable) {
        return sessionRepository.findAll(pageable);
    }

    @Override
    public Session findById(int id) {
        return sessionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Session customer) {
        sessionRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        sessionRepository.deleteById(id);
    }
}
