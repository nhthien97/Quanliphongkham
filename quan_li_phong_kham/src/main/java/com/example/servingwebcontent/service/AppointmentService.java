package com.example.servingwebcontent.service;
import com.example.servingwebcontent.model.Appointment;
import com.example.servingwebcontent.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AppointmentService {
    private final AppointmentRepository repo;
    public AppointmentService(AppointmentRepository repo){ this.repo = repo; }
    public List<Appointment> list(){ return repo.findAll(); }
    public Appointment save(Appointment a){ return repo.save(a); }
    public void delete(Long id){ repo.deleteById(id); }
}
