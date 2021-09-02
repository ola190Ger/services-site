package com.art.tbl.model;
/*
@author ArtemFrunze
@class ProvidedServices
@date 30.08.2021
@time 20:19 
*/

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProvidedService {

    private String id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProvidedService() {
    }

    public ProvidedService(String name) {
        this.name = name;
    }

    public ProvidedService(String id, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
