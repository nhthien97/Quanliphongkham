package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false) private Patient patient;
    @ManyToOne(optional=false) private Staff doctor;
    private LocalDate date;
    private LocalTime time;
    private String reason;
    private String status;

    public Appointment() {}
    public Appointment(Long id, Patient patient, Staff doctor, LocalDate date, LocalTime time, String reason, String status) {
        this.id=id; this.patient=patient; this.doctor=doctor; this.date=date; this.time=time; this.reason=reason; this.status=status;
    }

    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public Patient getPatient(){return patient;} public void setPatient(Patient patient){this.patient=patient;}
    public Staff getDoctor(){return doctor;} public void setDoctor(Staff doctor){this.doctor=doctor;}
    public LocalDate getDate(){return date;} public void setDate(LocalDate date){this.date=date;}
    public LocalTime getTime(){return time;} public void setTime(LocalTime time){this.time=time;}
    public String getReason(){return reason;} public void setReason(String reason){this.reason=reason;}
    public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
}
