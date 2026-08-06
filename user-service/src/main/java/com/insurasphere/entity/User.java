package com.insurasphere.entity;

import com.insurasphere.enums.Role;
import com.insurasphere.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_service")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name",nullable = false,length = 50)
    private String firstName;

    @Column(name = "last_name",nullable = false,length = 50)
    private String lastName;

    @Column(nullable = false,unique = true,length = 100)
    private String email;

    @Column(name = "mobile_number",unique = true,nullable = false,length = 15)
    private String mobileNumber;

    @Column(nullable = false)

    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

    @Column(name = "created_at",nullable = false)
    private LocalDateTime cretaedAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate(){
        this.cretaedAt=LocalDateTime.now();
        this.updatedAt=LocalDateTime.now();
        this.status=UserStatus.ACTIVE;
        this.role=Role.CUSTOMER;
    }

    @PreUpdate
    public void onUpdate(){
       this.updatedAt=LocalDateTime.now();
    }
}


