package com.example.ss6_tao_ung_dung_blog.service;

import com.example.ss6_tao_ung_dung_blog.model.Blog;
import com.example.ss6_tao_ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public List<Blog> searchByName(String name) {
        return iBlogRepository.findByNameContaining(name);
    }

    @Override
    public Blog findOne(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public Blog save(Blog blog) {
        return iBlogRepository.save(blog);
    }

    @Override
    public List<Blog> save(List<Blog> customers) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<Blog> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public void delete(Blog blog) {

    }

    @Override
    public void delete(List<Blog> blogList) {

    }

    @Override
    public void deleteAll() {

    }
}
