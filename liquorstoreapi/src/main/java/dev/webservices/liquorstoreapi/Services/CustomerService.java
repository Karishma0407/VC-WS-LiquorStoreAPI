package dev.webservices.liquorstoreapi.Services;

import java.util.Optional;

import dev.webservices.liquorstoreapi.Entity.Customer;

public interface CustomerService {

    Customer save(Customer Customer);

    Optional<Customer> findById(Long id);

    Iterable<Customer> findAll();

    void update(Long id);

    void delete(Long id);
    
}
