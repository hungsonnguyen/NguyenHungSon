package com.example.text_exam_module.repository;

import com.example.text_exam_module.model.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionReopository extends JpaRepository<Session,Integer> {
    Page<Session> findAllByNameContaining(String name, Pageable pageable);

}
