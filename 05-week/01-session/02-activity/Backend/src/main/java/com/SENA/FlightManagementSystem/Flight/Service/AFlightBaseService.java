package com.SENA.FlightManagementSystem.Flight.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.SENA.FlightManagementSystem.Flight.Entity.AFlightBaseEntity;
import com.SENA.FlightManagementSystem.Flight.IRepository.IFlightBaseRepository;
import com.SENA.FlightManagementSystem.Flight.IService.IFlightBaseService;
import org.springframework.beans.BeanUtils;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.AInfrastructureBaseEntity;
import com.SENA.FlightManagementSystem.Infrastructure.IRepository.IInfrastructureBaseRepository;
import com.SENA.FlightManagementSystem.Infrastructure.IService.IInfrastructureBaseService;

/**
 * Abstract base service providing common CRUD operations for Infrastructure entities.
 *
 * @param <T> The type of entity extending AInfrastructureBaseEntity.
 */
abstract public class AFlightBaseService<T extends AFlightBaseEntity> implements IFlightBaseService<T> {

    protected abstract IFlightBaseRepository<T, String> getRepository();

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
            entity.setId(null); // Dejar que JPA genere automáticamente el UUID
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
