package com.SENA.FlightManagementSystem.Flight.Controller;
import com.SENA.FlightManagementSystem.Flight.Entity.Baggage;
import com.SENA.FlightManagementSystem.Flight.IService.IBaggageService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Bagger")
public class BaggeController extends AFlightBaseController<Baggage, IBaggageService> {

   public BaggeController(IBaggageService service) {
       super(service, "Baggage");
   }
    
}
