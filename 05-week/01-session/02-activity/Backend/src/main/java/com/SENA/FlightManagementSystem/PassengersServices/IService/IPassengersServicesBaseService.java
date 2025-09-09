package com.SENA.FlightManagementSystem.PassengersServices.IService;

import com.SENA.FlightManagementSystem.PassengersServices.Entity.APassengersServicesBaseEntity;

import java.util.List;
import java.util.Optional;

public interface IPassengersServicesBaseService<T extends APassengersServicesBaseEntity> {

    List<T> all() throws Exception;

    List<T> findByStateTrue() throws Exception;

    Optional<T> findById(String id) throws Exception;

    T save(T entity) throws Exception;

    void update(String id, T entity) throws Exception;

    void delete(String id) throws Exception;
}
