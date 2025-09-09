package com.SENA.FlightManagementSystem.Flight.Service;

import com.SENA.FlightManagementSystem.Flight.Entity.Flight;
import com.SENA.FlightManagementSystem.Flight.IRepository.IFlightRepository;
import com.SENA.FlightManagementSystem.Flight.IRepository.ITicketRepository;
import com.SENA.FlightManagementSystem.Flight.IService.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService extends AFlightBaseService<Flight> implements IFlightService {

    @Override
    protected IFlightRepository getRepository() {
        return repository;
    }

    @Autowired
    private IFlightRepository repository;
}
