package com.ironhack.restaurant_management_project.service;

import com.ironhack.restaurant_management_project.model.Role;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    Role getRole(String roleName);
    List<Role> getRoles();
    void deleteRole(Long roleId);
}