package com.example.exem.service;


import com.example.exem.model.SessionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessionTypeService {
    Page<SessionType> findAll(Pageable pageable);

}
