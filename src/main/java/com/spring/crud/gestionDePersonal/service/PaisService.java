package com.spring.crud.gestionDePersonal.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.spring.crud.gestionDePersonal.model.Pais;
import com.spring.crud.gestionDePersonal.repository.IPaisRepository;

@Service
public class PaisService implements IPaisRepository {
@Autowired
private IPaisRepository paisRepository;

@Override
public void flush() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'flush'");
}

@Override
public <S extends Pais> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
}

@Override
public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
}

@Override
public void deleteAllInBatch(Iterable<Pais> entities) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
}

@Override
public void deleteAllByIdInBatch(Iterable<Long> ids) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAllByIdInBatch'");
}

@Override
public void deleteAllInBatch() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
}

@Override
public Pais getOne(Long id) {
    
    return paisRepository.getReferenceById(id);
}

@Override
public Pais getById(Long id) {
    return paisRepository.getReferenceById(id);
    
}

@Override
public Pais getReferenceById(Long id) {
    return paisRepository.getReferenceById(id);
}

@Override
public <S extends Pais> List<S> findAll(Example<S> example) {
    return paisRepository.findAll(example);
}

@Override
public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
    return paisRepository.findAll(example, sort);
}

@Override
public List<Pais> findAll() {
    return paisRepository.findAll();
}

@Override
public List<Pais> findAllById(Iterable<Long> ids) {
    
    return paisRepository.findAllById(ids);
}

@Override
public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
}

@Override
public long count() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'count'");
}

@Override
public void delete(Pais entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
}

@Override
public void deleteAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
}

@Override
public void deleteAll(Iterable<? extends Pais> entities) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
}

@Override
public void deleteAllById(Iterable<? extends Long> ids) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
}

@Override
public void deleteById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
}

@Override
public boolean existsById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'existsById'");
}

@Override
public Optional<Pais> findById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
}

@Override
public <S extends Pais> S save(S entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
}

@Override
public List<Pais> findAll(Sort sort) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
}

@Override
public Page<Pais> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
}

@Override
public <S extends Pais> long count(Example<S> example) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'count'");
}

@Override
public <S extends Pais> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exists'");
}

@Override
public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
}

@Override
public <S extends Pais, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findBy'");
}

@Override
public <S extends Pais> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findOne'");
}

}
