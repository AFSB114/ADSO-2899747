package com.SENA.FlightManagementSystem.PassengersServices.IRepository;

import com.SENA.FlightManagementSystem.PassengersServices.Entity.APassengersServicesBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPassengersServicesBaseRepository<T extends APassengersServicesBaseEntity, ID> extends JpaRepository<T, ID> {

}
