package com.example.servingwebcontent.controller;
import com.example.servingwebcontent.model.Appointment;
import com.example.servingwebcontent.service.AppointmentService;
import com.example.servingwebcontent.service.PatientService;
import com.example.servingwebcontent.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService service;
    private final PatientService patients;
    private final StaffService staff;
    public AppointmentController(AppointmentService s, PatientService p, StaffService st){ this.service=s; this.patients=p; this.staff=st; }

    @GetMapping public String list(Model m){ m.addAttribute("active","appointments"); m.addAttribute("appointments", service.list()); return "appointment/list"; }

    @GetMapping("/new")
    public String form(Model m){
        m.addAttribute("active","appointments");
        m.addAttribute("appointment", new Appointment());
        m.addAttribute("patients", patients.list(null));
        m.addAttribute("doctors", staff.list());
        return "appointment/form";
    }

    @PostMapping public String save(@ModelAttribute Appointment a){ service.save(a); return "redirect:/appointments"; }
    @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ service.delete(id); return "redirect:/appointments"; }
}
