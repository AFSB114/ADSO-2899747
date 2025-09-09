package com.SENA.FlightManagementSystem.Geolocation.Controller;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;
import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICityService;
import com.SENA.FlightManagementSystem.Geolocation.IService.IContinentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/continent")
public class ContinentController extends ABaseControllerGeolocation<Continent, IContinentService>{

    public ContinentController(IContinentService service) {
        super(service, "Continent");
    }
}
