package com.example.servingwebcontent.controller;
import com.example.servingwebcontent.model.Staff;
import com.example.servingwebcontent.service.StaffService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private final StaffService service;
    public StaffController(StaffService service){ this.service=service; }

    @GetMapping public String list(Model m){ m.addAttribute("active","staff"); m.addAttribute("staffs", service.list()); return "staff/list"; }
    @GetMapping("/new") public String form(Model m){ m.addAttribute("active","staff"); m.addAttribute("staff", new Staff()); return "staff/form"; }
    @PostMapping public String save(@ModelAttribute @Valid Staff s, BindingResult br, Model m){ if(br.hasErrors()){ m.addAttribute("active","staff"); return "staff/form"; } service.save(s); return "redirect:/staff"; }
    @GetMapping("/{id}/edit") public String edit(@PathVariable Long id, Model m){ m.addAttribute("active","staff"); m.addAttribute("staff", service.get(id)); return "staff/form"; }
    @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ service.delete(id); return "redirect:/staff"; }
}
