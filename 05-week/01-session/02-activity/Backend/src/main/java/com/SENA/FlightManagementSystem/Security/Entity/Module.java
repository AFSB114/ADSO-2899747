package com.SENA.FlightManagementSystem.Security.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "module", schema = "security")
@Schema(name = "Module", description = "Módulo del sistema")
public class Module extends ASecurityNamedEntity {

    @Schema(description = "Color del módulo", example = "#4CAF50")
    @Column(name = "color", nullable = true, length = 50)
    private String color;

    @Schema(description = "Ícono del módulo", example = "mdi-view-dashboard")
    @Column(name = "icon", nullable = true, length = 100)
    private String icon;

    @Schema(description = "Ruta del módulo", example = "/dashboard")
    @Column(name = "path", nullable = true, length = 255)
    private String path;

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }
}
