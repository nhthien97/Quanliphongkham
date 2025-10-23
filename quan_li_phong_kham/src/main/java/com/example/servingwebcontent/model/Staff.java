package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Staff {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String fullName;
    @NotBlank private String role;
    private String specialty;
    private String shift;
    private String phone;
    @Email private String email;

    public Staff() {}
    public Staff(Long id, String fullName, String role, String specialty, String shift, String phone, String email) {
        this.id=id; this.fullName=fullName; this.role=role; this.specialty=specialty; this.shift=shift; this.phone=phone; this.email=email;
    }

    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getFullName(){return fullName;} public void setFullName(String fullName){this.fullName=fullName;}
    public String getRole(){return role;} public void setRole(String role){this.role=role;}
    public String getSpecialty(){return specialty;} public void setSpecialty(String specialty){this.specialty=specialty;}
    public String getShift(){return shift;} public void setShift(String shift){this.shift=shift;}
    public String getPhone(){return phone;} public void setPhone(String phone){this.phone=phone;}
    public String getEmail(){return email;} public void setEmail(String email){this.email=email;}
}
