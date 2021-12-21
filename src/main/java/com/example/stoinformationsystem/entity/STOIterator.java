package com.example.stoinformationsystem.entity;

import com.example.stoinformationsystem.repository.Collection;
import com.example.stoinformationsystem.repository.Iterator;

import javax.persistence.*;
import java.util.List;

public class STOIterator implements Collection {
    private Integer id;

    private String name;
    private String description;
    private List<ReviewIter> reviews;
    private Integer count;

    public class ReviewIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < reviews.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return reviews.get(index++);
        }
    }

    public STOIterator(){

    }

    public STOIterator(String name, String description,   List<ReviewIter> reviews, Integer count) {
        this.name = name;
        this.description = description;
        this.reviews = reviews;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }


    public List<ReviewIter> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewIter> reviews) {
        this.reviews = reviews;

    }

    public Integer getCount() {
        return count;
    }

    @Override
    public Iterator getIterator() {
        return new ReviewIterator();
    }
}
