package service.customer_service;

import model.customer.Customer;

import java.util.List;

public interface CustomerService {
    public Customer selectCustomerById(int id);
    public void insert(Customer customer);
    public List<Customer> selectCustomer(String name);
    public List<Customer> selectAllCustomer();
    public void delete(int id);
    public void edit(Customer customer);
}
