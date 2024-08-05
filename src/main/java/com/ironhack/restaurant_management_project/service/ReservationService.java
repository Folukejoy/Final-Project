package com.ironhack.restaurant_management_project.service;

import com.ironhack.restaurant_management_project.model.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Optional<Reservation> getReservationById(Long id);
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Long id, Reservation reservationDetails);
    void deleteReservation(Long id);
}