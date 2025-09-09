package com.SENA.FlightManagementSystem.HumanResources.IRepository;

import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.HumanResources.Entity.Employee;

@Repository
public interface IHumanResourcesEmployeeRepository extends IHumanResourcesBaseRepository<Employee, String> {

}