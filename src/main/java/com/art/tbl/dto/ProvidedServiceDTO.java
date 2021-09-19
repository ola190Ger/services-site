package com.art.tbl.dto;/*
@author OlgaGereliuk
@class ProvidedServiceDTO
@Date 19.09.2021
@Time 16:22
*/

import java.time.LocalDateTime;
import java.util.List;

public class ProvidedServiceDTO {
    private String id;
    private String name;
    private List<String> contractorId;
    private List<String> categoryId;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

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
}
