package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.MedicineService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicineController {
    private final MedicineService service;
    public MedicineController(MedicineService service) { this.service = service; }

    @GetMapping("/medicines")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Medicine");
        return "medicines/list";
    }
}
