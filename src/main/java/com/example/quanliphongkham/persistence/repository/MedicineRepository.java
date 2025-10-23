package com.example.quanliphongkham.persistence.repository;
import com.example.quanliphongkham.domain.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicineRepository extends JpaRepository<Medicine, Long> {}
