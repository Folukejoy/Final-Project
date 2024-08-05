package com.ironhack.restaurant_management_project.repository;

import com.ironhack.restaurant_management_project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}


