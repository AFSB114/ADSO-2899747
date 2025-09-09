package com.SENA.FlightManagementSystem.PassengersServices.Entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class APassengersServicesBaseEntity {
    @Id
    @Column(name = "id", nullable = false, updatable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Schema(description = "Estado del dato (activo/inactivo)", example = "true")
    @Column(name = "status", nullable = false)
    private Boolean status;

    @Schema(description  = "Fecha de creación del dato", example = "2023-01-01T10:00:00")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Schema(description  = "Fecha de actualización del dato", example = "2023-01-02T10:00:00")
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Schema(description  = "Fecha de eliminación del dato", example = "2023-01-03T10:00:00")
    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Schema(description = "Usuario que creó el dato", example = "admin")
    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;

    @Schema(description = "Usuario que modificó el dato", example = "editor")
    @Column(name = "updated_by", nullable = true, length = 100)
    private String updatedBy;

    @Schema(description = "Usuario que eliminó el dato", example = "deleter")
    @Column(name = "deleted_by", nullable = true, length = 100)
    private String deletedBy;

}
