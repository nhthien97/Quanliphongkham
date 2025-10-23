package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.PrescriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrescriptionController {
    private final PrescriptionService service;
    public PrescriptionController(PrescriptionService service) { this.service = service; }

    @GetMapping("/prescriptions")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Prescription");
        return "prescriptions/list";
    }
}
