package com.SENA.FlightManagementSystem.Parameterization.IRepository;

import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Parameterization.Entity.AircraftType;

@Repository
public interface IAircraftTypeRepository extends IBaseRepository<AircraftType, String> {
    
}
