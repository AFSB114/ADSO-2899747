package com.SENA.FlightManagementSystem.Geolocation.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepositoryGeolocation;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.ICountryRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService  extends ABaseServiceGeolocation<Country> implements ICountryService {
    @Override
    protected IBaseRepositoryGeolocation<Country, String> getRepository() {
        return repository;
    }

    @Autowired
    private ICountryRepository repository;
}
