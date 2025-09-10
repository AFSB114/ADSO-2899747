package com.SENA.FlightManagementSystem.Flight.Controller;
import com.SENA.FlightManagementSystem.Flight.Entity.Baggage;
import com.SENA.FlightManagementSystem.Flight.IService.IBaggageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Bagger")
@Tag(name = "flight")
public class BaggeController extends AFlightBaseController<Baggage, IBaggageService> {

   public BaggeController(IBaggageService service) {
       super(service, "Baggage");
   }
    
}
