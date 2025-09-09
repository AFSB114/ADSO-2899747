package com.SENA.FlightManagementSystem.Parameterization.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="ticket_class", schema = "parameterization")
@Schema(name = "ticket_class", description = "Entidad que representa las clases de boletos")
public class TicketClass extends ABaseEntity{

}
