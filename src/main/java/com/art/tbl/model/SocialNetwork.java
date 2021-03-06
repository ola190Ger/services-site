package com.art.tbl.model;
/*
@author ArtemFrunze
@class SocialNetworks
@date 29.08.2021
@time 11:57 
*/

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SocialNetwork {
    private String id;
    private String name;
    private String url;
    private String contractorId;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SocialNetwork() {
    }

    public SocialNetwork(String name, String url, String contractorId, String description) {
        this.name = name;
        this.url = url;
        this.contractorId = contractorId;
        this.description = description;
    }

    public SocialNetwork(String id, String name, String url, String contractorId, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.url = url;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

        SocialNetwork that = (SocialNetwork) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", contractorId='" + contractorId + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
