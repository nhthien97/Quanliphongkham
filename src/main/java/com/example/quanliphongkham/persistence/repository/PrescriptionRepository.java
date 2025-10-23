package com.example.quanliphongkham.persistence.repository;
import com.example.quanliphongkham.domain.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {}
