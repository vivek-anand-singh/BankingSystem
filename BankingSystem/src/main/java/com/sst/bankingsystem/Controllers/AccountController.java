package com.sst.bankingsystem.Controllers;

import com.sst.bankingsystem.Models.Account;
import com.sst.bankingsystem.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{accountNumber}")
    public Account getAccountByNumber(@PathVariable("accountNumber") Long accountNumber) {
        return accountService.getAccountByNumber(accountNumber);
    }

    @PostMapping("")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PutMapping("")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{accountNumber}")
    public void deleteAccount(@PathVariable("accountNumber") Long accountNumber) {
        accountService.deleteAccount(accountNumber);
    }
}