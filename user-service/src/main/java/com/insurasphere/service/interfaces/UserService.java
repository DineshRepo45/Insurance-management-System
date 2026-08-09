package com.insurasphere.service.interfaces;

import com.insurasphere.dto.request.UserRegistrationDto;
import com.insurasphere.dto.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse registerUser(UserRegistrationDto request);

    UserResponse getUserById(Long id);

    List<UserResponse> getAllUsers();

    UserResponse updateUser(Long id,UserRegistrationDto request);

    void deleteUser(Long id);
}
