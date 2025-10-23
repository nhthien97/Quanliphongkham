package com.example.servingwebcontent.service;
import com.example.servingwebcontent.model.Payment;
import com.example.servingwebcontent.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PaymentService {
    private final PaymentRepository repo;
    public PaymentService(PaymentRepository repo){ this.repo = repo; }
    public List<Payment> list(){ return repo.findAll(); }
    public Payment save(Payment p){ return repo.save(p); }
    public void delete(Long id){ repo.deleteById(id); }
}
