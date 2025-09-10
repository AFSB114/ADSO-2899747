package com.SENA.FlightManagementSystem.PassengersServices.Entity;

import com.SENA.FlightManagementSystem.Security.Entity.Person;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "passenger", schema = "passengers_services")
@Schema(name = "passengers_services",description = "Clase que representa un pasajero")
public class Passenger extends APassengersServicesBaseEntity {


    @Column(name = "frequent_flyer_number", nullable = false, unique = true)
    private String frequentFlyerNumber;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    public void setFrequentFlyerNumber(String frequentFlyerNumber) {
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
