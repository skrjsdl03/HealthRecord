package com.example.healthrecord.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipmentId;

    @Column(nullable=false, length=100)
    private String equipmentName;

    @Column(nullable=false, length=10)
    private String equipmentParts;
}
