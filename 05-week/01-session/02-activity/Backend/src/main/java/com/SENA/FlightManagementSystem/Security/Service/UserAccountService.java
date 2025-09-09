package com.SENA.FlightManagementSystem.Security.Service;

import com.SENA.FlightManagementSystem.Security.Entity.UserAccount;
import com.SENA.FlightManagementSystem.Security.IRepository.IUserAccountRepository;
import com.SENA.FlightManagementSystem.Security.IService.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService extends ASecurityBaseService<UserAccount> implements IUserAccountService {

    @Autowired
    private IUserAccountRepository repository;

    @Override
    protected IUserAccountRepository getRepository() {
        return repository;
    }
}
