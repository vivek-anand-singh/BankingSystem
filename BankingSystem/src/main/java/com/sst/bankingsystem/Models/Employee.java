package com.sst.bankingsystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private Long employeeId;
    private String name;
    @ManyToOne
    private Role role;
    @ManyToOne
    private Department department;
    private Long departmentId;
    private String email;
}
