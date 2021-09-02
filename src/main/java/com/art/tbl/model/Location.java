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
}
