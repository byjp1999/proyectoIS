package com.mifiesta.eventos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EventosController
 */
@RestController
public class EventosController {
    @GetMapping(value = "/mi_prueba")
    public String getMethodName()
    {
        return "holas";
    }
}