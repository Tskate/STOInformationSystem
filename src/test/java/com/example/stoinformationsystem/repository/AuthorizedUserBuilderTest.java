package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.AuthorizedUser;
import com.example.stoinformationsystem.entity.Rating;
import com.example.stoinformationsystem.entity.Review;

import java.util.List;

public class AuthorizedUserBuilderTest {
    public static void main(String[] args) {
        Rating rat = new Rating(5, 4, 5);
        Review rev = new Review("Good", rat, 1);
        List<Review> revs = List.of(rev);
        AuthorizedUser user = new AuthorizedUser.AuthorizedUserBuilder("user123", "useruser", "USER").reviews(revs).build();
        System.out.println(user);
    }
}
