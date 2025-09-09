package com.SENA.FlightManagementSystem.Flight.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "crew_assignment", schema = "flight")
@Schema(name = "crew_assignment", description = "Entidad que representa las asignaciones de tripulación")
public class CrewAssignment extends AFlightBaseEntity {
    
    @Schema(description = "ID del vuelo", example = "123e4567-e89b-12d3-a456-426614174000")
    @Column(name = "flight_id", nullable = false, length = 36)
    private String flightId;

    @Schema(description = "ID del empleado", example = "123e4567-e89b-12d3-a456-426614174001")
    @Column(name = "employee_id", nullable = false, length = 36)
    private String employeeId;

    @Schema(description = "ID del rol de tripulación", example = "123e4567-e89b-12d3-a456-426614174002")
    @Column(name = "crew_role_id", nullable = false, length = 36)
    private String crewRoleId;

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCrewRoleId() {
        return crewRoleId;
    }

    public void setCrewRoleId(String crewRoleId) {
        this.crewRoleId = crewRoleId;
    }
}