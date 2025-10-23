package com.example.servingwebcontent.controller;
import com.example.servingwebcontent.model.Payment;
import com.example.servingwebcontent.service.PatientService;
import com.example.servingwebcontent.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;
    private final PatientService patients;
    public PaymentController(PaymentService s, PatientService p){ this.service=s; this.patients=p; }

    @GetMapping public String list(Model m){ m.addAttribute("active","payments"); m.addAttribute("payments", service.list()); return "payment/list"; }

    @GetMapping("/new")
    public String form(Model m){
        m.addAttribute("active","payments");
        m.addAttribute("payment", new Payment());
        m.addAttribute("patients", patients.list(null));
        return "payment/form";
    }

    @PostMapping public String save(@ModelAttribute Payment p){ service.save(p); return "redirect:/payments"; }
    @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ service.delete(id); return "redirect:/payments"; }
}
