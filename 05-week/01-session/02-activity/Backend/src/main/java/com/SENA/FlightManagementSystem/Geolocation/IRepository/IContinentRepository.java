package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import org.springframework.stereotype.Repository;
import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;

@Repository
public interface IContinentRepository extends IBaseRepositoryGeolocation<Continent, String> {

}