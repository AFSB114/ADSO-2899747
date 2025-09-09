package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.FormModule;
import com.SENA.FlightManagementSystem.Security.IRepository.IFormModuleRepository;
import com.SENA.FlightManagementSystem.Security.IService.IFormModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormModuleService extends ASecurityBaseService<FormModule> implements IFormModuleService {

    @Autowired
    private IFormModuleRepository repository;

    @Override
    protected IFormModuleRepository getRepository() {
        return repository;
    }
}
