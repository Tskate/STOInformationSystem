//package com.example.stoinformationsystem.config;
//
//import com.example.stoinformationsystem.entity.Rating;
//import com.example.stoinformationsystem.entity.Review;
//import com.example.stoinformationsystem.repository.*;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
//import org.springframework.test.context.junit4.SpringRunner;
//
////@RunWith(SpringRunner.class)
//@Component
//public class FillingBD implements CommandLineRunner {
//    @Autowired
//    ScheduleRepository sheduleRepository;
//
//    @Autowired
//    ReviewRepository reviewRepository;
//
//    @Autowired
//    ServiceInfoRepository serviceInfoRepository;
//
//    @Autowired
//    LocationRepository locationRepository;
//
//    @Autowired
//    STORepository stoRepository;
//
//    @Override
//    public void run(String... args) throws Exception{
//        Review rev2 = reviewRepository.getById(5);
//        Rating rat2 = new Rating();
//        rev2.setRating(rat2);
//        reviewRepository.save(rev2);
//    }
//}
