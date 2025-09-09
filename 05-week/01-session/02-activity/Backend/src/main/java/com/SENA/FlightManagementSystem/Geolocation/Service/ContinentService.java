package com.SENA.FlightManagementSystem.Geolocation.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepositoryGeolocation;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IContinentRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.IContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentService extends ABaseServiceGeolocation<Continent> implements IContinentService {
    @Override
    protected IBaseRepositoryGeolocation<Continent, String> getRepository() {
        return repository;
    }

    @Autowired
    private IContinentRepository repository;
}
