package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import org.springframework.stereotype.Repository;
import com.SENA.FlightManagementSystem.Geolocation.Entity.City;

@Repository
public interface ICityRepository extends IBaseRepositoryGeolocation<City, String> {

}