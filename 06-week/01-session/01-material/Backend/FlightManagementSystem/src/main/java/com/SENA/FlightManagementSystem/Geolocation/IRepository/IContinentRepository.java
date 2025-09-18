package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;

@Repository
public interface IContinentRepository extends IBaseRepository<Continent, String> {
    
    @Query("SELECT c FROM Continent c WHERE c.status = true")
    List<Continent> findByStatusTrue();
}
