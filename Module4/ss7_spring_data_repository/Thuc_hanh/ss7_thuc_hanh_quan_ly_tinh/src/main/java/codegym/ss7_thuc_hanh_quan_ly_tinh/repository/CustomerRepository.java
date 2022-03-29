package codegym.ss7_thuc_hanh_quan_ly_tinh.repository;

import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findById(int id);
    Page<Customer>findAllByFirstNameContaining(String name, Pageable pageable);


    void deleteById(int id);

}
