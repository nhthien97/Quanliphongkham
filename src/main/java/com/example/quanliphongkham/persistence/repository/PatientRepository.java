package com.example.quanliphongkham.persistence.repository;
import com.example.quanliphongkham.domain.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<Patient, Long> {}
