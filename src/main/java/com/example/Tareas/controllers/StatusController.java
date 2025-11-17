package com.example.Tareas.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String status() {
        return "OK ✅ API viva";
    }

    @GetMapping("/")
    public String home() {
        return "Bienvenido a Task Manager API — prueba /status";
    }

}