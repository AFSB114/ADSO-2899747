package com.SENA.FlightManagementSystem.Infrastructure.Service;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.Airport;
import com.SENA.FlightManagementSystem.Infrastructure.IRepository.IAirportRepository;
import com.SENA.FlightManagementSystem.Infrastructure.IService.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService extends AInfrastructureBaseService<Airport> implements IAirportService {

    @Override
    protected IAirportRepository getRepository() {
        return repository;
    }

    @Autowired
    private IAirportRepository repository;
}
