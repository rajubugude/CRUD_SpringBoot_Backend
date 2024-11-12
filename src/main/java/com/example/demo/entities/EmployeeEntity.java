//package com.example.demo.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Generated;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDate;
//
//@Entity
//@Table(name="employee")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class EmployeeEntity {
//    @Id // id becomes primary key by this
//    @GeneratedValue(strategy = GenerationType.AUTO) //automatically generates id of employee
//    private long id;
//    private String name;
//    private LocalDate dateOfJoining;
//    private boolean isActive;
//}
