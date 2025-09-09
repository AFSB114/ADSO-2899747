package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.Form;
import com.SENA.FlightManagementSystem.Security.IRepository.IFormRepository;
import com.SENA.FlightManagementSystem.Security.IService.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService extends ASecurityBaseService<Form> implements IFormService {

    @Autowired
    private IFormRepository repository;

    @Override
    protected IFormRepository getRepository() {
        return repository;
    }
}
