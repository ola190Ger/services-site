package com.art.tbl.dto;/*
@author OlgaGereliuk
@class LocationDTO
@Date 19.09.2021
@Time 16:21
*/

import java.time.LocalDateTime;
import java.util.List;

public class LocationDTO {
    private String id;
    private String country;
    private String region;
    private String city;
    private List<String> contractorId;
    private String description;

    public LocationDTO() {
    }

    public LocationDTO(String id, String country, String region, String city, List<String> contractorId, String description) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.city = city;
        this.contractorId = contractorId;
        this.description = description;
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

    public void setCountry(String country) {
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

    public List<String> getContractorId() {
        return contractorId;
    }

    public void setContractorId(List<String> contractorId) {
        this.contractorId = contractorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
