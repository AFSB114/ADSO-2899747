package com.SENA.FlightManagementSystem.Flight.IRepository;

import com.SENA.FlightManagementSystem.Flight.Entity.AFlightBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFlightBaseRepository<T extends AFlightBaseEntity, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}
