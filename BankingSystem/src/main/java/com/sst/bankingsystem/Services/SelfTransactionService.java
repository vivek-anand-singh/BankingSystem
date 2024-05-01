package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfTransactionService implements TransactionService {
    private final Map<Integer, Transaction> transactions = new HashMap<>();
    private int transactionIdSequence = 1;

    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions.values());
    }

    @Override
    public Transaction getTransactionById(int transactionId) {
        return transactions.get(transactionId);
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        transaction.setTransactionId(transactionIdSequence++);
        transaction.setTransactionDate(new Date()); // Set transaction date to current date
        transactions.put(transaction.getTransactionId(), transaction);
        return transaction;
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        if (transactions.containsKey(transaction.getTransactionId())) {
            transaction.setTransactionDate(new Date()); // Update transaction date to current date
            transactions.put(transaction.getTransactionId(), transaction);
            return transaction;
        }
        return null; // Transaction not found
    }

    @Override
    public void deleteTransaction(int transactionId) {
        transactions.remove(transactionId);
    }

    @Override
    public List<Transaction> getTransactionsByAccountNumber(Long accountNumber) {
        List<Transaction> accountTransactions = new ArrayList<>();
        for (Transaction transaction : transactions.values()) {
            if (transaction.getAccountNumber().equals(accountNumber)) {
                accountTransactions.add(transaction);
            }
        }
        return accountTransactions;
    }
}