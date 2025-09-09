package com.SENA.FlightManagementSystem.Infrastructure.IRepository;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.AInfrastructureBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInfrastructureBaseRepository<T extends AInfrastructureBaseEntity, ID> extends JpaRepository<T, ID> {
    // Métodos comunes para repositorios del módulo Infrastructure
}
