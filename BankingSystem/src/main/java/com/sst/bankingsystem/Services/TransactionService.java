package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Transaction;
import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions();

    Transaction getTransactionById(int transactionId);

    Transaction createTransaction(Transaction transaction);

    Transaction updateTransaction(Transaction transaction);

    void deleteTransaction(int transactionId);

    List<Transaction> getTransactionsByAccountNumber(Long accountNumber);
}