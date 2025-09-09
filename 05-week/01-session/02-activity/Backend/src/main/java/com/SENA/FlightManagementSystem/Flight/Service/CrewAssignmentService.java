package com.SENA.FlightManagementSystem.Flight.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Flight.Entity.CrewAssignment;
import com.SENA.FlightManagementSystem.Flight.IRepository.ICrewAssignmentRepository;
import com.SENA.FlightManagementSystem.Flight.IRepository.IFlightBaseRepository;
import com.SENA.FlightManagementSystem.Flight.IService.ICrewAssignmentService;

@Service
public class CrewAssignmentService extends AFlightBaseService<CrewAssignment> implements ICrewAssignmentService {

    @Override
    protected IFlightBaseRepository<CrewAssignment, String> getRepository() {
        return repository;
    }

    @Autowired
    private ICrewAssignmentRepository repository;
}