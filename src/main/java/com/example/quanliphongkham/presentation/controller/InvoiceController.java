package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.InvoiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
    private final InvoiceService service;
    public InvoiceController(InvoiceService service) { this.service = service; }

    @GetMapping("/invoices")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Invoice");
        return "invoices/list";
    }
}
