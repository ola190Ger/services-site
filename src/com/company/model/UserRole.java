package com.company.model;
/*
@author ArtemFrunze
@class UserRole
@date 29.08.2021
@time 11:39 
*/

import java.time.LocalDateTime;
import java.util.Objects;

public class UserRole {
    private String id;
    private String userId;
    private  String roleId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserRole() {
    }

    public UserRole(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public UserRole(String id, String userId, String roleId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        UserRole userRole = (UserRole) o;
        return getId().equals(userRole.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
