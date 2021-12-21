package com.example.stoinformationsystem.repository;

import com.example.stoinformationsystem.entity.ReviewIter;
import com.example.stoinformationsystem.entity.STO;
import com.example.stoinformationsystem.entity.STOIterator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class IteratorApplicationTest {

    public static void main(String[] args){
        ReviewIter rev1 = new ReviewIter(1, "Хороша якість обслуговування", 4, 5, 5);
        ReviewIter rev2 = new ReviewIter(2, "Все супер! Швидко та якісно!", 5, 5, 5);
        ReviewIter rev3 = new ReviewIter(3, "Ціна висока.", 2, 4, 3);
        List<ReviewIter> reviews = List.of(rev1, rev2, rev3);
        STOIterator sto = new STOIterator("CarService", "Швидко та надійно", reviews, 1);
        Iterator iterator = sto.getIterator();

        System.out.println(sto.getName() + " list reviews: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
