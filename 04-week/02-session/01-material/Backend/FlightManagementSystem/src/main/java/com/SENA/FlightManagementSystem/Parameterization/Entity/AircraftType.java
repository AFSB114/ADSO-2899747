package com.SENA.FlightManagementSystem.Parameterization.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="aircraft_type", schema = "parameterization")
@Schema(name = "aircraft_type", description = "Entidad que representa los tipos de aeronaves")
public class AircraftType extends ABaseEntity{
    
}
