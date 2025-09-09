package com.SENA.FlightManagementSystem.Flight.IRepository;

import com.SENA.FlightManagementSystem.Flight.Entity.Ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ITicketRepository extends IFlightBaseRepository<Ticket, String>{
}
