package com.ironhack.restaurant_management_project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "restaurant_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long menuItemId;
    private int quantity;
    private double totalPrice;
    private String status;

    public Order(Long customerId, Long menuItemId, int quantity, double totalPrice, String status) {
        this.customerId = customerId;
        this.menuItemId = menuItemId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
    }
}