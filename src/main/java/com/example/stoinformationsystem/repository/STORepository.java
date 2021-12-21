package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.STO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface STORepository extends JpaRepository<STO, Integer> {
    List<STO> findByName(String name);
//    String getTotalBenefits();


}