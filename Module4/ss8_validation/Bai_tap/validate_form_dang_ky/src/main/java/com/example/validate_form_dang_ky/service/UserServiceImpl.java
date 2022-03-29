package com.example.validate_form_dang_ky.service;


import com.example.validate_form_dang_ky.model.User;
import com.example.validate_form_dang_ky.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User update(User user) {
       return userRepository.save(user);
    }
}
