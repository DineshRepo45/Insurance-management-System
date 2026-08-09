package com.insurasphere.mapper;

import com.insurasphere.dto.request.UserRegistrationDto;
import com.insurasphere.dto.response.UserResponse;
import com.insurasphere.entity.User;

public class UserMapper {
    private UserMapper(){

    }
    public static User toEntity(UserRegistrationDto request){
        User user = new User();

        user.setFirstName(request.getFirstName());

        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setMobileNumber(request.getMobileNumber());
        user.setPassword(request.getPassword());

        return user;
    }
    public static UserResponse toResponse(User user){
        return  UserResponse.builder()
                .id((long) user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .mobileNumber(user.getMobileNumber())
                .role(user.getRole())
                .status(user.getStatus())
                .createdAt(user.getCretaedAt())
                .build();
    }
}
