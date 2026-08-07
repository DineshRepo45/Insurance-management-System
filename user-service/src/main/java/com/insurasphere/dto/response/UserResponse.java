package com.insurasphere.dto.response;

import com.insurasphere.enums.Role;
import com.insurasphere.enums.UserStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserResponse {

    private  Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String mobileNumber;

    private Role role;

    private UserStatus status;

    private LocalDateTime createdAt;
}
