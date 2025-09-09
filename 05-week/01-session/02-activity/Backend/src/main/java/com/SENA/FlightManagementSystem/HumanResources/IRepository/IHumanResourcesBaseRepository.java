package com.SENA.FlightManagementSystem.HumanResources.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SENA.FlightManagementSystem.HumanResources.Entity.AHumanResourcesBaseEntity;

public interface IHumanResourcesBaseRepository<T extends AHumanResourcesBaseEntity, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}
