package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.PatientService;
import com.example.quanliphongkham.domain.entity.Patient;
import com.example.quanliphongkham.persistence.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository repository;
    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Patient> findAll() {
        return repository.findAll();
    }
}
