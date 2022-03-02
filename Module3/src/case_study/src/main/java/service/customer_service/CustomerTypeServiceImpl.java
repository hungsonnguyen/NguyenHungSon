package service.customer_service;

import model.customer.CustomerType;
import repository.impl.customer.CustomerTypeRepository;
import repository.impl.customer.CustomerTypeRepositoryImpl;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
