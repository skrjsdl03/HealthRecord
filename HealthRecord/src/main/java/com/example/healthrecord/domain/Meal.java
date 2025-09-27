package com.example.healthrecord.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mealId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Column(nullable=false)
    private LocalDate mealDate;

    @Column(nullable=false, length=10)
    private String mealType;     // '아침','점심','저녁'

    @Column(nullable=false, length=100)
    private String mealName;

    @Column(nullable=false)
    private double mealCal;
}
