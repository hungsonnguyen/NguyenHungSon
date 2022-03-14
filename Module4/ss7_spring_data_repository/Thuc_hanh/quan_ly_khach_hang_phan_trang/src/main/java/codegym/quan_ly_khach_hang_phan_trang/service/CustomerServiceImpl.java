package codegym.ss7_thuc_hanh_quan_ly_tinh.service;

import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Customer;
import codegym.ss7_thuc_hanh_quan_ly_tinh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Page<Customer> findByFirstName(String name, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(name,pageable);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }
}
