package com.mifiesta.eventos.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Admin {

    @Id
    private long id;

    @Field
    private String fullname;

    @Field
    private long ci;

    @Field
    private int typeperson;

    @Field
    private String email;

    @Field
    private String empresa;

    @Field
    private String usuario;

    @Field
    private String passwort;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public int getTypeperson() {
        return typeperson;
    }

    public void setTypeperson(int typeperson) {
        this.typeperson = typeperson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    
}
