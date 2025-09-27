package com.example.healthrecord.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Routine_Detail",
       uniqueConstraints = @UniqueConstraint(columnNames={"routine_id","rdDayOrder"}))
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class RoutineDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rdId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="routine_id", nullable=false)
    private Routine routine;

    @Column(nullable=false)
    private int rdDayOrder;   // 1~cycle

    @Column(nullable=false, length=100)
    private String rdPlan;    // ex) 하체, 가슴+삼두
}
