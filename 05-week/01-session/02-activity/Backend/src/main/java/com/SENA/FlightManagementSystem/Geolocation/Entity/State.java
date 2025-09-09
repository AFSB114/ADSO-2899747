package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "state", schema = "geolocation")
@Schema(name="state", description = "Entidad que representa un estado")
public class State extends ABaseEntityGeo {

    @Schema(description = "relacion con pais")
    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

}