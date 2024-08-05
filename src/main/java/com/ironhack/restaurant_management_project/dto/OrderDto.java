package com.ironhack.restaurant_management_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long id;
    private Long customerId;
    private Long menuItemId;
    private int quantity;
    private double totalPrice;
    private String status;
}