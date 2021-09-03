package com.art.tbl.model;
/*
@author ArtemFrunze
@class TipyContracrot
@date 30.08.2021
@time 20:17 
*/

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TypeContractor {
    private String id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TypeContractor() {
    }

    public TypeContractor(String name) {
        this.name = name;
    }

    public TypeContractor(String id, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
