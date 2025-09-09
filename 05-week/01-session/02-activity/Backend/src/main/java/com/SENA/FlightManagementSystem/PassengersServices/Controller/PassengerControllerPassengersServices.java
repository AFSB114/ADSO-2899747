package com.SENA.FlightManagementSystem.PassengersServices.Controller;

import com.SENA.FlightManagementSystem.PassengersServices.Entity.Passenger;
import com.SENA.FlightManagementSystem.PassengersServices.IService.IPassengersServicesPassengerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/passengers")
public class PassengerControllerPassengersServices extends APassengersServicesBaseController<Passenger, IPassengersServicesPassengerService> {

    public PassengerControllerPassengersServices(IPassengersServicesPassengerService service) {
        super(service, "Passenger");
    }
}
