package com.insurasphere.controller;

import com.insurasphere.dto.request.UserRegistrationDto;
import com.insurasphere.dto.response.UserResponse;
import com.insurasphere.service.interfaces.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
@PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(
            @Valid @RequestBody UserRegistrationDto request
            ){
        UserResponse reponse = userService.registerUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(reponse);
    }
}
