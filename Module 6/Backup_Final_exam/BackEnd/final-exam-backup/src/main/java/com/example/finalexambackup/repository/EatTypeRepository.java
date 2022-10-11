package com.example.finalexambackup.repository;

import com.example.finalexambackup.model.EatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EatTypeRepository extends JpaRepository<EatType,Long> {
}
