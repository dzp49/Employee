package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "EmployeeModel")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer employeeId;

    String firstName;
    String lastName;
}
