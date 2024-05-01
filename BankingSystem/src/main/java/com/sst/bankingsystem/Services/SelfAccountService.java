package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Account;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfAccountService implements AccountService {
    // Simulating in-memory storage
    private final Map<Long, Account> accounts = new HashMap<>();
    private long accountNumberSequence = 1;

    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Account getAccountByNumber(Long accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public Account createAccount(Account account) {
        account.setAccountNumber(accountNumberSequence++);
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    @Override
    public Account updateAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    @Override
    public void deleteAccount(Long accountNumber) {
        accounts.remove(accountNumber);
    }
}