package com.example.healthrecord.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "User")  // DB 테이블명 그대로
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // user_id

    @Column(name = "login_id", length = 20, nullable = false, unique = true)
    private String loginId;

    @Column(name = "user_pwd", length = 255, nullable = false)
    private String userPwd;

    @Column(name = "user_name", length = 10, nullable = false)
    private String userName;

    @Column(name = "user_nickname", length = 20)
    private String userNickname;

    @Column(name = "user_phone", length = 15, nullable = false)
    private String userPhone;

    private Integer userAge;    
    private Double userHeight;  
    private Double userWeight;  

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    private void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}