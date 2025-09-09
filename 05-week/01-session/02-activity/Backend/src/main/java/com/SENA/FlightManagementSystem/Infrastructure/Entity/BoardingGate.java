package com.SENA.FlightManagementSystem.Infrastructure.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

/**
 * Entidad que representa una puerta de embarque perteneciente a un terminal.
 */
@Entity
@Table(name = "boarding_gate", schema = "infrastructure")
@Schema(name = "BoardingGate", description = "Entidad que representa una puerta de embarque perteneciente a un terminal")
public class BoardingGate extends AInfrastructureBaseEntity {

    @Schema(description = "Terminal al que pertenece la puerta de embarque")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terminal_id", nullable = false)
    private Terminal terminalId;

    public Terminal getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Terminal terminalId) {
        this.terminalId = terminalId;
    }
}
