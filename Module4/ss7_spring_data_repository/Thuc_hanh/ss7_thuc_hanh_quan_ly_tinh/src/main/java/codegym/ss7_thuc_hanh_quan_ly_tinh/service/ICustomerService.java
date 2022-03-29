package codegym.ss7_thuc_hanh_quan_ly_tinh.service;

import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Customer;
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
