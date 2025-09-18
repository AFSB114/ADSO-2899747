package com.SENA.FlightManagementSystem.Geolocation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.ICountryRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICountryService;

@Service
public class CountryService extends ABaseService<Country> implements ICountryService {

    @Autowired
    private ICountryRepository repository;

    @Override
    protected IBaseRepository<Country, String> getRepository() {
        return repository;
    }

    @Override
    public List<Country> findByStateTrue() throws Exception {
        return repository.findByStatusTrue();
    }

    public List<Country> findByContinentId(String continentId) throws Exception {
        return repository.findByContinentIdAndStatusTrue(continentId);
    }
}
