package com.SENA.FlightManagementSystem.PassengersServices.Service;

import com.SENA.FlightManagementSystem.PassengersServices.Entity.Passenger;
import com.SENA.FlightManagementSystem.PassengersServices.IRepository.IPassengersServicesBaseRepository;
import com.SENA.FlightManagementSystem.PassengersServices.IRepository.IPassengersServicesPassenger;
import com.SENA.FlightManagementSystem.PassengersServices.IService.IPassengersServicesPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServicePassengersServices extends APassengersServicesBaseService<Passenger> implements IPassengersServicesPassengerService {

    @Autowired
    private IPassengersServicesPassenger repository;

    @Override
    protected IPassengersServicesBaseRepository<Passenger, String> getRepository() {
        return repository;
    }
}
