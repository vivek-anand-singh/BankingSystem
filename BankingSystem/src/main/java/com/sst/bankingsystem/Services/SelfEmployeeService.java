package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Department;
import com.sst.bankingsystem.Models.Employee;
import com.sst.bankingsystem.Models.Role;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfEmployeeService implements EmployeeService {
    private final Map<Long, Employee> employees = new HashMap<>();
    private long employeeIdSequence = 1;

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employees.get(employeeId);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // Add business logic here (e.g., validate employee data)
        // For simplicity, assume all employee data is valid

        employee.setEmployeeId(employeeIdSequence++);
        employees.put(employee.getEmployeeId(), employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        // Add business logic here (e.g., validate employee data)
        // For simplicity, assume all employee data is valid

        employees.put(employee.getEmployeeId(), employee);
        return employee;
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employees.remove(employeeId);
    }

    // Additional method to simulate fetching employees by department
    public List<Employee> getEmployeesByDepartment(Department department) {
        List<Employee> departmentEmployees = new ArrayList<>();
        for (Employee employee : employees.values()) {
            if (employee.getDepartment().equals(department)) {
                departmentEmployees.add(employee);
            }
        }
        return departmentEmployees;
    }

    // Additional method to simulate fetching employees by role
    public List<Employee> getEmployeesByRole(Role role) {
        List<Employee> roleEmployees = new ArrayList<>();
        for (Employee employee : employees.values()) {
            if (employee.getRole().equals(role)) {
                roleEmployees.add(employee);
            }
        }
        return roleEmployees;
    }
}