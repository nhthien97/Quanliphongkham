package com.example.servingwebcontent.controller;
import com.example.servingwebcontent.model.Patient;
import com.example.servingwebcontent.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/patients")
public class PatientController {
    private final PatientService service;
    public PatientController(PatientService service){ this.service = service; }

    @GetMapping
    public String list(@RequestParam(required=false) String q, Model m){
        m.addAttribute("active","patients");
        m.addAttribute("q", q==null? "" : q);
        m.addAttribute("patients", service.list(q));
        return "patient/list";
    }

    @GetMapping("/new")
    public String createForm(Model m){
        m.addAttribute("active","patients");
        m.addAttribute("patient", new Patient());
        return "patient/form";
    }

    @PostMapping
    public String save(@ModelAttribute @Valid Patient p, BindingResult br, Model m){
        if (br.hasErrors()){ m.addAttribute("active","patients"); return "patient/form"; }
        service.save(p); return "redirect:/patients";
    }

    @GetMapping("/{id}")
    public String view(@PathVariable Long id, Model m){
        m.addAttribute("active","patients");
        m.addAttribute("p", service.get(id));
        return "patient/view";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model m){
        m.addAttribute("active","patients");
        m.addAttribute("patient", service.get(id));
        return "patient/form";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id){ service.delete(id); return "redirect:/patients"; }
}
