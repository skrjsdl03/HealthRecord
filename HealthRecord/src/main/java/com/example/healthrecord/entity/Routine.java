package com.example.healthrecord.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routineId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Column(nullable=false, length=20)
    private String routineName; // ex) 4분할 루틴

    @Column(nullable=false)
    private int routineCycle;

    @Column(nullable=false)
    private LocalDate routineStart;
}
