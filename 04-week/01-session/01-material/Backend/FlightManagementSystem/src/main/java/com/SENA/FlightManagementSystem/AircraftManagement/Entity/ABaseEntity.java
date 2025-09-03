package com.SENA.FlightManagementSystem.AircraftManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @Schema(description  = "Fecha de creación del dato", example = "")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Schema(description = "Usuario que creó el dato", example = "admin")
    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;

    @Schema(description  = "Fecha de actualización del dato", example = "")
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Schema(description = "Usuario que modificó el dato", example = "editor")
    @Column(name = "updated_by", nullable = true, length = 100)
    private String updatedBy;

    @Schema(description  = "Fecha de eliminación del dato", example = "")
    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Schema(description = "Usuario que eliminó el dato", example = "deleter")
    @Column(name = "deleted_by", nullable = true, length = 100)
    private String deletedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}
