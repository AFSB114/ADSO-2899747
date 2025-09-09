package com.SENA.FlightManagementSystem.Parameterization.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SENA.FlightManagementSystem.Parameterization.Entity.ABaseEntity;

public interface IBaseRepository <T extends ABaseEntity, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}
