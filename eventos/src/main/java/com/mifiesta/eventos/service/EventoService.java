package com.mifiesta.eventos.service;

import java.util.List;

import com.mifiesta.eventos.models.Evento;

public interface EventoService {
    Evento save(Evento evento);

    Evento update(Long id, Evento evento);
    
    void delete(Long id);
    
    Evento findById(Long id);

    List<Evento> findAll();
}
