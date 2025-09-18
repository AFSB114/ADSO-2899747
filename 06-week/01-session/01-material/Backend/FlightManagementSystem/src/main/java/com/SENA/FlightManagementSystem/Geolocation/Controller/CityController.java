package com.SENA.FlightManagementSystem.Geolocation.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Geolocation.DTO.ApiResponseDto;
import com.SENA.FlightManagementSystem.Geolocation.Entity.City;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICityService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/City")
public class CityController extends ABaseController<City, ICityService> {

    public CityController(ICityService service) {
        super(service, "City");
    }

    /**
     * Obtiene todas las ciudades de un estado específico
     * 
     * @param stateId ID del estado
     * @return Lista de ciudades del estado
     */
    @GetMapping("state/{stateId}")
    @Operation(summary = "Obtener ciudades por estado", description = "Obtiene todas las ciudades de un estado específico")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ciudades obtenidas exitosamente"),
            @ApiResponse(responseCode = "404", description = "Estado no encontrado"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<ApiResponseDto<List<City>>> findByStateId(@PathVariable String stateId) {
        try {
            List<City> cities = service.findByStateId(stateId);
            return ResponseEntity.ok(new ApiResponseDto<List<City>>("Ciudades encontradas", cities, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new ApiResponseDto<List<City>>(e.getMessage(), null, false));
        }
    }
}
