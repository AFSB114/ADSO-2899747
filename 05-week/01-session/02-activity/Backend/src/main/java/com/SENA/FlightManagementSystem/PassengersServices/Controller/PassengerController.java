package com.SENA.FlightManagementSystem.PassengersServices.Controller;

import com.SENA.FlightManagementSystem.PassengersServices.Entity.Passenger;
import com.SENA.FlightManagementSystem.PassengersServices.IService.IPassengersServicesPassengerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/passengers")
@Tag(name = "passengers_services")
public class PassengerController extends APassengersServicesBaseController<Passenger, IPassengersServicesPassengerService> {

    public PassengerController(IPassengersServicesPassengerService service) {
        super(service, "Passenger");
    }
}
