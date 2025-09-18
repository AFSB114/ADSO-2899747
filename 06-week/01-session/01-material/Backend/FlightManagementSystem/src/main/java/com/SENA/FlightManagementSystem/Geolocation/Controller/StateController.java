package com.SENA.FlightManagementSystem.Geolocation.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Geolocation.DTO.ApiResponseDto;
import com.SENA.FlightManagementSystem.Geolocation.Entity.State;
import com.SENA.FlightManagementSystem.Geolocation.IService.IStateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/State")
public class StateController extends ABaseController<State, IStateService> {

    public StateController(IStateService service) {
        super(service, "State");
    }

    /**
     * Obtiene todos los estados de un país específico
     * 
     * @param countryId ID del país
     * @return Lista de estados del país
     */
    @GetMapping("country/{countryId}")
    @Operation(summary = "Obtener estados por país", description = "Obtiene todos los estados de un país específico")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Estados obtenidos exitosamente"),
            @ApiResponse(responseCode = "404", description = "País no encontrado"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<ApiResponseDto<List<State>>> findByCountryId(@PathVariable String countryId) {
        try {
            List<State> states = service.findByCountryId(countryId);
            return ResponseEntity.ok(new ApiResponseDto<List<State>>("Estados encontrados", states, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new ApiResponseDto<List<State>>(e.getMessage(), null, false));
        }
    }
}
