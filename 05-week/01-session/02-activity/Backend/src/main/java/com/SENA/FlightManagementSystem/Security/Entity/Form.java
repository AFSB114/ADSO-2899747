package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "form", schema = "security")
@Schema(name = "Form", description = "Formulario dentro de un módulo")
public class Form extends ASecurityNamedEntity {

    @Schema(description = "Color del formulario", example = "#2196F3")
    @Column(name = "color", nullable = true, length = 50)
    private String color;

    @Schema(description = "Ícono del formulario", example = "mdi-form-select")
    @Column(name = "icon", nullable = true, length = 100)
    private String icon;

    @Schema(description = "Ruta del formulario", example = "/users/list")
    @Column(name = "path", nullable = true, length = 255)
    private String path;

    @Schema(description = "Sección a la que pertenece el formulario", example = "Administración")
    @Column(name = "section", nullable = true, length = 150)
    private String section;

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }
}
