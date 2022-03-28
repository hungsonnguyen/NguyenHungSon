package com.example.text_exam_module.repository;

import com.example.text_exam_module.model.SessionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionTypeRepository extends JpaRepository<SessionType,Integer> {
}
