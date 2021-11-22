package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.ServiceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceInfoRepository extends JpaRepository<ServiceInfo, Integer> {

}