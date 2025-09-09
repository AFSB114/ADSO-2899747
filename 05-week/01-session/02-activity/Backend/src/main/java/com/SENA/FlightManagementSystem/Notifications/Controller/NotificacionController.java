package com.SENA.FlightManagementSystem.Notifications.Controller;

import com.SENA.FlightManagementSystem.Notifications.Entity.Notification;
import com.SENA.FlightManagementSystem.Notifications.IService.INotificationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/notification")
public class NotificacionController extends ANotificationBaseController<Notification, INotificationService>{

    public NotificacionController(INotificationService service) {
        super(service, "Notification");
    }
}
