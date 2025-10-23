package com.example.quanliphongkham.persistence.repository;
import com.example.quanliphongkham.domain.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {}
