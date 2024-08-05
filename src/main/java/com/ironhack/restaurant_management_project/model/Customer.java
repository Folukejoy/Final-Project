package com.ironhack.restaurant_management_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phonenumber;
    private String address;

    public Customer(String name, String email, String phonenumber, String address) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.address = address;
    }
}