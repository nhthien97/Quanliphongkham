package com.example.quanliphongkham.persistence.repository;
import com.example.quanliphongkham.domain.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DoctorRepository extends JpaRepository<Doctor, Long> {}
