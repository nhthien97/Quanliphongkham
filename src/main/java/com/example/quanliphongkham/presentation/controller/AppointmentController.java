package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {
    private final AppointmentService service;
    public AppointmentController(AppointmentService service) { this.service = service; }

    @GetMapping("/appointments")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Appointment");
        return "appointments/list";
    }
}
