package com.codegym.demo_c0821g1_2.repository;

import com.codegym.demo_c0821g1_2.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
