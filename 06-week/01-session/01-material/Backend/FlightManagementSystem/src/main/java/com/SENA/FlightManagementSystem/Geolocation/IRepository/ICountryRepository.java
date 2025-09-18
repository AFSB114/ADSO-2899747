package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;

@Repository
public interface ICountryRepository extends IBaseRepository<Country, String> {
    
    @Query("SELECT c FROM Country c WHERE c.status = true")
    List<Country> findByStatusTrue();
    
    @Query("SELECT c FROM Country c WHERE c.continent.id = :continentId AND c.status = true")
    List<Country> findByContinentIdAndStatusTrue(@Param("continentId") String continentId);
}
