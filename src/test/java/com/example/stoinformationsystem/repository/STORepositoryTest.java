package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.*;
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
       List<STO> sto_list = stoRepository.findByName("CarService");

       assertThat(sto_list).hasSize(1);
       assertThat(sto_list.get(0).getId()).isEqualTo(15);
    }

    @Test
    public void deleteReview() throws Exception {
        Review rev = reviewRepository.getById(13);
        reviewRepository.delete(rev);

        List<Rating> rating = ratingRepository.findAll();
        assertThat(rating).hasSize(0);
    }

    @Test
    public void IteratorTest() throws Exception {
        STO sto =  stoRepository.getById(15);
        Iterator iterator = sto.getIterator();

        System.out.println(sto.getName() + " list reviews: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

//    @Test
//    public void getTotalBenefits(){
//        STORepository sto = new OnlyService(new STOImpl());
//        assertThat(sto.getTotalBenefits()).isEqualTo("Particular qualities: Only Service, without tire fitting.");
//
//    }

}