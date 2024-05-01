package com.sst.bankingsystem.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountNumber;
    private Long customerID;
    private Double balance;
    private AccountType accountType;
    private LocalDate dateOpened;

    @PrePersist
    public void prePersist(){
        dateOpened = LocalDate.now();
    }
}