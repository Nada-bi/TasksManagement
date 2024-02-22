package com.firsttry.Login.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public ResponseEntity<String> signUp() {
        // Implement signup logic (e.g., save user to database)
        return ResponseEntity.ok("Signup successful");
}
    public ResponseEntity<String> login() {
        // Implement login logic (e.g., verify credentials)
        return ResponseEntity.ok("Login successful");
    }
}