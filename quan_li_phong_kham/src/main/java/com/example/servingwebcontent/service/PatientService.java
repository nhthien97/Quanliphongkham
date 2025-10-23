package com.example.servingwebcontent.service;
import com.example.servingwebcontent.exception.NotFoundException;
import com.example.servingwebcontent.model.Patient;
import com.example.servingwebcontent.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PatientService {
    private final PatientRepository repo;
    public PatientService(PatientRepository repo){ this.repo = repo; }
    public List<Patient> list(String q) { return (q==null || q.isBlank()) ? repo.findAll() : repo.findByNameContainingIgnoreCase(q); }
    public Patient get(Long id){ return repo.findById(id).orElseThrow(() -> new NotFoundException("Không tìm thấy bệnh nhân")); }
    public Patient save(Patient p){ return repo.save(p); }
    public void delete(Long id){ repo.deleteById(id); }
}
