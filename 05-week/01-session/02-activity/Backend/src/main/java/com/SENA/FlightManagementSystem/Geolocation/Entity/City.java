package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "city", schema = "geolocation")
@Schema(name="city", description = "Entidad que representa una ciudad")
public class City extends ABaseEntityGeo {

    @Schema(description = "relacion con estado")
    @ManyToOne
    @JoinColumn(name = "state_id", nullable = false)
    private State state;

}