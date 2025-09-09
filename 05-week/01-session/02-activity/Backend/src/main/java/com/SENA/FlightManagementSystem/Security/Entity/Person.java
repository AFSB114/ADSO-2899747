package com.SENA.FlightManagementSystem.Security.Entity;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;
import com.SENA.FlightManagementSystem.Parameterization.Entity.DocumentType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "person", schema = "security")
@Schema(name = "Person", description = "Persona vinculada a una cuenta de usuario")
public class Person extends ASecurityBaseEntity {

    @Schema(description = "Primer nombre", example = "Juan")
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Schema(description = "Apellido", example = "Pérez")
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Schema(description = "Número de documento", example = "1234567890")
    @Column(name = "document_number", nullable = false, length = 50)
    private String documentNumber;

    @Schema(description = "Fecha de nacimiento", example = "1990-05-20")
    @Column(name = "birth_date", nullable = true)
    private LocalDate birthDate;

    @Schema(description = "Género", example = "M")
    @Column(name = "gender", nullable = true, length = 20)
    private String gender;

    @Schema(description = "Teléfono", example = "+57 300 123 4567")
    @Column(name = "phone", nullable = true, length = 30)
    private String phone;

    @Schema(description = "Correo electrónico", example = "juan.perez@example.com")
    @Column(name = "email", nullable = true, length = 150)
    private String email;

    @Schema(description = "Dirección", example = "Calle 123 #45-67")
    @Column(name = "address", nullable = true, length = 250)
    private String address;

    @Schema(description = "Nombre del acudiente")
    @Column(name = "attendant_name", nullable = true, length = 150)
    private String attendantName;

    @Schema(description = "Teléfono del acudiente")
    @Column(name = "attending_phone", nullable = true, length = 30)
    private String attendingPhone;

    @Schema(description = "Tipo de documento")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_type_id", nullable = false)
    private DocumentType documentTypeId;

    @Schema(description = "Ciudad")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    private City cityId;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAttendantName() { return attendantName; }
    public void setAttendantName(String attendantName) { this.attendantName = attendantName; }

    public String getAttendingPhone() { return attendingPhone; }
    public void setAttendingPhone(String attendingPhone) { this.attendingPhone = attendingPhone; }

    public DocumentType getDocumentTypeId() { return documentTypeId; }
    public void setDocumentTypeId(DocumentType documentTypeId) { this.documentTypeId = documentTypeId; }

    public City getCityId() { return cityId; }
    public void setCityId(City cityId) { this.cityId = cityId; }
}
