package codegym.service;

import codegym.model.Customer;

import java.util.List;

public interface IGeneralService {
    List<Customer> findAll();
    T findById(Long id);
    void  save(T t);
    void remove(Long id);

}
