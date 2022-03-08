package codegym.service.impl;

import codegym.model.Customer;
import codegym.repository.HibernateCustomerRepository;

import codegym.service.CutomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CutomerService {

    @Autowired
    private HibernateCustomerRepository hibernateCustomerRepository;

    @Override
    public void addCustomer(Customer customer) {
        hibernateCustomerRepository.addCustomer(customer);
    }

    @Override
    public List<Customer> findAll() {
        return hibernateCustomerRepository.findAll();
    }

    @Override
    public Customer findOne(Long id) {
        return hibernateCustomerRepository.findOne(id);
    }

    @Override
    public Customer save(Customer customer) {
        return hibernateCustomerRepository.save(customer);
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return hibernateCustomerRepository.save(customers);
    }

    @Override
    public boolean exists(Long id) {
        return hibernateCustomerRepository.exists(id);
    }

    @Override
    public List<Customer> findAll(List<Long> ids) {
        return hibernateCustomerRepository.findAll();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {
        hibernateCustomerRepository.delete(id);
    }

    @Override
    public void delete(Customer customer) {
        hibernateCustomerRepository.delete(customer);
    }

    @Override
    public void delete(List<Customer> customers) {
        hibernateCustomerRepository.delete(customers);
    }

    @Override
    public void deleteAll() {
        hibernateCustomerRepository.deleteAll();
    }
}
