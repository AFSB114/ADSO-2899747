package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "country", schema = "geolocation")
@Schema(name="country", description = "Entidad que representa un país")
public class Country extends ABaseEntityGeo {
    
    @Schema(description = "relacion con continente")
    @ManyToOne
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continent;

}