package com.example.stoinformationsystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String brands;
    private String listOfServices;
    private String additionalServices;

    public ServiceInfo(){

    }

    public ServiceInfo(String brands, String listOfServices, String additionalServices) {
        this.brands = brands;
        this.listOfServices = listOfServices;
        this.additionalServices = additionalServices;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public STO getSto() {
//        return sto;
//    }
//
//    public void setSto(STO sto) {
//        this.sto = sto;
//    }


    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getListOfServices() {
        return listOfServices;
    }

    public void setListOfServices(String listOfServices) {
        this.listOfServices = listOfServices;
    }

    public String getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }
}

