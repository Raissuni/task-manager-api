package com.example.Tareas.controllers;

import com.example.Tareas.models.Tarea;
import com.example.Tareas.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaRepository tareaRepository;

    // ✅ Obtener todas las tareas
    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    // ✅ Obtener una tarea por ID
    @GetMapping("/{id}")
    public Optional<Tarea> getTareaById(@PathVariable Long id) {
        return tareaRepository.findById(id);
    }

    // ✅ Crear una nueva tarea
    @PostMapping
    public Tarea createTarea(@RequestBody Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    // ✅ Actualizar una tarea existente
    @PutMapping("/{id}")
    public Tarea updateTarea(@PathVariable Long id, @RequestBody Tarea tareaDetails) {
        Tarea tarea = tareaRepository.findById(id).orElseThrow();
        tarea.setTitulo(tareaDetails.getTitulo());
        tarea.setDescripcion(tareaDetails.getDescripcion());
        tarea.setCompletada(tareaDetails.getCompletada());
        return tareaRepository.save(tarea);
    }

    // ✅ Eliminar una tarea
    @DeleteMapping("/{id}")
    public void deleteTarea(@PathVariable Long id) {
        tareaRepository.deleteById(id);
    }
}
