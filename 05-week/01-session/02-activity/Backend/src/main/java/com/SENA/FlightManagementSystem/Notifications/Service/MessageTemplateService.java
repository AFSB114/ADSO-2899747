package com.SENA.FlightManagementSystem.Notifications.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Notifications.Entity.MessageTemplate;
import com.SENA.FlightManagementSystem.Notifications.IRepository.INotificationBaseRepository;
import com.SENA.FlightManagementSystem.Notifications.IService.IMessageTemplateService;

@Service
public class MessageTemplateService extends NotificationBaseService<MessageTemplate> implements IMessageTemplateService {

    @Override
    protected INotificationBaseRepository<MessageTemplate, String> getRepository() {
        return repository;
    }

    @Autowired
	private INotificationBaseRepository<MessageTemplate, String> repository;

}
