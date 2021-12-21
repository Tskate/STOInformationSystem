package com.example.stoinformationsystem.entity;

import com.example.stoinformationsystem.repository.Collection;
import com.example.stoinformationsystem.repository.Iterator;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="rating")//, referencedColumnName = "id"
    private Rating rating;

    private Integer idSTO;

    public Review(){

    }

    public Review(String text, Rating rating, Integer idSTO) {
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

