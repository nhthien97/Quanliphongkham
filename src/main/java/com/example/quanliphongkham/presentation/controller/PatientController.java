package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
    private final PatientService service;
    public PatientController(PatientService service) { this.service = service; }

    @GetMapping("/patients")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Patient");
        return "patients/list";
    }
}
