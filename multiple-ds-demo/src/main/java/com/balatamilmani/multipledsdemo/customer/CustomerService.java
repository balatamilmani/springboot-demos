package com.balatamilmani.multipledsdemo.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getCustomers();
    Optional<Customer> getCustomerById(Long id);
    Optional<Customer> addCustomer(Customer customer);

}
