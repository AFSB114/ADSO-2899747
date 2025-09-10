package com.SENA.FlightManagementSystem.Flight.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Flight.Entity.Flight;
import com.SENA.FlightManagementSystem.Flight.IService.IFlightService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Flight")
@Tag(name = "flight")
public class FlightController extends AFlightBaseController<Flight, IFlightService> {

    public FlightController(IFlightService service) {
       super(service, "Flight");
   }
}
