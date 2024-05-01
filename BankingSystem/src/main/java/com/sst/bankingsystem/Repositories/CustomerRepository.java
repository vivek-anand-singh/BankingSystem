package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Override
    Customer save(Customer customer);

    @Override
    Optional<Customer> findById(Long aLong);

    @Override
    List<Customer> findAll();

    @Override
    void deleteById(Long aLong);
}