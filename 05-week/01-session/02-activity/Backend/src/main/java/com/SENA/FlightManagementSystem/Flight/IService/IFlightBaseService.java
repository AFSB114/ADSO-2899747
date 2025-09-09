package com.SENA.FlightManagementSystem.Flight.IService;

import com.SENA.FlightManagementSystem.Flight.Entity.AFlightBaseEntity;

import java.util.List;
import java.util.Optional;

public interface IFlightBaseService<T extends AFlightBaseEntity>  {
    List<T> all() throws Exception;
    List<T> findByStateTrue() throws Exception;
    Optional<T> findById(String id) throws Exception;
    T save(T entity) throws Exception;
    void update(String id, T entity) throws Exception;
    void delete(String id) throws Exception;
}
