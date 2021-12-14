package com.example.stoinformationsystem.entity;

import com.example.stoinformationsystem.repository.STORepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class TireFitting extends STODecorator{
    STORepository stoRepository;
    public TireFitting(STORepository stoRepository) {
        super();
        this.stoRepository = stoRepository;
    }

    public String getTotalBenefits(){
        return stoRepository.getTotalBenefits() + getTypeService();
    }
    public String getTypeService(){
        return "Only tire fitting.";
    }




    @Override
    public List<STO> findByName(String name) {
        return null;
    }

    @Override
    public List<STO> findAll() {
        return null;
    }

    @Override
    public List<STO> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<STO> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public <S extends STO> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends STO> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends STO> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<STO> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public STO getOne(Integer integer) {
        return null;
    }

    @Override
    public STO getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends STO> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends STO> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<STO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends STO> S save(S entity) {
        return null;
    }

    @Override
    public Optional<STO> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(STO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends STO> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends STO> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends STO> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends STO> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends STO> boolean exists(Example<S> example) {
        return false;
    }
}
