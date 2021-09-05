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
    private String county;
    private String region;
    private String city;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Location() {
    }

    public Location(String county, String region, String city, String description) {
        this.county = county;
        this.region = region;
        this.city = city;
        this.description = description;
    }

    public Location(String id, String county, String region, String city, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.county = county;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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
                ", county='" + county + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
