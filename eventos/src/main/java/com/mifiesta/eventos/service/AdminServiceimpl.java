package com.mifiesta.eventos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mifiesta.eventos.models.Admin;
import com.mifiesta.eventos.repository.AdminRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceimpl implements AdminService {


    @Autowired
    private AdminRepository repo;

    @Override
    public Admin save(Admin admin) {
        
        return repo.save(admin);
    }
    @Override
    public void delete(Long id) {
        Optional<Admin> admin = repo.findById(id);
        if(admin.isPresent())
            repo.delete(admin.get());   
    }
    @Override
    public Admin findById(Long id) {
        Optional<Admin> admin = repo.findById(id);
        if(admin.isPresent())
            return admin.get();
        return null;
    }
    @Override
    public List<Admin> findAll() {
        List<Admin> returnList = new ArrayList<>();
        repo.findAll().forEach(obj -> returnList.add(obj));
        return returnList;
    }

    @Override
    public Admin update(Long id, Admin admin) {
        Optional<Admin> optional = repo.findById(id);

        if(optional.isPresent())
        {
            optional.get().setFullname(admin.getFullname());
            optional.get().setCi(admin.getCi());
            optional.get().setTypeperson(admin.getTypeperson());
            optional.get().setEmail(admin.getEmail());
            optional.get().setEmpresa(admin.getEmpresa());
            optional.get().setUsuario(admin.getUsuario());
            optional.get().setPasswort(admin.getPasswort());
            repo.save(optional.get());
            return optional.get();
        }

        return null;
    }


    
    
}
