package com.example.text_exam_module.service.impl;

import com.example.text_exam_module.model.SessionType;
import com.example.text_exam_module.repository.SessionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SessionTypeServiceImpl implements SessionTypeService{
   @Autowired
   private SessionTypeRepository sessionTypeRepository;
    @Override
    public Page<SessionType> findAll(Pageable pageable) {
       return sessionTypeRepository.findAll(pageable);
    }
}
