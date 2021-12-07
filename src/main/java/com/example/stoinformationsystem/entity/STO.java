package com.example.stoinformationsystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class STO {
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

//    public Schedule getWeekendShedule() {
//        return weekendShedule;
//    }
//
//    public void setWeekendShedule(Schedule weekendShedule) {
//        this.weekendShedule = weekendShedule;
//    }

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
}
