package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.ASecurityBaseEntity;
import com.SENA.FlightManagementSystem.Security.IRepository.ISecurityBaseRepository;
import com.SENA.FlightManagementSystem.Security.IService.ISecurityBaseService;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Abstract base service providing common CRUD operations for Security entities.
 *
 * @param <T> The type of entity extending Security ASecurityBaseEntity.
 */
public abstract class ASecurityBaseService<T extends ASecurityBaseEntity> implements ISecurityBaseService<T> {

    protected abstract ISecurityBaseRepository<T, String> getRepository();

    @Override
    public List<T> all() throws Exception {
        return getRepository().findAll();
    }

    @Override
    public List<T> findByStateTrue() throws Exception {
        return getRepository().findAll();
    }

    @Override
    public Optional<T> findById(String id) throws Exception {
        Optional<T> op = getRepository().findById(id);
        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }
        return op;
    }

    @Override
    public T save(T entity) throws Exception {
        try {
            entity.setId(null);
            entity.setCreatedAt(LocalDateTime.now());
            entity.setCreatedBy(UUID.randomUUID().toString());
            return getRepository().save(entity);
        } catch (Exception e) {
            throw new Exception("Error al guardar la entidad: " + e.getMessage());
        }
    }

    @Override
    public void update(String id, T entity) throws Exception {
        Optional<T> op = getRepository().findById(id);
        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        } else if (op.get().getDeletedAt() != null) {
            throw new Exception("Registro inhabilitado");
        }

        T entityUpdate = op.get();
        String[] ignoreProperties = { "id", "createdAt", "deletedAt", "createdBy", "deletedBy" };
        BeanUtils.copyProperties(entity, entityUpdate, ignoreProperties);
        entityUpdate.setUpdatedAt(LocalDateTime.now());
        entityUpdate.setUpdatedBy(UUID.randomUUID().toString());
        getRepository().save(entityUpdate);
    }

    @Override
    public void delete(String id) throws Exception {
        Optional<T> op = getRepository().findById(id);
        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        T entityUpdate = op.get();
        entityUpdate.setDeletedAt(LocalDateTime.now());
        entityUpdate.setDeletedBy(UUID.randomUUID().toString());
        getRepository().save(entityUpdate);
    }
}
