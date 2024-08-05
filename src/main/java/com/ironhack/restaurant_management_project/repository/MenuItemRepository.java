package com.ironhack.restaurant_management_project.repository;


import com.ironhack.restaurant_management_project.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByNameContainingIgnoreCase(String name);

}


