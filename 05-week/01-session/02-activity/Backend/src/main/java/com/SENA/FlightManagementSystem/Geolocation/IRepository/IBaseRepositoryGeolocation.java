package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SENA.FlightManagementSystem.Geolocation.Entity.ABaseEntityGeo;

public interface IBaseRepositoryGeolocation<T extends ABaseEntityGeo, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}