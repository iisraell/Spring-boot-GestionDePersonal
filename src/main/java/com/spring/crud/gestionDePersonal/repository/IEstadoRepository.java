package com.spring.crud.gestionDePersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.gestionDePersonal.model.Estado;

public interface IEstadoRepository extends JpaRepository<Estado, Long> {

}
