package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Branch;
import com.sst.bankingsystem.Models.Employee;

import java.util.List;

public interface BranchService {
    List<Branch> getAllBranches();

    Branch getBranchById(Long branchId);

    Branch createBranch(Branch branch);

    Branch updateBranch(Branch branch);

    void deleteBranch(Long branchId);

    List<Employee> getEmployeesByBranchId(Long branchId);

}
