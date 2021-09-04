package com.art.tbl.model;
/*
@author ArtemFrunze
@class Contractor
@date 30.08.2021
@time 20:21 
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class Contractor {
    private String id;
    private String name;
    private String phone;
    private LocalDate birthday;
    private String description;
    private List<Category> category;
    private Location location;
    private TypeContractor typeContractor;
    private List<ProvidedService> providedServices;
    private List<SocialNetwork> socialNetworks;
    private List<Image> images;
    private List<Reviews> reviews;
    private LocalDate createdDate;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Contractor() {
    }

    public Contractor(String name, String phone, LocalDate birthday, String description, List<Category> category,
                      Location location, TypeContractor typeContractor, List<ProvidedService> providedServices,
                      List<SocialNetwork> socialNetworks, List<Image> images, List<Reviews> reviews,
                      LocalDate createdDate, User user) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.category = category;
        this.location = location;
        this.typeContractor = typeContractor;
        this.providedServices = providedServices;
        this.socialNetworks = socialNetworks;
        this.images = images;
        this.reviews = reviews;
        this.createdDate = createdDate;
        this.user = user;
    }

    public Contractor(String id, String name, String phone, LocalDate birthday, String description,
                      List<Category> category, Location location, TypeContractor typeContractor,
                      List<ProvidedService> providedServices, List<SocialNetwork> socialNetworks,
                      List<Image> images, List<Reviews> reviews, LocalDate createdDate, User user,
                      LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.category = category;
        this.location = location;
        this.typeContractor = typeContractor;
        this.providedServices = providedServices;
        this.socialNetworks = socialNetworks;
        this.images = images;
        this.reviews = reviews;
        this.createdDate = createdDate;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
