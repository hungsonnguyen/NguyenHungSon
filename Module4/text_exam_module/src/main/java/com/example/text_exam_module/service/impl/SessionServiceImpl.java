package com.example.text_exam_module.service.impl;

import com.example.text_exam_module.model.Session;
import com.example.text_exam_module.repository.SessionReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionReopository sessionReopository;

    @Override
    public Page<Session> findByName(String name, Pageable pageable) {
        return sessionReopository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<Session> findAll(Pageable pageable) {
        return sessionReopository.findAll(pageable);
    }

    @Override
    public Session findById(int id) {
        return sessionReopository.findById(id).orElse(null);
    }

    @Override
    public void save(Session customer) {
        sessionReopository.save(customer);
    }

    @Override
    public void remove(int id) {
        sessionReopository.deleteById(id);
    }
}
