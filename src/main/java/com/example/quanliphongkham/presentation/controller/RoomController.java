package com.example.quanliphongkham.presentation.controller;

import com.example.quanliphongkham.application.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {
    private final RoomService service;
    public RoomController(RoomService service) { this.service = service; }

    @GetMapping("/rooms")
    public String list(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("title", "Room");
        return "rooms/list";
    }
}
