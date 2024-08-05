package com.ironhack.restaurant_management_project.service;

import com.ironhack.restaurant_management_project.model.MenuItem;

import java.util.List;
import java.util.Optional;

public interface MenuItemService {
    List<MenuItem> getAllMenuItems();

    List<MenuItem> getAllMenuItems(String name);

    Optional<MenuItem> getMenuItemById(Long id);
    MenuItem createMenuItem(MenuItem menuItem);
    MenuItem updateMenuItem(Long id, MenuItem menuItem);

    MenuItem saveMenuItem(MenuItem menuItem);

    void deleteMenuItem(Long id);
    List<MenuItem> findMenuItemsByName(String name);
}
