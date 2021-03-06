package com.art.tbl.model;
/*
@author ArtemFrunze
@class Image
@date 31.08.2021
@time 20:01 
*/

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Image {
    private String id;
    private String name;
    private String contractorId;
    private String description;
    private java.awt.Image image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Image() {
    }

    public Image(String name, String contractorId, String description, java.awt.Image image) {
        this.name = name;
        this.contractorId = contractorId;
        this.description = description;
        this.image = image;
    }

    public Image(String id, String name, String contractorId, String description, java.awt.Image image, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.contractorId = contractorId;
        this.description = description;
        this.image = image;
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

    public String getContractorId() {
        return contractorId;
    }

    public void setContractorId(String contractorId) {
        this.contractorId = contractorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.awt.Image getImage() {
        return image;
    }

    public void setImage(java.awt.Image image) {
        this.image = image;
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

        Image image = (Image) o;

        return id.equals(image.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contractorId='" + contractorId + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
