package com.SENA.FlightManagementSystem.Flight.Entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="baggage", schema = "flight")
@Schema(name = "baggage", description = "Entidad que representa los equipajes")
public class Baggage extends AFlightBaseEntity{

    @Schema(description = "Weight", example = "123abc")
    @Column(name = "weight", nullable = false)
    private int weight;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false )
    private Ticket ticket;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
