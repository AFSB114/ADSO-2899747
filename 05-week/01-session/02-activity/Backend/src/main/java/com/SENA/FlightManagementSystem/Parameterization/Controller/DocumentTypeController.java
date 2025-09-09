package com.SENA.FlightManagementSystem.Parameterization.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SENA.FlightManagementSystem.Parameterization.Entity.DocumentType;
import com.SENA.FlightManagementSystem.Parameterization.IService.IDocumentTypeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/DocumentType")
public class DocumentTypeController  extends ABaseController<DocumentType,IDocumentTypeService> {

    public DocumentTypeController(IDocumentTypeService service) {
        super(service, "DocumentType");
    }

}
