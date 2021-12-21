package com.example.stoinformationsystem.entity;

import com.example.stoinformationsystem.repository.Collection;
import com.example.stoinformationsystem.repository.Iterator;
import com.example.stoinformationsystem.repository.STORepository;

import javax.persistence.*;
import java.util.List;

@Entity
public class STO implements Collection {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="weekdayShedule", referencedColumnName = "id")
    private Schedule weekdayShedule;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="serviceInfo_id", referencedColumnName = "id")
    private ServiceInfo serviceInfo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="locations_sto")
    private List<Location> location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="reviews_sto")
    private List<Review> reviews;


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

    private Integer count;


    public STO(){

    }

    public STO(String name, String description, Schedule weekdayShedule, ServiceInfo serviceInfo, List<Location> location, List<Review> reviews, Integer count) {
        this.name = name;
        this.description = description;
        this.weekdayShedule = weekdayShedule;
        this.serviceInfo = serviceInfo;
        this.location = location;
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

    public Schedule getWeekdayShedule() {
        return weekdayShedule;
    }

    public void setWeekdayShedule(Schedule weekdayShedule) {
        this.weekdayShedule = weekdayShedule;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
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
