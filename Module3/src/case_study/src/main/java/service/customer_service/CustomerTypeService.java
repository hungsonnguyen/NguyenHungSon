package service.customer_service;

import model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
}
