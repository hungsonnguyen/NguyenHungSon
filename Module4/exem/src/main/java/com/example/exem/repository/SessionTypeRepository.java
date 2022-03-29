package com.example.exem.repository;


import com.example.exem.model.SessionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionTypeRepository extends JpaRepository<SessionType,Integer> {
}
