package com.SENA.FlightManagementSystem.Security.IRepository;

import com.SENA.FlightManagementSystem.Security.Entity.ASecurityBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISecurityBaseRepository<T extends ASecurityBaseEntity, ID> extends JpaRepository<T, ID> {
    // Métodos comunes para repositorios del módulo Security
}
