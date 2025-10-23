package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false) private Patient patient;
    private LocalDate date;
    private Double amount;
    private String description;
    private String status;
    private String method;

    public Payment() {}
    public Payment(Long id, Patient patient, LocalDate date, Double amount, String description, String status, String method) {
        this.id=id; this.patient=patient; this.date=date; this.amount=amount; this.description=description; this.status=status; this.method=method;
    }

    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public Patient getPatient(){return patient;} public void setPatient(Patient patient){this.patient=patient;}
    public LocalDate getDate(){return date;} public void setDate(LocalDate date){this.date=date;}
    public Double getAmount(){return amount;} public void setAmount(Double amount){this.amount=amount;}
    public String getDescription(){return description;} public void setDescription(String description){this.description=description;}
    public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
    public String getMethod(){return method;} public void setMethod(String method){this.method=method;}
}
