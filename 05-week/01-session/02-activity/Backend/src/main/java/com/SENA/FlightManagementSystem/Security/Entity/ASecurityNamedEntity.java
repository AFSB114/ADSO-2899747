package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ASecurityNamedEntity extends ASecurityBaseEntity {

    @Schema(description = "Nombre del registro", example = "Administrador")
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
