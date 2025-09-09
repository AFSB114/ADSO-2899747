package com.SENA.FlightManagementSystem.Notifications.IRepository;

import org.springframework.stereotype.Repository;

import com.SENA.FlightManagementSystem.Notifications.Entity.MessageTemplate;

@Repository

public interface IMessageTemplate extends INotificationBaseRepository<MessageTemplate, String>{
    // Métodos comunes para repositorios
}
