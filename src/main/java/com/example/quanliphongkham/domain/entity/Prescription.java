package com.example.quanliphongkham.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Prescription {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne private Appointment appointment;
    @ManyToOne private Medicine medicine;
    private int quantity;
    private String notes;
}
