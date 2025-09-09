package com.SENA.FlightManagementSystem.HumanResources.Service;

import com.SENA.FlightManagementSystem.HumanResources.IRepository.IHumanResourcesBaseRepository;
import com.SENA.FlightManagementSystem.HumanResources.IRepository.IHumanResourcesEmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SENA.FlightManagementSystem.HumanResources.Entity.Employee;
import com.SENA.FlightManagementSystem.HumanResources.IService.IHumanResourcesEmployeeService;

@Service
public class EmployeeServiceHumanResources extends AHumanResourcesBaseService<Employee> implements IHumanResourcesEmployeeService {

    @Override
    protected IHumanResourcesBaseRepository<Employee, String> getRepository() {
        return repository;
    }

    @Autowired
    private IHumanResourcesEmployeeRepository repository;
}