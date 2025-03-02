package com.taskManagement.services.auth;

import com.taskManagement.dto.SignupRequest;
import com.taskManagement.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
