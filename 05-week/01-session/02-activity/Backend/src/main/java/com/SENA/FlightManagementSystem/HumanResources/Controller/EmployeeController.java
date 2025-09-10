package com.SENA.FlightManagementSystem.HumanResources.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.SENA.FlightManagementSystem.HumanResources.Entity.Employee;

import com.SENA.FlightManagementSystem.HumanResources.IService.IHumanResourcesEmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Employee")
@Tag(name = "human_resources")
public class EmployeeController extends AHumanResourcesBaseController<Employee, IHumanResourcesEmployeeService> {

    public EmployeeController(IHumanResourcesEmployeeService service) {
        super(service, "Employee");
    }

}