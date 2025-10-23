package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.DepartmentService;
import com.example.quanliphongkham.domain.entity.Department;
import com.example.quanliphongkham.persistence.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository repository;
    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Department> findAll() {
        return repository.findAll();
    }
}
