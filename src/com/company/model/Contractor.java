package com.company.model;
/*
@author ArtemFrunze
@class Contractor
@date 30.08.2021
@time 20:21 
*/

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Contractor {
    private String id;
    private  String name;
    private String phone;
    private Date birthday;
    private String description;
    private List<Category> category;
    private Location location;
    private TipyContracrot tipyContracrot;
    private List<ProvidedServices> providedServices;
    private Date createdDate;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Contractor() {
    }

    public Contractor(String name, String phone, Date birthday, String description, List<Category> category, Location location, TipyContracrot tipyContracrot, List<ProvidedServices> providedServices, Date createdDate, User user) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.category = category;
        this.location = location;
        this.tipyContracrot = tipyContracrot;
        this.providedServices = providedServices;
        this.createdDate = createdDate;
        this.user = user;
    }

    public Contractor(String id, String name, String phone, Date birthday, String description, List<Category> category, Location location, TipyContracrot tipyContracrot, List<ProvidedServices> providedServices, Date createdDate, User user, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.category = category;
        this.location = location;
        this.tipyContracrot = tipyContracrot;
        this.providedServices = providedServices;
        this.createdDate = createdDate;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public TipyContracrot getTipyContracrot() {
        return tipyContracrot;
    }

    public void setTipyContracrot(TipyContracrot tipyContracrot) {
        this.tipyContracrot = tipyContracrot;
    }

    public List<ProvidedServices> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedServices> providedServices) {
        this.providedServices = providedServices;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        Contractor that = (Contractor) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", location=" + location +
                ", tipyContracrot=" + tipyContracrot +
                ", providedServices=" + providedServices +
                ", createdDate=" + createdDate +
                ", user=" + user +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
