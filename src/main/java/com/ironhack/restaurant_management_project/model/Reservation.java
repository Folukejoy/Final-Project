package com.ironhack.restaurant_management_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private int tableNumber;
    private LocalDateTime reservationTime;

    public Reservation(Long customerId, int tableNumber, LocalDateTime reservationTime) {
        this.customerId = customerId;
        this.tableNumber = tableNumber;
        this.reservationTime = reservationTime;
    }
}