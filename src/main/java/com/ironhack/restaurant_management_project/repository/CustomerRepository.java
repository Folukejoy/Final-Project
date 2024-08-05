package com.ironhack.restaurant_management_project.repository;

import com.ironhack.restaurant_management_project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


