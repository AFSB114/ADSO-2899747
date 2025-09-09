package com.SENA.FlightManagementSystem.HumanResources.Entity;

import java.time.LocalDateTime;

import com.SENA.FlightManagementSystem.Security.Entity.Person;
import com.SENA.FlightManagementSystem.Security.Entity.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="employee", schema = "human_resources")
@Schema(name = "employee", description = "Entidad que representa a los empleados")
@Data
public class Employee extends AHumanResourcesBaseEntity {
    @Column(name = "salary", nullable = false)
    @Schema(description = "Salario del empleado", example = "3500.50")
    private Double salary;

    @Column(name = "hire_date", nullable = false)
    @Schema(description = "Fecha de contratación del empleado", example = "2023-01-15")
    private LocalDateTime hireDate;

    @ManyToOne
    @JoinColumn(name = "crew_role_id", nullable = false)
    @Schema(description = "Rol del empleado en la tripulación")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    @Schema(description = "Persona asociada al empleado")
    private Person person;
}