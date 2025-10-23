package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
    private final DepartmentService service;
    public DepartmentController(DepartmentService service) { this.service = service; }

    @GetMapping("/departments")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Department");
        return "departments/list";
    }
}
