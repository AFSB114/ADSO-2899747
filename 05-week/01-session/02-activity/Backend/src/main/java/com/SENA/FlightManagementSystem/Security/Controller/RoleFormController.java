package com.SENA.FlightManagementSystem.Security.Controller;

import com.SENA.FlightManagementSystem.Security.Entity.RoleForm;
import com.SENA.FlightManagementSystem.Security.IService.IRoleFormService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/RoleForm")
public class RoleFormController extends ASecurityBaseController<RoleForm, IRoleFormService> {

    public RoleFormController(IRoleFormService service) {
        super(service, "RoleForm");
    }
}
