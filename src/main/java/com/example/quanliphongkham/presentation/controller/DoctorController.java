package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {
    private final DoctorService service;
    public DoctorController(DoctorService service) { this.service = service; }

    @GetMapping("/doctors")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Doctor");
        return "doctors/list";
    }
}
