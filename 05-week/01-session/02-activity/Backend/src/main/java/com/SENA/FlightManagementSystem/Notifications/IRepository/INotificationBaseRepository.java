package com.SENA.FlightManagementSystem.Notifications.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SENA.FlightManagementSystem.Notifications.Entity.ANotificationBaseEntity;

public interface INotificationBaseRepository<T extends ANotificationBaseEntity, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}