package codegym.quan_ly_khach_hang_phan_trang.service;

import codegym.quan_ly_khach_hang_phan_trang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findByFirstName(String name, Pageable pageable);
    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void remove(int id);
}
