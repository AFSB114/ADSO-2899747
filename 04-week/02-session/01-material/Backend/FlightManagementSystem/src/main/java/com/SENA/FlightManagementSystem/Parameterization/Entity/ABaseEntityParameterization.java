
package com.SENA.FlightManagementSystem.Parameterization.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ABaseEntityParameterization {    

    @Schema(description = "Código del dato", example = "A320678234")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Nombre del dato", example = "Airbus A320")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Descripción del dato", example = "Airbus A320")
    @Column(name = "description", nullable = false, length = 255)
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
