package com.art.tbl.dto;/*
@author OlgaGereliuk
@class ImageDTO
@Date 19.09.2021
@Time 16:20
*/

import java.time.LocalDateTime;

public class ImageDTO {
    private String id;
    private String name;
    private String contractorId;
    private String imageUrl;
    private String description;

    public ImageDTO() {
    }

    public ImageDTO(String id, String name, String contractorId, String imageUrl, String description) {
        this.id = id;
        this.name = name;
        this.contractorId = contractorId;
        this.imageUrl = imageUrl;
        this.description = description;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
