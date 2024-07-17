package com.spring.crud.gestionDePersonal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.crud.gestionDePersonal.DTOS.EstadoDTO;
import com.spring.crud.gestionDePersonal.model.Estado;

public interface IEstadoRepository extends JpaRepository<Estado, Long> {

    
    public List<Estado> findByNombre(String nombre);
    public List<Estado> findByPaisId(Long paisId);
    @Query("SELECT new com.spring.crud.gestionDePersonal.DTOS.EstadoDTO(u.id, u.nombre) FROM Estado u where u.pais.id=:paisId")
    public List<EstadoDTO> findByPaisIdWithLimitedFields(@Param("paisId") Long paisId);
    
        

    
        

}
