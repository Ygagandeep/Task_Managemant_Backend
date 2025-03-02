package com.taskManagement.dto;


import com.taskManagement.enums.UserRole;
import lombok.Data;

import java.util.PrimitiveIterator;

@Data
public class AuthenticationResponse {

    private String jwt;

    private Long userId;

    private UserRole userRole;

}
