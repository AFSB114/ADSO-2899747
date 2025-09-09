package com.SENA.FlightManagementSystem.Notifications.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SENA.FlightManagementSystem.Notifications.Entity.Notification;
import com.SENA.FlightManagementSystem.Notifications.IRepository.INotificationBaseRepository;
import com.SENA.FlightManagementSystem.Notifications.IService.INotificationService;

@Service
public class NotificationService extends NotificationBaseService<Notification> implements INotificationService {

    @Override
    protected INotificationBaseRepository<Notification, String> getRepository() {
        return repository;
    }

    @Autowired
	private INotificationBaseRepository<Notification, String> repository;

}
