package com.SENA.FlightManagementSystem.Infrastructure.Controller;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.BoardingGate;
import com.SENA.FlightManagementSystem.Infrastructure.IService.IBoardingGateService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/BoardingGate")
public class BoardingGateController extends AInfrastructureBaseController<BoardingGate, IBoardingGateService> {

    public BoardingGateController(IBoardingGateService service) {
        super(service, "BoardingGate");
    }
}
