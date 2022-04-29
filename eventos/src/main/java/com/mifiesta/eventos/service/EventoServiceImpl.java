package com.mifiesta.eventos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mifiesta.eventos.models.Evento;
import com.mifiesta.eventos.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository repository;

    @Override
    public Evento save(Evento evento) {
        return repository.save(evento);
    }

    @Override
    public void delete(Long id) {
        Optional<Evento> evento = repository.findById(id);
        if(evento.isPresent())
            repository.delete(evento.get());
    }

    @Override
    public Evento findById(Long id) {
        Optional<Evento> evento = repository.findById(id);
        if(evento.isPresent())
            return evento.get();
        return null;
    }

    @Override
    public List<Evento> findAll() {
        List<Evento> returnList = new ArrayList<>();
        repository.findAll().forEach(obj -> returnList.add(obj));
        return returnList;
    }

    @Override
    public Evento update(Long id, Evento evento) {
        
        Optional<Evento> optional = repository.findById(id);

        if(optional.isPresent())
        {
            optional.get().setName(evento.getName());
            optional.get().setDescription(evento.getDescription());
            optional.get().setTypeEntry(evento.getTypeEntry());
            repository.save(optional.get());
            return optional.get();
        }

        return null;
    }
    
}
