package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="country", schema = "geolocation")
@Schema(name = "country", description = "Entidad que representa los países")
public class Country extends ABaseEntity{

    @Schema(description = "Continente al que pertenece el país", example = "1")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continent;

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
