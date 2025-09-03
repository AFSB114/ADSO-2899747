package com.SENA.FlightManagementSystem.AircraftManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="aircraft")
@Schema(name = "aircraft_managementt")
public class Arcraft extends ABaseEntity{
}
