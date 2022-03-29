package codegym.ss7_mo_rong_ung_dung_blog.service;
import codegym.ss7_mo_rong_ung_dung_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();
    Page<Category> findAll(Pageable pageable);

    Optional<Category> findById(int id);

    void save(Category category);

    void remove(int id);
}
