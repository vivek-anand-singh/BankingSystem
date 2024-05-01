package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Save method
//    Employee save(Employee employee);
}