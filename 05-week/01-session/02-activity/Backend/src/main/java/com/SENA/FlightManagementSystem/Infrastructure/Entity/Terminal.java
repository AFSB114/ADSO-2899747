package com.SENA.FlightManagementSystem.Infrastructure.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

/**
 * Entidad que representa un terminal dentro de un aeropuerto.
 */
@Entity
@Table(name = "terminal", schema = "infrastructure")
@Schema(name = "Terminal", description = "Entidad que representa un terminal perteneciente a un aeropuerto")
public class Terminal extends AInfrastructureBaseEntity {

    @Schema(description = "Aeropuerto al que pertenece el terminal")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airport_id", nullable = false)
    private Airport airportId;

    public Airport getAirportId() {
        return airportId;
    }

    public void setAirportId(Airport airportId) {
        this.airportId = airportId;
    }
}
