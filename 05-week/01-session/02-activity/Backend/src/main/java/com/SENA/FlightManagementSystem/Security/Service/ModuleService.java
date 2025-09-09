package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.Module;
import com.SENA.FlightManagementSystem.Security.IRepository.IModuleRepository;
import com.SENA.FlightManagementSystem.Security.IService.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService extends ASecurityBaseService<Module> implements IModuleService {

    @Autowired
    private IModuleRepository repository;

    @Override
    protected IModuleRepository getRepository() {
        return repository;
    }
}
