package com.example.text_exam_module.service.impl;

import com.example.text_exam_module.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

}
