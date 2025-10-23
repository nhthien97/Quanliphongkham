package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.MedicineService;
import com.example.quanliphongkham.domain.entity.Medicine;
import com.example.quanliphongkham.persistence.repository.MedicineRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MedicineServiceImpl implements MedicineService {
    private final MedicineRepository repository;
    public MedicineServiceImpl(MedicineRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Medicine> findAll() {
        return repository.findAll();
    }
}
