package dev.webservices.liquorstoreapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.webservices.liquorstoreapi.Entity.Customer;
import dev.webservices.liquorstoreapi.Services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Insert data
    //customer age should be greater than 18
    @PostMapping("/")
    public String save(@RequestBody Customer customer) {
        if (customer.getAge() >= 18) {
            customerService.save(customer);
            return "Successfully registered";
        }else{
            return "Application can not register";
        }
    }

    //Find customer details by Id
    @GetMapping("/find")
    public Customer getCustomer(@RequestParam Long id) {
        Customer customer = customerService.findById(id).get();
        customer.getId();
        System.out.println(customer.toString());
        return customer;
    }

    //Find all the customers
    @GetMapping("/")
    public Iterable<Customer> getAllCustomer(){
        Iterable<Customer> customer = customerService.findAll();
        customer.getClass();
        System.out.println(customer.toString());
        return customer;
    }

    //Delete customer details
    @DeleteMapping("/")
    public String delete(@RequestParam Long id) {
        customerService.delete(id);
        return "Successfully deleted the record";
    }

}
