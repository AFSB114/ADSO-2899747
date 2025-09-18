package com.SENA.FlightManagementSystem.Geolocation.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Geolocation.DTO.ApiResponseDto;
import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICountryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Country")
public class CountryController extends ABaseController<Country, ICountryService> {

    public CountryController(ICountryService service) {
        super(service, "Country");
    }

    /**
     * Obtiene todos los países de un continente específico
     * 
     * @param continentId ID del continente
     * @return Lista de países del continente
     */
    @GetMapping("continent/{continentId}")
    @Operation(summary = "Obtener países por continente", description = "Obtiene todos los países de un continente específico")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Países obtenidos exitosamente"),
            @ApiResponse(responseCode = "404", description = "Continente no encontrado"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<ApiResponseDto<List<Country>>> findByContinentId(@PathVariable String continentId) {
        try {
            List<Country> countries = service.findByContinentId(continentId);
            return ResponseEntity.ok(new ApiResponseDto<List<Country>>("Países encontrados", countries, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new ApiResponseDto<List<Country>>(e.getMessage(), null, false));
        }
    }
}
