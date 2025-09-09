package com.SENA.FlightManagementSystem.Flight.Controller;

import com.SENA.FlightManagementSystem.Flight.Entity.Ticket;
import com.SENA.FlightManagementSystem.Flight.IDTO.TicketDTO;
import com.SENA.FlightManagementSystem.Flight.IService.ITicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Ticket")
public class TicketController extends AFlightBaseController<Ticket, ITicketService> {

   public TicketController(ITicketService service) {
       super(service, "Ticket");
   }
}
