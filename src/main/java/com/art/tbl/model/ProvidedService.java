package com.art.tbl.model;
/*
@author ArtemFrunze
@class ProvidedServices
@date 30.08.2021
@time 20:19 
*/

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProvidedService {

    private String id;
    private String name;
    private List<String> contractorId;
    private List<String> categoryId;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProvidedService() {
    }

    public ProvidedService(String name, List<String> contractorId, List<String> categoryId, String description) {
        this.name = name;
        this.contractorId = contractorId;
        this.categoryId = categoryId;
        this.description = description;
    }

    public ProvidedService(String id, String name, List<String> contractorId, List<String> categoryId, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.contractorId = contractorId;
        this.categoryId = categoryId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContractorId() {
        return contractorId;
    }

    public void setContractorId(List<String> contractorId) {
        this.contractorId = contractorId;
    }

    public List<String> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<String> categoryId) {
        this.categoryId = categoryId;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProvidedService that = (ProvidedService) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProvidedService{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contractorId=" + contractorId +
                ", categoryId=" + categoryId +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
