package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.DoctorService;
import com.example.quanliphongkham.domain.entity.Doctor;
import com.example.quanliphongkham.persistence.repository.DoctorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository repository;
    public DoctorServiceImpl(DoctorRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Doctor> findAll() {
        return repository.findAll();
    }
}
