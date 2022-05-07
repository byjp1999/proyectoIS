package com.mifiesta.eventos.service;

import java.util.List;

import com.mifiesta.eventos.models.Admin;

public interface AdminService {

    Admin save(Admin admin);

    Admin update(Long id, Admin admin);

    void delete(Long id);

    Admin findById(Long id);

    List<Admin> findAll();

    List<Admin> findForType(int typeperson);

    
}
