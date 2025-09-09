package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@MappedSuperclass
public abstract class ABaseEntityGeolocation {
    @Schema(description = "Código del dato", example = "A320678234")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Nombre del dato", example = "Airbus A320")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Descripción del dato", example = "Airbus A320")
    @Column(name = "description", nullable = false, length = 255)
    private String description;

}