package com.SENA.FlightManagementSystem.Security.Controller;

import com.SENA.FlightManagementSystem.Security.Entity.Role;
import com.SENA.FlightManagementSystem.Security.IService.IRoleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Role")
public class RoleController extends ASecurityBaseController<Role, IRoleService> {

    public RoleController(IRoleService service) {
        super(service, "Role");
    }
}
