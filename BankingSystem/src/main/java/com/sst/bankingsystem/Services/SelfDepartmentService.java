package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Department;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfDepartmentService implements DepartmentService {
    private final Map<Long, Department> departments = new HashMap<>();
    private long departmentIdSequence = 1;

    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<>(departments.values());
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departments.get(departmentId);
    }

    @Override
    public Department createDepartment(Department department) {
        department.setDepartmentId(departmentIdSequence++);
        departments.put(department.getDepartmentId(), department);
        return department;
    }

    @Override
    public Department updateDepartment(Department department) {
        departments.put(department.getDepartmentId(), department);
        return department;
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departments.remove(departmentId);
    }
}