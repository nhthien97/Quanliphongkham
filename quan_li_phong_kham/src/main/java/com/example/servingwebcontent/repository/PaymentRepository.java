package com.example.servingwebcontent.repository;
import com.example.servingwebcontent.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaymentRepository extends JpaRepository<Payment, Long> {}
