package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.AuthorizedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorizedUserRepository extends JpaRepository<AuthorizedUser, Integer> {

}