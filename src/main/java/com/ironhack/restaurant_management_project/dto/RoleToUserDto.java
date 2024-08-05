package com.ironhack.restaurant_management_project.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleToUserDto {

    private Long id;

    private String name;
    private String username;
    private String password;


}
