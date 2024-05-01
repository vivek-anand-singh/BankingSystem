package com.sst.bankingsystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    private int transactionId;
    private Long accountNumber;
    private Double amount;
    private TransactionType transactionType;
    private Date date;

    public void setTransactionDate(Date date) {
    }
}
