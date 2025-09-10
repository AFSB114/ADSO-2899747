package com.SENA.FlightManagementSystem.Parameterization.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Parameterization.Entity.CrewRole;
import com.SENA.FlightManagementSystem.Parameterization.IService.ICrewRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/CrewRole")
@Tag(name = "parameterization")
public class CrewRoleController extends ABaseController<CrewRole, ICrewRoleService> {

    public CrewRoleController(ICrewRoleService service) {
        super(service, "CrewRole");
    }

}
