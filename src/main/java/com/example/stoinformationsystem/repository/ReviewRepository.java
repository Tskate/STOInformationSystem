package com.example.stoinformationsystem.repository;


import com.example.stoinformationsystem.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
//    Review void findById();

}