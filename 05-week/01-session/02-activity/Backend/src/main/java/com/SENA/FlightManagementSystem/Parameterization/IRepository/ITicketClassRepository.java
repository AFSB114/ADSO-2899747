package com.SENA.FlightManagementSystem.Parameterization.IRepository;

import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Parameterization.Entity.TicketClass;

@Repository
public interface ITicketClassRepository extends IBaseRepository<TicketClass, String> {
    
}
