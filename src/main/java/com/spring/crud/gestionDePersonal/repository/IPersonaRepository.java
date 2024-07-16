package com.spring.crud.gestionDePersonal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.crud.gestionDePersonal.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
