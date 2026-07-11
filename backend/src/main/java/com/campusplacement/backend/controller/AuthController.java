package com.campusplacement.backend.controller;

import com.campusplacement.backend.dto.LoginRequest;
import com.campusplacement.backend.dto.LoginResponse;
import com.campusplacement.backend.dto.RegisterRequest;
import com.campusplacement.backend.dto.RegisterResponse;
import com.campusplacement.backend.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public RegisterResponse register(
            @RequestBody RegisterRequest request) {

        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        return authService.login(request);
    }
}