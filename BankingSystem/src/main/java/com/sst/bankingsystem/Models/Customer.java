package com.sst.bankingsystem.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String address;
    private String email;
    private LocalDate dateOfJoining;
    // getters and setters
    @OneToOne
    private Account account;

    @PrePersist
    protected void onCreate() {
        dateOfJoining = LocalDate.now();
    }
}