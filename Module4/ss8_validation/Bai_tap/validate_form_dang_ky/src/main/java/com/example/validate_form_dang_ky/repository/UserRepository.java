package com.example.validate_form_dang_ky.repository;

import com.example.validate_form_dang_ky.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
