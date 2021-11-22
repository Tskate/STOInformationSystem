package com.example.stoinformationsystem.entity;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="rating")//, referencedColumnName = "id"
    private Rating rating;

    private Integer idSTO;

    public Review(){

    }

    public Review(Integer id, String text, Rating rating, Integer idSTO) {
        this.id = id;
        this.text = text;
        this.rating = rating;
        this.idSTO = idSTO;
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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Integer getIdSTO() {
        return idSTO;
    }

    public void setIdSTO(Integer idSTO) {
        this.idSTO = idSTO;
    }
}

