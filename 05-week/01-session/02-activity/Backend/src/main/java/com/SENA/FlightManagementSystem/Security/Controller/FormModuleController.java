package com.SENA.FlightManagementSystem.Security.Controller;

import com.SENA.FlightManagementSystem.Security.Entity.FormModule;
import com.SENA.FlightManagementSystem.Security.IService.IFormModuleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/FormModule")
@Tag(name = "security")
public class FormModuleController extends ASecurityBaseController<FormModule, IFormModuleService> {

    public FormModuleController(IFormModuleService service) {
        super(service, "FormModule");
    }
}
