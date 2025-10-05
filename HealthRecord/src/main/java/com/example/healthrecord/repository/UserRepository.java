package com.example.healthrecord.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthrecord.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLoginId(String loginId);
}
