package com.SENA.FlightManagementSystem.Flight.Service;

import com.SENA.FlightManagementSystem.Flight.Entity.Ticket;
import com.SENA.FlightManagementSystem.Flight.IRepository.ITicketRepository;
import com.SENA.FlightManagementSystem.Flight.IService.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService extends AFlightBaseService<Ticket> implements ITicketService {

    @Override
    protected ITicketRepository getRepository() {
        return repository;
    }

    @Autowired
    private ITicketRepository repository;

}