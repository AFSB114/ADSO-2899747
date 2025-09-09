package com.SENA.FlightManagementSystem.Geolocation.IRepository;

import org.springframework.stereotype.Repository;
import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;

@Repository
public interface ICountryRepository extends IBaseRepositoryGeolocation<Country, String> {

}