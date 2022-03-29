package com.example.exem.repository;


import com.example.exem.model.TranSaction;
import org.hibernate.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<TranSaction,Integer> {
    Page<TranSaction> findAllByCodeContaining(String name, Pageable pageable);

}
