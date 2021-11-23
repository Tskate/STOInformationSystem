package com.example.stoinformationsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String district;
    private String streetName;
    private String buildingNumb;
    private String town;

    public Location(String district, String streetName, String buildingNumb, String town) {
        this.district = district;
        this.streetName = streetName;
        this.buildingNumb = buildingNumb;
        this.town = town;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNumb() {
        return buildingNumb;
    }

    public void setBuildingNumb(String buildingNumb) {
        this.buildingNumb = buildingNumb;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
