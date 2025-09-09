package com.SENA.FlightManagementSystem.Flight.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="fligth", schema = "flight")
@Schema(name = "flight", description = "Entidad que representa un vuelo")
@Data
public class Flight extends AFlightBaseEntity {
    
}
