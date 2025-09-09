package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "user_account", schema = "security")
@Schema(name = "UserAccount", description = "Cuenta de usuario del sistema")
public class UserAccount extends ASecurityBaseEntity {

    @Schema(description = "Nombre de usuario", example = "j.perez")
    @Column(name = "username", nullable = false, unique = true, length = 100)
    private String username;

    @Schema(description = "Hash de la contraseña")
    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Schema(description = "Persona asociada")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person personId;

    @Schema(description = "Rol asignado")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role roleId;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public Person getPersonId() { return personId; }
    public void setPersonId(Person personId) { this.personId = personId; }

    public Role getRoleId() { return roleId; }
    public void setRoleId(Role roleId) { this.roleId = roleId; }
}
