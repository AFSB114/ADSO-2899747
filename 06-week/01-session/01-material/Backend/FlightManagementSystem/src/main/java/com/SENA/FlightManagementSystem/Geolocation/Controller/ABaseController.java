package com.SENA.FlightManagementSystem.Geolocation.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SENA.FlightManagementSystem.Geolocation.DTO.ApiResponseDto;
import com.SENA.FlightManagementSystem.Geolocation.Entity.ABaseEntity;
import com.SENA.FlightManagementSystem.Geolocation.IService.IBaseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * Abstract base controller providing common CRUD endpoints for entities.
 * 
 * @param <T> The type of entity extending ABaseEntity.
 * @param <S> The type of service implementing IBaseService for the entity.
 */
public abstract class ABaseController<T extends ABaseEntity, S extends IBaseService<T>> {

    protected S service;
    protected String entityName;

    /**
     * Constructor for ABaseController.
     * 
     * @param service    The service for the entity.
     * @param entityName The name of the entity.
     */
    protected ABaseController(S service, String entityName) {
        this.service = service;
        this.entityName = entityName;
    }

    /**
     * Retrieves all entities with state set to true.
     * 
     * @return A ResponseEntity containing ApiResponseDto with list of entities if
     *         successful,
     *         or error message if unsuccessful.
     */
    @GetMapping
    public ResponseEntity<ApiResponseDto<List<T>>> findByStateTrue() {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<T>>("Datos obtenidos", service.findByStateTrue(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<T>>(e.getMessage(), null, false));
        }
    }

    /**
     * Retrieves an entity by its ID.
     * 
     * @param id The ID of the entity to retrieve.
     * @return A ResponseEntity containing ApiResponseDto with the entity if found,
     *         or error message if not found.
     */
    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDto<Optional<T>>> show(@PathVariable String id) {
        try {
            Optional<T> entity = service.findById(id);
            return ResponseEntity.ok(new ApiResponseDto<Optional<T>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new ApiResponseDto<Optional<T>>(e.getMessage(), null, false));
        }
    }

    /**
     * Saves an entity.
     * 
     * @param entity The entity to save.
     * @return A ResponseEntity containing ApiResponseDto with the saved entity if
     *         successful,
     *         or error message if unsuccessful.
     */
    @PostMapping
    @Operation(summary = "Crear un nuevo " + "registro", description = "Crea un nuevo registro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Registro creado exitosamente"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada inválidos"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<ApiResponseDto<T>> save(@RequestBody T entity) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<T>("Datos guardados", service.save(entity), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
        }
    }

    /**
     * Updates an existing entity by its ID.
     * 
     * @param id     The ID of the entity to update.
     * @param entity The updated entity.
     * @return A ResponseEntity containing ApiResponseDto with success message if
     *         successful,
     *         or error message if unsuccessful.
     */
    @PutMapping("{id}")
    @Operation(summary = "Actualizar " + "registro", description = "Actualiza un registro existente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Registro actualizado exitosamente"),
            @ApiResponse(responseCode = "404", description = "Registro no encontrado"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada inválidos"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<ApiResponseDto<String>> update(@PathVariable String id, @RequestBody T entity) {
        try {
            service.update(id, entity);
            return ResponseEntity.ok(new ApiResponseDto<String>("Datos actualizados", "OK", true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<String>(e.getMessage(), null, false));
        }
    }

    /**
     * Deletes an entity by its ID.
     * 
     * @param id The ID of the entity to delete.
     * @return A ResponseEntity containing ApiResponseDto with success message if
     *         successful,
     *         or error message if unsuccessful.
     */
    @DeleteMapping("{id}")
    @Operation(summary = "Eliminar " + "registro", description = "Elimina un registro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Registro eliminado exitosamente"),
            @ApiResponse(responseCode = "404", description = "Registro no encontrado"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<ApiResponseDto<String>> delete(@PathVariable String id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(new ApiResponseDto<String>("Registro eliminado", "OK", true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<String>(e.getMessage(), null, false));
        }
    }
}
