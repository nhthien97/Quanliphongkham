package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank private String name;
    @Min(0) private Integer age;
    @NotBlank private String gender;
    private String status;
    @Column(unique = true) private String recordNo;

    public Patient() {}
    public Patient(Long id, String name, Integer age, String gender, String status, String recordNo) {
        this.id = id; this.name = name; this.age = age; this.gender = gender; this.status = status; this.recordNo = recordNo;
    }

    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getName(){return name;} public void setName(String name){this.name=name;}
    public Integer getAge(){return age;} public void setAge(Integer age){this.age=age;}
    public String getGender(){return gender;} public void setGender(String gender){this.gender=gender;}
    public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
    public String getRecordNo(){return recordNo;} public void setRecordNo(String recordNo){this.recordNo=recordNo;}
}
