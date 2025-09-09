package com.SENA.FlightManagementSystem.Geolocation.Controller;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Continent;
import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;
import com.SENA.FlightManagementSystem.Geolocation.IService.IContinentService;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICountryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/counntry")
public class CountryController extends ABaseControllerGeolocation<Country, ICountryService> {
    public CountryController(ICountryService service) {
        super(service, "Country");
    }
}
