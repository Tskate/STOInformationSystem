package com.example.stoinformationsystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class AuthorizedUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String login;
    private String password;
    private String name;

    @OneToMany
    @JoinColumn(name="written_reviews")
    private List<Review> reviews;

    public  AuthorizedUser(){

    }

    public AuthorizedUser(Integer id, String login, String password, String name, List<Review> reviews) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.reviews = reviews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
