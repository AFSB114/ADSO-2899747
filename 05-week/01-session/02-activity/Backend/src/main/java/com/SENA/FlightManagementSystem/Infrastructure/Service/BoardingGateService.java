package com.SENA.FlightManagementSystem.Infrastructure.Service;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.BoardingGate;
import com.SENA.FlightManagementSystem.Infrastructure.IRepository.IBoardingGateRepository;
import com.SENA.FlightManagementSystem.Infrastructure.IService.IBoardingGateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardingGateService extends AInfrastructureBaseService<BoardingGate> implements IBoardingGateService {

    @Autowired
    private IBoardingGateRepository repository;

    @Override
    protected IBoardingGateRepository getRepository() {
        return repository;
    }
}
