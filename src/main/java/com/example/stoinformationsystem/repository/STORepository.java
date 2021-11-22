package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.STO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STORepository extends JpaRepository<STO, Integer> {
}