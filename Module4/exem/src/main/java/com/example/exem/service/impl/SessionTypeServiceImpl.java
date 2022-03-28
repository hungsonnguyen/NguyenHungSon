package com.example.exem.service.impl;

import com.example.exem.model.SessionType;
import com.example.exem.repository.SessionTypeRepository;
import com.example.exem.service.SessionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SessionTypeServiceImpl implements SessionTypeService {
   @Autowired
   private SessionTypeRepository sessionTypeRepository;
    @Override
    public Page<SessionType> findAll(Pageable pageable) {
       return sessionTypeRepository.findAll(pageable);
    }
}
