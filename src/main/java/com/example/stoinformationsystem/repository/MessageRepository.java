package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
