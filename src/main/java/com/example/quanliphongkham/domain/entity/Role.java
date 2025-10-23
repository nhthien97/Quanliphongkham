package com.example.quanliphongkham.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    // ✅ Constructor mặc định
    public Role() {}

    public Role(String name) {
        this.name = name;
    }

    // ✅ Getter & Setter
    public Long getId() {
        return id;
    }

    public String getName() {           // 👈 Đây là hàm đang thiếu
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
