package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.Position;
import com.example.casestudy.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    Page<User> findAll(Pageable pageable);

}
