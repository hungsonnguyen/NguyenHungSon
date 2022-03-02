package service;

import model.Category;
import repository.CategoryRepository;
import repository.CategoryRepositoryImpl;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
   CategoryRepository categoryRepository = new CategoryRepositoryImpl();

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
