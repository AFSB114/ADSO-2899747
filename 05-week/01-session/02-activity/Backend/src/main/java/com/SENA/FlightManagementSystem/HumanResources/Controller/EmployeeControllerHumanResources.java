package com.SENA.FlightManagementSystem.HumanResources.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.SENA.FlightManagementSystem.HumanResources.Entity.Employee;

import com.SENA.FlightManagementSystem.HumanResources.IService.IHumanResourcesEmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Employee")
public class EmployeeControllerHumanResources extends AHumanResourcesBaseController<Employee, IHumanResourcesEmployeeService> {

    public EmployeeControllerHumanResources(IHumanResourcesEmployeeService service) {
        super(service, "Employee");
    }

}