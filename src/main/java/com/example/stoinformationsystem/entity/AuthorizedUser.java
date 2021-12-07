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

    private  AuthorizedUser(AuthorizedUserBuilder authorizedUserBuilder){
        super();
        this.login = authorizedUserBuilder.login;
        this.password = authorizedUserBuilder.password;
        this.name = authorizedUserBuilder.name;
        this.reviews = authorizedUserBuilder.reviews;
    }

    public static class AuthorizedUserBuilder {
        private String login;
        private String password;
        private String name;
        private List<Review> reviews;

        public AuthorizedUserBuilder(String login, String password, String name) {
            this.login = login;
            this.password = password;
            this.name = name;
        }
        public AuthorizedUserBuilder reviews(List<Review> reviews){
            this.reviews = reviews;
            return this;
        }
        public AuthorizedUser build() {
            AuthorizedUser user = new AuthorizedUser(this);
            return user;
        }
    }
    @Override
    public String toString() {
        return "User [id=" + id + ",\nlogin=" + login + ",\npasword=" + password + ",\nname=" + name + ",\nrewiews=" + reviews + "]";
    }

//    public AuthorizedUser(String login, String password, String name, List<Review> reviews) {
//        this.login = login;
//        this.password = password;
//        this.name = name;
//        this.reviews = reviews;
//    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }
}
