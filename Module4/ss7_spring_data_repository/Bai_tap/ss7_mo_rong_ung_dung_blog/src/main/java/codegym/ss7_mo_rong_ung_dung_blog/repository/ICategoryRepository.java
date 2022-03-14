package codegym.ss7_mo_rong_ung_dung_blog.repository;

import codegym.ss7_mo_rong_ung_dung_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
