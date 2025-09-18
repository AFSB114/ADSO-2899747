package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Geolocation.Entity.State;

@Repository
public interface IStateRepository extends IBaseRepository<State, String> {
    
    @Query("SELECT s FROM State s WHERE s.status = true")
    List<State> findByStatusTrue();
    
    @Query("SELECT s FROM State s WHERE s.country.id = :countryId AND s.status = true")
    List<State> findByCountryIdAndStatusTrue(@Param("countryId") String countryId);
}
