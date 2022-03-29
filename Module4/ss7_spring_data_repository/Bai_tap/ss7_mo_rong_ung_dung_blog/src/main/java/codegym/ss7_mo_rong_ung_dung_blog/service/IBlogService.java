package codegym.ss7_mo_rong_ung_dung_blog.service;

import codegym.ss7_mo_rong_ung_dung_blog.model.Blog;

import java.util.List;

public interface IBlogService {
    Blog findById(int id);
    List<Blog> findAll();

    List<Blog> searchByName(String name);

    Blog findOne(Integer id);

    Blog save(Blog blog);

    List<Blog> save(List<Blog> customers);

    boolean exists(Long id);

    List<Blog> findAll(List<Long> ids);

    long count();

    void delete(int id);

    void delete(Blog blog);

    void delete(List<Blog> blogList);

    void deleteAll();

}
