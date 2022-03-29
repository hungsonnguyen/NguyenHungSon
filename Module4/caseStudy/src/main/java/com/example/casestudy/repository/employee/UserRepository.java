package com.example.casestudy.repository.employee;

import com.example.casestudy.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String userName);
}
