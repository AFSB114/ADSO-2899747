package com.SENA.FlightManagementSystem.Infrastructure.Entity;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name ="airport", schema = "infrastructure")
@Schema(name = "Airport", description = "Entidad que representa un aeropuerto dentro del sistema de gestión de vuelos")
public class Airport extends AInfrastructureBaseEntity{

    @Schema(description = "Dirección física del aeropuerto", example = "Av. El Dorado #103-9, Bogotá")
    @Column(name = "address", nullable = false)
    private String address;

    @Schema(description = "Ciudad a la que pertenece el aeropuerto", example = "{\"id\":\"c123\",\"name\":\"Bogotá\"}")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    private City cityId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }
}
