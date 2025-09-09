package com.SENA.FlightManagementSystem.Security.Controller;

import com.SENA.FlightManagementSystem.Security.Entity.Module;
import com.SENA.FlightManagementSystem.Security.IService.IModuleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Module")
public class ModuleController extends ASecurityBaseController<Module, IModuleService> {

    public ModuleController(IModuleService service) {
        super(service, "Module");
    }
}
