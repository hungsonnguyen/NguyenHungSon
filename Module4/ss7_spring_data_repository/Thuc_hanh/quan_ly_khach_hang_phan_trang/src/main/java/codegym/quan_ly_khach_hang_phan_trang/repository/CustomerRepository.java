package codegym.quan_ly_khach_hang_phan_trang.repository;

import codegym.quan_ly_khach_hang_phan_trang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findById(int id);
    Page<Customer>findAllByFirstNameContaining(String name, Pageable pageable);


    void deleteById(int id);

}
