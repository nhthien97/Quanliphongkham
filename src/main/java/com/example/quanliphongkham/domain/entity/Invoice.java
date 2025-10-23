package com.example.quanliphongkham.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Invoice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne private Appointment appointment;
    private double amount;
    private LocalDateTime createdAt;
    private String status; // PAID / UNPAID
}
