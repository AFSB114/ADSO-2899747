package com.SENA.FlightManagementSystem.Parameterization.IRepository;

import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Parameterization.Entity.FlightType;

@Repository
public interface IFlightTypeRepository extends IBaseRepository<FlightType, String> {
    
}
