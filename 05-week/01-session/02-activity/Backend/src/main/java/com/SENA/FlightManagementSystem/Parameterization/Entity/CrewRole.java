package com.SENA.FlightManagementSystem.Parameterization.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="crew_role", schema = "parameterization")
@Schema(name = "crew_role", description = "Entidad que representa los roles de la tripulación")
public class CrewRole extends ABaseEntity{
    
}
