package com.art.tbl.model;
/*
@author ArtemFrunze
@class Subscription
@date 31.08.2021
@time 20:04 
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Subscription {
    private String id;
    private Contractor contractor;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Subscription() {
    }

    public Subscription(Contractor contractor, LocalDate startDate, LocalDate endDate) {
        this.contractor = contractor;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Subscription(String id, Contractor contractor, LocalDate startDate, LocalDate endDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.contractor = contractor;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
