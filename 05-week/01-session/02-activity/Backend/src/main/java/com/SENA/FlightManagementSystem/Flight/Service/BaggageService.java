package com.SENA.FlightManagementSystem.Flight.Service;

import com.SENA.FlightManagementSystem.Flight.Entity.AFlightBaseEntity;
import com.SENA.FlightManagementSystem.Flight.IRepository.IBaggageRepository;
import com.SENA.FlightManagementSystem.Flight.IService.IBaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Flight.Entity.Baggage;

@Service
public class BaggageService extends AFlightBaseService<Baggage> implements IBaggageService {

    @Override
    protected IBaggageRepository getRepository() {
        return repository;
    }

    @Autowired
    private IBaggageRepository repository;
}