package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.PrescriptionService;
import com.example.quanliphongkham.domain.entity.Prescription;
import com.example.quanliphongkham.persistence.repository.PrescriptionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    private final PrescriptionRepository repository;
    public PrescriptionServiceImpl(PrescriptionRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Prescription> findAll() {
        return repository.findAll();
    }
}
