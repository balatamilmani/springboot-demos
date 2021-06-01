package com.balatamilmani.multipledsdemo.controller;

import com.balatamilmani.multipledsdemo.customer.Customer;
import com.balatamilmani.multipledsdemo.customer.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        Optional<Customer> customerOptional = customerService.getCustomerById(id);
        return customerOptional.get();
    }

    @PostMapping(value = "/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        Optional<Customer> customerOptional = customerService.addCustomer(customer);
        return customerOptional.get();
    }
}
