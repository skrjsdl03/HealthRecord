package com.example.healthrecord.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="equipment_id", nullable=false)
    private Equipment equipment;

    @Column(nullable=false)
    private LocalDateTime workoutDate;

    @Column(columnDefinition="TEXT")
    private String workoutMemo;
}
