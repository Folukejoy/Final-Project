package com.ironhack.restaurant_management_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
    private Long id;
    private Long customerId;
    private int tableNumber;
    private LocalDateTime reservationTime;
}