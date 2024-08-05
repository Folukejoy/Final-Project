package com.ironhack.restaurant_management_project.repository;

import com.ironhack.restaurant_management_project.model.Reservation;
import com.ironhack.restaurant_management_project.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    static void save(Restaurant restaurant) {


    }
}


