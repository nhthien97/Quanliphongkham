package com.example.quanliphongkham.application.service.impl;
import com.example.quanliphongkham.application.service.InvoiceService;
import com.example.quanliphongkham.domain.entity.Invoice;
import com.example.quanliphongkham.persistence.repository.InvoiceRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository repository;
    public InvoiceServiceImpl(InvoiceRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Invoice> findAll() {
        return repository.findAll();
    }
}
