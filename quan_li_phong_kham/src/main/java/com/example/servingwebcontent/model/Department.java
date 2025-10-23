package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String name;
    private String location;
    private boolean active;

    public Department() {}
    public Department(Long id, String name, String location, boolean active) {
        this.id=id; this.name=name; this.location=location; this.active=active;
    }

    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getName(){return name;} public void setName(String name){this.name=name;}
    public String getLocation(){return location;} public void setLocation(String location){this.location=location;}
    public boolean isActive(){return active;} public void setActive(boolean active){this.active=active;}
}
