package com.example.servingwebcontent.repository;
import com.example.servingwebcontent.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
