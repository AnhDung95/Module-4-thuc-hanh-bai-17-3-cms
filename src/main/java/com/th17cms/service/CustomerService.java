package com.th17cms.service;

import com.th17cms.IGeneralService;
import com.th17cms.model.Customer;
import com.th17cms.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer>findAll(){
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customer>findById(Long id){
        return customerRepository.findById(id);
    }
    @Override
    public void save(Customer customer){
        customerRepository.save(customer);
    }
    @Override
    public void remove(Long id){
        customerRepository.deleteById(id);
    }
}
