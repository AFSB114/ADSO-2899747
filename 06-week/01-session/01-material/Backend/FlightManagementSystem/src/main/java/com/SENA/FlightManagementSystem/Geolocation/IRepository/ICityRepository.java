package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;

@Repository
public interface ICityRepository extends IBaseRepository<City, String> {
    
    @Query("SELECT c FROM City c WHERE c.status = true")
    List<City> findByStatusTrue();
    
    @Query("SELECT c FROM City c WHERE c.state.id = :stateId AND c.status = true")
    List<City> findByStateIdAndStatusTrue(@Param("stateId") String stateId);
}
