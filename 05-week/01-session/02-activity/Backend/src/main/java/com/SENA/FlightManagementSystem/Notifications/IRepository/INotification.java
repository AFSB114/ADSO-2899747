package com.SENA.FlightManagementSystem.Notifications.IRepository;

import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Notifications.Entity.Notification;

@Repository

public interface INotification extends INotificationBaseRepository<Notification, String>{
    // Métodos comunes para repositorios
}
