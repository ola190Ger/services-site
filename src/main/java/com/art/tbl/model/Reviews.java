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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Reviews() {
    }

    public Reviews(String text) {
        this.text = text;
    }

    public Reviews(String id, String text, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.text = text;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
