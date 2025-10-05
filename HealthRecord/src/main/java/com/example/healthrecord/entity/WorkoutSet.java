package com.example.healthrecord.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Workout_Set")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class WorkoutSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="workout_id", nullable=false)
    private Workout workout;

    @Column(nullable=false)
    private int wsOrder;

    @Column(nullable=false)
    private int wsReps;

    @Column(nullable=false)
    private double wsWeight;

    @Column(nullable=false, length=5)
    private String wsDropset;   // 'Y' or 'N'
}
