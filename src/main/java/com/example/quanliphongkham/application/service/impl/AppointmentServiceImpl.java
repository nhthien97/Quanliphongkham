package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.AppointmentService;
import com.example.quanliphongkham.domain.entity.Appointment;
import com.example.quanliphongkham.persistence.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository repository;
    public AppointmentServiceImpl(AppointmentRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Appointment> findAll() {
        return repository.findAll();
    }
}
