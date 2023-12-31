package dev.webservices.liquorstoreapi.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.webservices.liquorstoreapi.Entity.Customer;
import dev.webservices.liquorstoreapi.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    @Override
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public void update(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()){
            customerRepository.save(customer.get());
        }
    }

    @Override
    public void delete(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()){
            customerRepository.delete(customer.get());
        }
    }
    
}
