package com.SENA.FlightManagementSystem.Infrastructure.Controller;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.Terminal;
import com.SENA.FlightManagementSystem.Infrastructure.IService.ITerminalService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Terminal")
public class TerminalController extends AInfrastructureBaseController<Terminal, ITerminalService> {

    public TerminalController(ITerminalService service) {
        super(service, "Terminal");
    }
}
