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
import java.util.Objects;

@Data
public class Contractor {
    private String id;
    private String name;
    private List<String> phone;
    private LocalDate birthday;
    private String description;
    private List<String> typeContractorId;
    private List<String> providedServicesId;
    private User manager;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Contractor() {
    }

    public Contractor(String name, List<String> phone, LocalDate birthday, String description, List<String> typeContractorId, List<String> providedServicesId, User manager) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.typeContractorId = typeContractorId;
        this.providedServicesId = providedServicesId;
        this.manager = manager;
    }

    public Contractor(String id, String name, List<String> phone, LocalDate birthday, String description, List<String> typeContractorId, List<String> providedServicesId, User manager, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.typeContractorId = typeContractorId;
        this.providedServicesId = providedServicesId;
        this.manager = manager;
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

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTypeContractorId() {
        return typeContractorId;
    }

    public void setTypeContractorId(List<String> typeContractorId) {
        this.typeContractorId = typeContractorId;
    }

    public List<String> getProvidedServicesId() {
        return providedServicesId;
    }

    public void setProvidedServicesId(List<String> providedServicesId) {
        this.providedServicesId = providedServicesId;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
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
                ", phone=" + phone +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                ", typeContractorId=" + typeContractorId +
                ", providedServicesId=" + providedServicesId +
                ", manager=" + manager +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

