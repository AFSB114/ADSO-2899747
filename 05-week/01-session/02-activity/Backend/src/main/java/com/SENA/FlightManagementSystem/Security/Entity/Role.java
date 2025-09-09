package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "role", schema = "security")
@Schema(name = "Role", description = "Rol del sistema")
public class Role extends ASecurityNamedEntity {

    @Schema(description = "Descripción del rol", example = "Acceso administrativo completo")
    @Column(name = "description", nullable = true, length = 400)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
