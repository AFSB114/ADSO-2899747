package com.SENA.FlightManagementSystem.Parameterization.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Parameterization.Entity.TicketClass;
import com.SENA.FlightManagementSystem.Parameterization.IService.ITicketClassService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/TicketClass")
public class TicketClassController extends ABaseController<TicketClass, ITicketClassService> {

    public TicketClassController(ITicketClassService service) {
        super(service, "TicketClass");
    }

}
