package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Branch;
import com.sst.bankingsystem.Models.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfBranchService implements BranchService {
    private final Map<Long, Branch> branches = new HashMap<>();
    private long branchIdSequence = 1;

    @Override
    public List<Branch> getAllBranches() {
        return new ArrayList<>(branches.values());
    }

    @Override
    public Branch getBranchById(Long branchId) {
        return branches.get(branchId);
    }

    @Override
    public Branch createBranch(Branch branch) {
        branch.setBranchId(branchIdSequence++);
        branches.put(branch.getBranchId(), branch);
        return branch;
    }

    @Override
    public Branch updateBranch(Branch branch) {
        branches.put(branch.getBranchId(), branch);
        return branch;
    }

    @Override
    public void deleteBranch(Long branchId) {
        branches.remove(branchId);
    }

    @Override
    public List<Employee> getEmployeesByBranchId(Long branchId) {
        return List.of();
    }
}