package com.SENA.FlightManagementSystem.PassengersServices.IRepository;


import com.SENA.FlightManagementSystem.PassengersServices.Entity.Passenger;
import org.springframework.stereotype.Repository;

@Repository
public interface IPassengersServicesPassenger extends IPassengersServicesBaseRepository<Passenger, String> {
}
