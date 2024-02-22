package com.firsttry.Login.Controller;

import com.firsttry.Login.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signUp() {
        return authService.signUp();
    }

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return authService.login();
    }
}
