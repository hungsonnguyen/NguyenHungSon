package com.example.exem.service.impl;


import com.example.exem.model.TranSaction;
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
    public Page<TranSaction> findByName(String name, Pageable pageable) {
        return sessionRepository.findAllByCodeContaining(name, pageable);
    }

    @Override
    public Page<TranSaction> findAll(Pageable pageable) {
        return sessionRepository.findAll(pageable);
    }

    @Override
    public TranSaction findById(int id) {
        return sessionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TranSaction tranSaction) {
        sessionRepository.save(tranSaction);
    }

    @Override
    public void remove(int id) {
        sessionRepository.deleteById(id);
    }
}
