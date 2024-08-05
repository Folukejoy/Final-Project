package com.ironhack.restaurant_management_project.repository;

import com.ironhack.restaurant_management_project.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findByName(String name);

    List<Restaurant> findByNameContainingIgnoreCase(String name);

}
