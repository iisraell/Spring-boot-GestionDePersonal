package com.spring.crud.gestionDePersonal.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.gestionDePersonal.DTOS.EstadoDTO;
import com.spring.crud.gestionDePersonal.model.Estado;
import com.spring.crud.gestionDePersonal.model.Pais;
import com.spring.crud.gestionDePersonal.service.EstadoService;
import com.spring.crud.gestionDePersonal.service.PaisService;

@RestController
@RequestMapping("/estados/")

public class EstadoApi {

    @Autowired
    private EstadoService estadoService;

    /*
    @GetMapping
    private ResponseEntity<List<Estado>> getAllEstados(){
        var estados =  estadoService.findAll();
        return ResponseEntity.ok(estados);
    }
    */

    @GetMapping("{nombre}")
    private ResponseEntity<List<Estado>> getEstadosPorNombre(@PathVariable("nombre")  String nombre){
        var estados =  estadoService.findByNombre(nombre);
        return ResponseEntity.ok(estados);
    }

    @GetMapping("/idPais/{idPais}")
    private ResponseEntity<List<Estado>> getEstadosPorIdPais(@PathVariable("idPais")  Long idPais){
        var estados =  estadoService.findByPaisId(idPais);
        return ResponseEntity.ok(estados);
    }

    @GetMapping("estadosSimples/idPais/{idPais}")
    private ResponseEntity<List<EstadoDTO>> getEstadosSimplificadosPorIdPais(@PathVariable("idPais")  Long idPais){
        var estados =  estadoService.findByPaisIdWithLimitedFields(idPais);
        return ResponseEntity.ok(estados);
    }

    

}
