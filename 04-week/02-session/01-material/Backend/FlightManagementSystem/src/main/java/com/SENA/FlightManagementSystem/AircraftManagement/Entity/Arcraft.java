package com.SENA.FlightManagementSystem.AircraftManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="aircraft", schema = "aircraft_management")
@Schema(name = "aircraft_management", description = "Entidad que representa la gestión de aeronaves")
public class Arcraft extends ABaseEntity{
    
}
