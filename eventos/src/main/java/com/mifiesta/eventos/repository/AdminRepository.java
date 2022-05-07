package com.mifiesta.eventos.repository;

import com.mifiesta.eventos.models.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository <Admin, Long>{

}
