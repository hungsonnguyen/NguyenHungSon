package repository;

import model.Category;
import model.ColorProduct;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
}
