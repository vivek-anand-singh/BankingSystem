package com.sst.bankingsystem.Services;
import com.sst.bankingsystem.Models.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Long id,Customer customer);
    void deleteCustomer(Long customerId);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long customerId);
}
