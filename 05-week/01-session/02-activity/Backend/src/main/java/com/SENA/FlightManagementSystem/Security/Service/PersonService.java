package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.Person;
import com.SENA.FlightManagementSystem.Security.IRepository.IPersonRepository;
import com.SENA.FlightManagementSystem.Security.IService.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends ASecurityBaseService<Person> implements IPersonService {

    @Autowired
    private IPersonRepository repository;

    @Override
    protected IPersonRepository getRepository() {
        return repository;
    }
}
