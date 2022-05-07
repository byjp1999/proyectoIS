package com.mifiesta.eventos.controllers;

import java.util.List;

import com.mifiesta.eventos.models.Admin;
import com.mifiesta.eventos.service.AdminService;

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
@RequestMapping(value= "/SRS/eventos/pruebasadmin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Admin> findAll()
    {
        return adminService.findAll();
    }
    @PostMapping
    public Admin save(@RequestBody Admin admin)
    {
        return adminService.save(admin);
    }
    @GetMapping("/{id}")
    public Admin findById(@PathVariable Long id)
    {
        return adminService.findById(id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id)
    {
        adminService.delete(id);
        return "persona eliminado";
    }
    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Admin admin)
    {
        Admin oldadmin = adminService.update(id, admin);
        if(oldadmin != null)
        {
            return "persona modificado";
        }
        return "persona no encontrado";
    }

}
