package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Exceptions.CustomerNotFoundException;
import com.sst.bankingsystem.Exceptions.NoCustomersFoundException;
import com.sst.bankingsystem.Models.Customer;
import com.sst.bankingsystem.Repositories.CustomerRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class SelfCustomerService implements CustomerService {
    private CustomerRepository customerRepository;
    public SelfCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty()) {
            throw new CustomerNotFoundException("Wrong Customer id passed", customerId);
        }
        customerRepository.deleteById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty()) {
            throw new NoCustomersFoundException("No customers found");
        }
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        if (customer.isEmpty()) {
            throw new CustomerNotFoundException("Wrong Customer id passed", customerId);
        }
        return customer.get();
    }
}
