package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.Role;
import com.SENA.FlightManagementSystem.Security.IRepository.IRoleRepository;
import com.SENA.FlightManagementSystem.Security.IService.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends ASecurityBaseService<Role> implements IRoleService {

    @Autowired
    private IRoleRepository repository;

    @Override
    protected IRoleRepository getRepository() {
        return repository;
    }
}
