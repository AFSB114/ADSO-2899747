package com.SENA.FlightManagementSystem.Notifications.Controller;


import com.SENA.FlightManagementSystem.Notifications.Entity.MessageTemplate;
import com.SENA.FlightManagementSystem.Notifications.IService.IMessageTemplateService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/message-template")
@Tag(name = "notification")
public class MessageTemplateController extends ANotificationBaseController<MessageTemplate, IMessageTemplateService>{

    public MessageTemplateController(IMessageTemplateService service) {
        super(service, "MessageTemplate" );
    } //aaa
}
