package com.example.finalexambackup.service.impl;

import com.example.finalexambackup.model.EatType;
import com.example.finalexambackup.repository.EatTypeRepository;
import com.example.finalexambackup.service.EatTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EatTypeServiceImpl implements EatTypeService {
    @Autowired
    EatTypeRepository eatTypeRepository;

    @Override
    public List<EatType> findAll() {
        return eatTypeRepository.findAll();
    }
}
