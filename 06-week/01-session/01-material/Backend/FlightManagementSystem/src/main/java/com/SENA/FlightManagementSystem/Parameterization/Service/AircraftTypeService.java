package com.SENA.FlightManagementSystem.Parameterization.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Parameterization.Entity.AircraftType;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.IAircraftTypeRepository;
import com.SENA.FlightManagementSystem.Parameterization.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Parameterization.IService.IAircraftTypeService;

@Service
public class AircraftTypeService extends ABaseService<AircraftType> implements IAircraftTypeService {

    @Override
    protected IBaseRepository<AircraftType, String> getRepository() {
        return repository;
    }

    @Autowired
    private IAircraftTypeRepository repository;

}
