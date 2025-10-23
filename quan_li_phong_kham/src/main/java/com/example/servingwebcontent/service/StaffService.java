package com.example.servingwebcontent.service;
import com.example.servingwebcontent.exception.NotFoundException;
import com.example.servingwebcontent.model.Staff;
import com.example.servingwebcontent.repository.StaffRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StaffService {
    private final StaffRepository repo;
    public StaffService(StaffRepository repo){ this.repo = repo; }
    public List<Staff> list(){ return repo.findAll(); }
    public Staff get(Long id){ return repo.findById(id).orElseThrow(() -> new NotFoundException("Không tìm thấy nhân sự")); }
    public Staff save(Staff s){ return repo.save(s); }
    public void delete(Long id){ repo.deleteById(id); }
}
