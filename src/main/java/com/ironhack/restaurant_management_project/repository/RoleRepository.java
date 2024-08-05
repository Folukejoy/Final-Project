package com.ironhack.restaurant_management_project.repository;

import com.ironhack.restaurant_management_project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}