package com.mifiesta.eventos.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Evento {

    @Id
    private Long id;

    @Field
    private String name;

    @Field
    private String description;

    @Field
    private int typeEntry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTypeEntry() {
        return typeEntry;
    }

    public void setTypeEntry(int typeEntry) {
        this.typeEntry = typeEntry;
    }
    
}
