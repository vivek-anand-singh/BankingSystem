package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Override
    Account save(Account account);
}