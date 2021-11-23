package com.example.stoinformationsystem.entity;

import javax.persistence.*;

@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer price;
    private Integer quality;
    private Integer service;

    public Rating(){

    }

    public Rating(Integer price, Integer quality, Integer service) {
        this.price = price;
        this.quality = quality;
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuality() {
        return quality;
    }

    public Integer getService() {
        return service;
    }
}
