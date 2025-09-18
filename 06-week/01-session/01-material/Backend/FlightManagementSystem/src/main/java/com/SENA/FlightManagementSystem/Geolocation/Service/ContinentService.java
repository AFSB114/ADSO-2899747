package com.SENA.FlightManagementSystem.Geolocation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IContinentRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.IContinentService;

@Service
public class ContinentService extends ABaseService<Continent> implements IContinentService {

    @Autowired
    private IContinentRepository repository;

    @Override
    protected IBaseRepository<Continent, String> getRepository() {
        return repository;
    }

    @Override
    public List<Continent> findByStateTrue() throws Exception {
        return repository.findByStatusTrue();
    }
}
