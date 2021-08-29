package com.company.model;
/*
@author ArtemFrunze
@class Location
@date 29.08.2021
@time 11:58 
*/

import java.time.LocalDateTime;
import java.util.Objects;

public class Location {
    private String id;
    private String county;
    private String region;
    private String city;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Location() {
    }

    public Location(String county, String region, String city) {
        this.county = county;
        this.region = region;
        this.city = city;
    }

    public Location(String id, String county, String region, String city, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.county = county;
        this.region = region;
        this.city = city;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return getId().equals(location.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", county='" + county + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
