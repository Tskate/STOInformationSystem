package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.Rating;
import com.example.stoinformationsystem.entity.Review;
import com.example.stoinformationsystem.entity.STO;
import org.junit.runner.RunWith;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.stoinformationsystem.service.STOMethods;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class STORepositoryTest {

    @Autowired
    STORepository stoRepository;

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    RatingRepository ratingRepository;

    @Test
    public void findByName() throws Exception{
       List<STO> sto_list = stoRepository.findByName("Автоцентр");

       assertThat(sto_list).hasSize(1);
       assertThat(sto_list.get(0).getId()).isEqualTo(1);
    }

    @Test
    public void deleteReview() throws Exception {
        Review rev = reviewRepository.getById(11);
        reviewRepository.delete(rev);

        List<Rating> rating = ratingRepository.findAll();
        assertThat(rating).hasSize(0);
    }


}