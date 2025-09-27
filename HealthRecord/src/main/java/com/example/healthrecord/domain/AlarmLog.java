package com.example.healthrecord.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Alarm_Log")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class AlarmLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="alarm_id", nullable=false)
    private Alarm alarm;

    @Column(nullable=false)
    private LocalDateTime alSentAt;

    @Column(nullable=false, length=10)
    private String alStatus;   // 'SUCCESS','FAIL'
}
