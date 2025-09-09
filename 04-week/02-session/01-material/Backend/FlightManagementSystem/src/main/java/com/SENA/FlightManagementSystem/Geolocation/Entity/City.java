package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "city", schema = "geolocation")
public class City {
    @Id
    @Schema(description = "Identificador de la ciudad", example = "c123")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Schema(description = "Nombre de la ciudad", example = "Bogotá")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
