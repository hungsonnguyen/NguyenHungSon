package com.example.ss6_tao_ung_dung_blog.repository;

import com.example.ss6_tao_ung_dung_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    List<Blog> findByNameContaining(String name);
    Blog findById(int id);





}
