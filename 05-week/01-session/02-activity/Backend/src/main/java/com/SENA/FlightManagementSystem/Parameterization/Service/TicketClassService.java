package com.SENA.FlightManagementSystem.Parameterization.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Parameterization.Entity.TicketClass;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.ITicketClassRepository;
import com.SENA.FlightManagementSystem.Parameterization.IService.ITicketClassService;

@Service
public class TicketClassService extends ABaseService<TicketClass> implements ITicketClassService {

    @Override
    protected IBaseRepository<TicketClass, String> getRepository() {
        return repository;
    }

    @Autowired
    private ITicketClassRepository repository;

}
