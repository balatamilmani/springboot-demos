package com.balatamilmani.multipledsdemo;

import com.balatamilmani.multipledsdemo.customer.Customer;
import com.balatamilmani.multipledsdemo.customer.CustomerRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataInitializer {

    private final CustomerRepository customerRepository;

    public DataInitializer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional("customerTransactionManager")
    public Long createCustomer(){
        Customer customer = new Customer("Balamurugan", "Tamil");
        customerRepository.save(customer);
        return customer.getId();
    }

}
