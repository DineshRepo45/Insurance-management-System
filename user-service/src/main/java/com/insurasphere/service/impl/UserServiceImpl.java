package com.insurasphere.service.impl;

import com.insurasphere.dto.request.UserRegistrationDto;
import com.insurasphere.dto.response.UserResponse;
import com.insurasphere.repository.UserRepository;
import com.insurasphere.service.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse registerUser(UserRegistrationDto request) {
        return null;
    }

    @Override
    public UserResponse getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponse updateUser(Long id, UserRegistrationDto request) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
