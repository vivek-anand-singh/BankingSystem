package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Department;
import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department getDepartmentById(Long departmentId);

    Department createDepartment(Department department);

    Department updateDepartment(Department department);

    void deleteDepartment(Long departmentId);
}