package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccountByNumber(Long accountNumber);

    Account createAccount(Account account);

    Account updateAccount(Account account);

    void deleteAccount(Long accountNumber);
}