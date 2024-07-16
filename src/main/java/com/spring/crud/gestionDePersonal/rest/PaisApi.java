package com.spring.crud.gestionDePersonal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.gestionDePersonal.model.Pais;
import com.spring.crud.gestionDePersonal.service.PaisService;

//Servicio que retornara todos los paises existentes
@RestController
@RequestMapping("/pais/")
public class PaisApi {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises(){
        var paises =  paisService.findAll();

        

        return ResponseEntity.ok(paises);
    }

}
