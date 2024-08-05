package com.ironhack.restaurant_management_project.repository;

import com.ironhack.restaurant_management_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}