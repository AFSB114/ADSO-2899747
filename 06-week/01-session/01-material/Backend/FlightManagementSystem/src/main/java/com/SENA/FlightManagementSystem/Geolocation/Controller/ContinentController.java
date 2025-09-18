package com.SENA.FlightManagementSystem.Geolocation.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;
import com.SENA.FlightManagementSystem.Geolocation.IService.IContinentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Continent")
public class ContinentController extends ABaseController<Continent, IContinentService> {

    public ContinentController(IContinentService service) {
        super(service, "Continent");
    }

}
