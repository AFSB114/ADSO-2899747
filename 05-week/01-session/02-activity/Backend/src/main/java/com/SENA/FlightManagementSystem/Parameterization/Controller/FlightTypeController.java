package com.SENA.FlightManagementSystem.Parameterization.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Parameterization.Entity.FlightType;
import com.SENA.FlightManagementSystem.Parameterization.IService.IFlightTypeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/FlightType")
@Tag(name = "parameterization")
public class FlightTypeController extends ABaseController<FlightType, IFlightTypeService> {

    public FlightTypeController(IFlightTypeService service) {
        super(service, "FlightType");
    }

}
