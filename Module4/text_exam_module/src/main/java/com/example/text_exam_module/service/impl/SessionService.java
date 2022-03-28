package com.example.text_exam_module.service.impl;

import com.example.text_exam_module.model.Session;
import com.example.text_exam_module.repository.SessionReopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessionService {
    Page<Session> findByName(String name, Pageable pageable);
    Page<Session> findAll(Pageable pageable);

    Session findById(int id);

    void save(Session customer);

    void remove(int id);

}
