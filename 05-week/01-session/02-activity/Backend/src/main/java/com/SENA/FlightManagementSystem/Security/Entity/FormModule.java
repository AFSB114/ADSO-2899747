package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "form_module", schema = "security")
@Schema(name = "FormModule", description = "Relación entre formularios y módulos")
public class FormModule extends ASecurityBaseEntity {

    @Schema(description = "Formulario relacionado")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", nullable = false)
    private Form formId;

    @Schema(description = "Módulo relacionado")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id", nullable = false)
    private Module moduleId;

    public Form getFormId() { return formId; }
    public void setFormId(Form formId) { this.formId = formId; }

    public Module getModuleId() { return moduleId; }
    public void setModuleId(Module moduleId) { this.moduleId = moduleId; }
}
