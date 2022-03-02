package service.customer_service;

import model.customer.Customer;
import repository.impl.customer.CusotomerRepositoryImpl;
import repository.impl.customer.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private ICustomerRepository customerRepository = new CusotomerRepositoryImpl();

    @Override
    public Customer selectCustomerById(int id) {
        return customerRepository.selectCustomerById(id);
    }

    @Override
    public void insert(Customer customer) {
        customerRepository.insert(customer);
    }

    @Override
    public List<Customer> selectCustomer(String name) {

        return customerRepository.selectCustomer(name);
    }


    @Override
    public List<Customer> selectAllCustomer() {

        return  customerRepository.selectAllCustomer();
    }

    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

    @Override
    public void edit(Customer customer) {
        customerRepository.edit(customer);
    }
}
