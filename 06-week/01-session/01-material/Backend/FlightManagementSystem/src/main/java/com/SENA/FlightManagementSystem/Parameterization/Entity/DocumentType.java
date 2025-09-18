package com.SENA.FlightManagementSystem.Parameterization.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="document_type", schema = "parameterization")
@Schema(name = "document_type", description = "Entidad que representa los tipos de documentos")
public class DocumentType extends ABaseEntity{
    
}
