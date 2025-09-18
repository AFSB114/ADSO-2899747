package com.SENA.FlightManagementSystem.Geolocation.IService;

import java.util.List;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;

public interface ICountryService extends IBaseService<Country> {
    
    /**
     * Encuentra todos los países de un continente específico
     * 
     * @param continentId ID del continente
     * @return Lista de países del continente
     * @throws Exception Si ocurre un error
     */
    List<Country> findByContinentId(String continentId) throws Exception;
}
