package com.example.servingwebcontent.model;

import jakarta.persistence.*;

@Entity
public class Asset {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    @ManyToOne private Department department;
    private Integer quantity;
    private String status;

    public Asset() {}
    public Asset(Long id, String name, String type, Department department, Integer quantity, String status) {
        this.id=id; this.name=name; this.type=type; this.department=department; this.quantity=quantity; this.status=status;
    }

    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getName(){return name;} public void setName(String name){this.name=name;}
    public String getType(){return type;} public void setType(String type){this.type=type;}
    public Department getDepartment(){return department;} public void setDepartment(Department department){this.department=department;}
    public Integer getQuantity(){return quantity;} public void setQuantity(Integer quantity){this.quantity=quantity;}
    public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
}
