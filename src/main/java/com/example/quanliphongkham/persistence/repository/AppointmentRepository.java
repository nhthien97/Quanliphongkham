package com.example.quanliphongkham.persistence.repository;
import com.example.quanliphongkham.domain.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {}
