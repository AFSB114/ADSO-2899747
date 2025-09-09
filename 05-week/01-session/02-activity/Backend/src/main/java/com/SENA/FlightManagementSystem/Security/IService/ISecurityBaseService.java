package com.SENA.FlightManagementSystem.Security.IService;

import com.SENA.FlightManagementSystem.Security.Entity.ASecurityBaseEntity;

import java.util.List;
import java.util.Optional;

public interface ISecurityBaseService<T extends ASecurityBaseEntity> {
    List<T> all() throws Exception;
    List<T> findByStateTrue() throws Exception;
    Optional<T> findById(String id) throws Exception;
    T save(T entity) throws Exception;
    void update(String id, T entity) throws Exception;
    void delete(String id) throws Exception;
}
