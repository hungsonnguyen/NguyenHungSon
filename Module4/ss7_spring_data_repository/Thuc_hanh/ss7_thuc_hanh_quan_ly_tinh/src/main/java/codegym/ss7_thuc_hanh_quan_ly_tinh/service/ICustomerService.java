package codegym.ss7_thuc_hanh_quan_ly_tinh.service;

import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void remove(int id);
}
