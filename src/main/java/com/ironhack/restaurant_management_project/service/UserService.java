package com.ironhack.restaurant_management_project.service;

import com.ironhack.restaurant_management_project.model.User;
import org.springframework.context.annotation.Role;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}