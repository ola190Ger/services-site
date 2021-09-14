package com.art.tbl.model;
/*
@author ArtemFrunze
@class Reviews
@date 31.08.2021
@time 20:03 
*/

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reviews {
    private String id;
    private String text;
    private String contractorId;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Reviews() {
    }

    public Reviews(String text, String contractorId, String description) {
        this.text = text;
        this.contractorId = contractorId;
        this.description = description;
    }

    public Reviews(String id, String text, String contractorId, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.text = text;
        this.contractorId = contractorId;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
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

        Reviews reviews = (Reviews) o;

        return id.equals(reviews.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", contractorId='" + contractorId + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
