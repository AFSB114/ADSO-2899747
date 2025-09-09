package com.SENA.FlightManagementSystem.Flight.IRepository;

import org.springframework.stereotype.Repository;
import com.SENA.FlightManagementSystem.Flight.Entity.CrewAssignment;

@Repository
public interface ICrewAssignmentRepository extends IFlightBaseRepository<CrewAssignment, String> {
    
}