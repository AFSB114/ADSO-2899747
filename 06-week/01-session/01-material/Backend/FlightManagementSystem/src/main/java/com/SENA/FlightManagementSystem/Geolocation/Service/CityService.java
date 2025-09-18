package com.SENA.FlightManagementSystem.Geolocation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.ICityRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICityService;

@Service
public class CityService extends ABaseService<City> implements ICityService {

    @Autowired
    private ICityRepository repository;

    @Override
    protected IBaseRepository<City, String> getRepository() {
        return repository;
    }

    @Override
    public List<City> findByStateTrue() throws Exception {
        return repository.findByStatusTrue();
    }

    public List<City> findByStateId(String stateId) throws Exception {
        return repository.findByStateIdAndStatusTrue(stateId);
    }
}
