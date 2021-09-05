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
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Subscription() {
    }

    public Subscription(Contractor contractor, LocalDate startDate, LocalDate endDate, String description) {
        this.contractor = contractor;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Subscription(String id, Contractor contractor, LocalDate startDate, LocalDate endDate, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.contractor = contractor;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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

        Subscription that = (Subscription) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id='" + id + '\'' +
                ", contractor=" + contractor +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
