package com.SENA.FlightManagementSystem.Parameterization.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Parameterization.Entity.DocumentType;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.IDocumentTypeRepository;
import com.SENA.FlightManagementSystem.Parameterization.IService.IDocumentTypeService;

@Service
public class DocumentTypeService extends ABaseService<DocumentType> implements IDocumentTypeService {

    @Override
    protected IBaseRepository<DocumentType, String> getRepository() {
        return repository;
    }

    @Autowired
	private IDocumentTypeRepository repository;

}
