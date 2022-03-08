package codegym.service;


import codegym.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
