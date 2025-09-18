package com.SENA.FlightManagementSystem.Geolocation.IService;

import java.util.List;

import com.SENA.FlightManagementSystem.Geolocation.Entity.State;

public interface IStateService extends IBaseService<State> {
    
    /**
     * Encuentra todos los estados de un país específico
     * 
     * @param countryId ID del país
     * @return Lista de estados del país
     * @throws Exception Si ocurre un error
     */
    List<State> findByCountryId(String countryId) throws Exception;
}
