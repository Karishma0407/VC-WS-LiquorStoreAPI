package dev.webservices;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import dev.webservices.liquorstoreapi.Entity.Customer;

public class CustomerServiceTest {

    @Test
    public void testFindById(Long id){

        Long customerId = 1;
        Customer newCustomer = new Customer();
        newCustomer.setId(customerId);
        newCustomer.setFirstName("Karishma");
        newCustomer.setLastName("Patel");
        newCustomer.setAge(22);
        newCustomer.setEmail("patel@gamil.com");
        newCustomer.setAddress("Montreal");
        when(customerRepository.findById(customerId)).thenReturn(Optional.of(newCustomer));

        Customer customer = customerService.getCustomerById(customerId);

        // Assert
        assertEquals("Karishma", customer.getFirstName());
        assertEquals("Patel", customer.getLastName());

    }
    
}