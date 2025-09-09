package com.SENA.FlightManagementSystem.Infrastructure.IRepository;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseRepository <T extends ABaseEntity, ID> extends JpaRepository<T, ID> {
    // Métodos comunes para repositorios
}
