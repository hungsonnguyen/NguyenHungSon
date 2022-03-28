package com.example.text_exam_module.service.impl;

import com.example.text_exam_module.model.SessionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SessionTypeService {
    Page<SessionType> findAll(Pageable pageable);

}
