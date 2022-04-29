package com.mifiesta.eventos.controllers;

import java.util.List;

import com.mifiesta.eventos.models.Evento;
import com.mifiesta.eventos.service.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/evento")
public class EventoRestController {
    
    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> findAll()
    {
        return eventoService.findAll();
    }

    @PostMapping
    public Evento save(@RequestBody Evento evento)
    {
        return eventoService.save(evento);
    }

    @GetMapping("/{id}")
    public Evento findById(@PathVariable Long id)
    {
        return eventoService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id)
    {
        eventoService.delete(id);
        return "Evento eliminado";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Evento evento)
    {
        Evento oldEvento = eventoService.update(id, evento);
        if(oldEvento != null)
        {
            return "Evento modificado";
        }
        return "Evento no encontrado";
    }
}
