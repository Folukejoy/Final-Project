package com.ironhack.restaurant_management_project.service;

import com.ironhack.restaurant_management_project.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    List<Restaurant> getAllRestaurants();
    Optional<Restaurant> getRestaurantById(Long id);
    Restaurant saveRestaurant(Restaurant restaurant);
    void deleteRestaurant(Long id);
    List<Restaurant> findRestaurantsByName(String name);
}