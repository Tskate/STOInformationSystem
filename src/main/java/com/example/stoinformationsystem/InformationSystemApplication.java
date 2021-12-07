package com.example.stoinformationsystem;

import com.example.stoinformationsystem.entity.*;
import com.example.stoinformationsystem.repository.*;
//import com.example.stoinformationsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.AbstractList;
import java.util.List;

@SpringBootApplication
public class InformationSystemApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(InformationSystemApplication.class, args);
    }

    @Autowired
    ScheduleRepository sheduleRepository;

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ServiceInfoRepository serviceInfoRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    STORepository stoRepository;

    @Override
    public void run(String... args) throws Exception {
//        LocalTime time1 = LocalTime.of(8, 30);
//        LocalTime time1_1 = LocalTime.of(19, 0);
//        LocalTime time0 = LocalTime.of(13, 30);
//        LocalTime time0_1 = LocalTime.of(14, 30);
//        Schedule schedule = new Schedule(time1, time1_1, time0, time0_1, time1, time1_1);
//
//
//        ServiceInfo serviceInfo = new ServiceInfo("Mazda, Toyota, Audi",  "Технічний огляд, Комп'ютерна діагностика, Заміна масла", "Автомийка");
//
//        Review review = new Review();
//        List<Review> reviews = List.of(review);
//
//        Location location = new Location("Київська", "Нагорна", "47", "Київ" );
//        List<Location> locations = List.of(location);
//
//        STO sto1 = new STO("Автоцентр", "Професійне технічне обслуговування", schedule, serviceInfo, locations, reviews, 1);
//
//        stoRepository.save(sto1);

//          STO sto = stoRepository.getById(6);
//          Rating rat = new Rating();
//          Review rev = new Review();
//          rev.setRating(rat);
//          reviewRepository.save(rev);
//          reviewRepository.save(rev);
//          List<Review> revs = List.of(rev);
//          sto.setReviews(revs);     ????????

//        Review rev2 = reviewRepository.getById(5);
//        Rating rat2 = new Rating();
//        rev2.setRating(rat2);

    }
}
