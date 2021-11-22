package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}