package com.SENA.FlightManagementSystem.Flight.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Flight.Entity.CrewAssignment;
import com.SENA.FlightManagementSystem.Flight.IService.ICrewAssignmentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/CrewAssignment")
public class CrewAssignmentController extends AFlightBaseController<CrewAssignment, ICrewAssignmentService> {

    public CrewAssignmentController(ICrewAssignmentService service) {
        super(service, "CrewAssignment");
    }
}