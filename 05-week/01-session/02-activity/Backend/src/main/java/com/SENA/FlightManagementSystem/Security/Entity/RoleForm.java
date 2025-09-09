package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "role_form", schema = "security")
@Schema(name = "RoleForm", description = "Relación entre roles y formularios")
public class RoleForm extends ASecurityBaseEntity {

    @Schema(description = "Rol relacionado")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role roleId;

    @Schema(description = "Formulario relacionado")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", nullable = false)
    private Form formId;

    public Role getRoleId() { return roleId; }
    public void setRoleId(Role roleId) { this.roleId = roleId; }

    public Form getFormId() { return formId; }
    public void setFormId(Form formId) { this.formId = formId; }
}
