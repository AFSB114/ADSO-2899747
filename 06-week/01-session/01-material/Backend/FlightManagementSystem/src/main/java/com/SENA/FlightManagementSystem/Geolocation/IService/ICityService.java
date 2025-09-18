package com.SENA.FlightManagementSystem.Geolocation.IService;

import java.util.List;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;

public interface ICityService extends IBaseService<City> {
    
    /**
     * Encuentra todas las ciudades de un estado específico
     * 
     * @param stateId ID del estado
     * @return Lista de ciudades del estado
     * @throws Exception Si ocurre un error
     */
    List<City> findByStateId(String stateId) throws Exception;
}
