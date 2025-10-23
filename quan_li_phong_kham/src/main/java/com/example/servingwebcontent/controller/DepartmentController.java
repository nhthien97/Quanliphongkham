package com.example.servingwebcontent.controller;
import com.example.servingwebcontent.model.Asset;
import com.example.servingwebcontent.model.Department;
import com.example.servingwebcontent.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService service;
    public DepartmentController(DepartmentService service){ this.service=service; }

    @GetMapping
    public String list(Model m){
        m.addAttribute("active","departments");
        m.addAttribute("departments", service.departments());
        m.addAttribute("assets", service.assets());
        return "department/list";
    }

    @GetMapping("/new")
    public String newDepartment(Model m){ m.addAttribute("active","departments"); m.addAttribute("department", new Department()); return "department/form"; }

    @PostMapping
    public String saveDepartment(@ModelAttribute Department d){ service.saveDepartment(d); return "redirect:/departments"; }

    @GetMapping("/assets/new")
    public String newAsset(Model m){ m.addAttribute("active","departments"); m.addAttribute("asset", new Asset()); m.addAttribute("departments", service.departments()); return "department/form"; }

    @PostMapping("/assets")
    public String saveAsset(@ModelAttribute Asset a){ service.saveAsset(a); return "redirect:/departments"; }

    @PostMapping("/{id}/delete") public String deleteDep(@PathVariable Long id){ service.deleteDepartment(id); return "redirect:/departments"; }
}
