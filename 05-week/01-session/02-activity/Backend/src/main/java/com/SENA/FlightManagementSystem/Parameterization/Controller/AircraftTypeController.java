package com.SENA.FlightManagementSystem.Parameterization.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Parameterization.Entity.AircraftType;
import com.SENA.FlightManagementSystem.Parameterization.IService.IAircraftTypeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/AircraftType")
@Tag(name = "parameterization")
public class AircraftTypeController extends ABaseController<AircraftType, IAircraftTypeService> {

    public AircraftTypeController(IAircraftTypeService service) {
        super(service, "AircraftType");
    }

}

