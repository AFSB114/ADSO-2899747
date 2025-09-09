package com.SENA.FlightManagementSystem.Infrastructure.Controller;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.Airport;
import com.SENA.FlightManagementSystem.Infrastructure.IService.IAirportService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Airport")
public class AirportController extends AInfrastructureBaseController<Airport, IAirportService> {

    public AirportController(IAirportService service) {
        super(service, "Airport");
    }
}
