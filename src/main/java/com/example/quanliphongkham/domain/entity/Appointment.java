package com.example.quanliphongkham.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private Patient patient;
    @ManyToOne private Doctor doctor;
    @ManyToOne private Room room;

    private LocalDateTime time;
    private String status; // BOOKED, DONE, CANCELED
}
