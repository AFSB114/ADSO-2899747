package com.SENA.FlightManagementSystem.Geolocation.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "continent", schema = "geolocation")
@Schema(name="continent", description = "Entidad que representa un continente")
public class Continent extends ABaseEntityGeo {
    
}
