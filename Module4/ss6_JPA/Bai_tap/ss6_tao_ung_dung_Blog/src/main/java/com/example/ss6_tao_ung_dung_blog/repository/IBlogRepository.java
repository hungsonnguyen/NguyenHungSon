package com.example.ss6_tao_ung_dung_blog.repository;

import com.example.ss6_tao_ung_dung_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = "select * from Blog where name=:keyword",nativeQuery = true)
    List<Blog> searchByName(@Param("keyword")String keyword);


}
