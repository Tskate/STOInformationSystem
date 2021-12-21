package com.example.stoinformationsystem.entity;

public class ReviewIter {
    private Integer id;
    private String text;
    private Integer price;
    private Integer quality;
    private Integer service;

    public ReviewIter(Integer id, String text, Integer price, Integer quality, Integer service) {
        this.id = id;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }


    @Override
    public String toString() {
        return  text +  "\t"+
                "(price:" + price +
                ", quality:" + quality +
                ", service:" + service +
                ')';
    }
}
