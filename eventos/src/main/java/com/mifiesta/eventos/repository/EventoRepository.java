package com.mifiesta.eventos.repository;

import com.mifiesta.eventos.models.Evento;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends MongoRepository <Evento, Long>{

}
