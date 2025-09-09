package com.SENA.FlightManagementSystem.Notifications.Controller;


import com.SENA.FlightManagementSystem.Notifications.Entity.MessageTemplate;
import com.SENA.FlightManagementSystem.Notifications.IService.IMessageTemplateService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/message-template")
public class MessageTemplateController extends ANotificationBaseController<MessageTemplate, IMessageTemplateService>{

    public MessageTemplateController(IMessageTemplateService service) {
        super(service, "MessageTemplate" );
    } //aaa
}
