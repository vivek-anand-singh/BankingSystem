package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    // Find branches by manager ID
    @Override
    Branch save(Branch branch);
}