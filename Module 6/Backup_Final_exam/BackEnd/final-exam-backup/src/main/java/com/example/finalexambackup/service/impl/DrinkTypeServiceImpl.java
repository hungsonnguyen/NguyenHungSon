package com.example.finalexambackup.service.impl;

import com.example.finalexambackup.model.DrinkType;
import com.example.finalexambackup.repository.DrinkTypeRepository;
import com.example.finalexambackup.service.DrinkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkTypeServiceImpl implements DrinkTypeService {
    @Autowired
    DrinkTypeRepository drinkTypeRepository;

    @Override
    public List<DrinkType> findAll() {
        return drinkTypeRepository.findAll();
    }
}
