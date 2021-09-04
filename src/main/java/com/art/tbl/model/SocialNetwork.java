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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SocialNetwork() {
    }

    public SocialNetwork(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public SocialNetwork(String id, String name, String url, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
