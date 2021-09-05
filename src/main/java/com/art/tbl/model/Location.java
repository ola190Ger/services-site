package com.art.tbl.model;
/*
@author ArtemFrunze
@class Location
@date 29.08.2021
@time 11:58 
*/

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Location {
    private String id;
    private String country;
    private String region;
    private String city;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Location() {
    }

    public Location(String country, String region, String city, String description) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.description = description;
    }

    public Location(String id, String country, String region, String city, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.city = city;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void r(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
