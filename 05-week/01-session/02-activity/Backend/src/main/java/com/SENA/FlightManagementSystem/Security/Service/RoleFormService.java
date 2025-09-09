package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.RoleForm;
import com.SENA.FlightManagementSystem.Security.IRepository.IRoleFormRepository;
import com.SENA.FlightManagementSystem.Security.IService.IRoleFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleFormService extends ASecurityBaseService<RoleForm> implements IRoleFormService {

    @Autowired
    private IRoleFormRepository repository;

    @Override
    protected IRoleFormRepository getRepository() {
        return repository;
    }
}
