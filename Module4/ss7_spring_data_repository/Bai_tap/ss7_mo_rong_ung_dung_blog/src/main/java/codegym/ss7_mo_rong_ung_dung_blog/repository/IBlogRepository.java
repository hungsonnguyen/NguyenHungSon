package codegym.ss7_mo_rong_ung_dung_blog.repository;

import codegym.ss7_mo_rong_ung_dung_blog.model.Blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog>findAll(Pageable pageable);

    Page<Blog>findAllByName(Pageable pageable,String name);
    List<Blog> findByNameContaining(String name);
    Blog findById(int id);





}
