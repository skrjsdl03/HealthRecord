package com.example.healthrecord.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthrecord.entity.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
