package com.SENA.FlightManagementSystem.Parameterization.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="flight_type", schema = "parameterization")
@Schema(name = "flight_type", description = "Entidad que representa los tipos de vuelos")
public class FlightType extends ABaseEntity{
    
}
