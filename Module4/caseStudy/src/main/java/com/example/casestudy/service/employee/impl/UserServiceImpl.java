package com.example.casestudy.service.employee.impl;

import com.example.casestudy.model.user.User;
import com.example.casestudy.repository.employee.UserRepository;
import com.example.casestudy.service.employee.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
