package com.SENA.FlightManagementSystem.Parameterization.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Parameterization.Entity.CrewRole;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.ICrewRoleRepository;
import com.SENA.FlightManagementSystem.Parameterization.IService.ICrewRoleService;

@Service
public class CrewRoleService extends ABaseService<CrewRole> implements ICrewRoleService {

    @Override
    protected IBaseRepository<CrewRole, String> getRepository() {
        return repository;
    }

    @Autowired
    private ICrewRoleRepository repository;

}
