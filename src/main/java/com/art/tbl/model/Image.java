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
    private java.awt.Image image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Image() {
    }

    public Image(String name, java.awt.Image image) {
        this.name = name;
        this.image = image;
    }

    public Image(String id, String name, java.awt.Image image, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
