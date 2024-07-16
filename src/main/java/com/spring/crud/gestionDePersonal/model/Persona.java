package com.spring.crud.gestionDePersonal.model;

import java.io.Serializable;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="personas")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre; 
    private String apellido;
    private int edad; 

    
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
    
    
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    public Persona( ) {        
        
    }

    public Persona( String nombre, String apellido, int edad, Pais pais, Estado estado) {        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }




}
