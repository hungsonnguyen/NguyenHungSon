package com.example.casestudy.repository.employee;

import com.example.casestudy.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
