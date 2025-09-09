package com.SENA.FlightManagementSystem.Infrastructure.IService;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.AInfrastructureBaseEntity;

import java.util.List;
import java.util.Optional;

public interface IInfrastructureBaseService<T extends AInfrastructureBaseEntity> {
    List<T> all() throws Exception;
    List<T> findByStateTrue() throws Exception;
    Optional<T> findById(String id) throws Exception;
    T save(T entity) throws Exception;
    void update(String id, T entity) throws Exception;
    void delete(String id) throws Exception;
}
