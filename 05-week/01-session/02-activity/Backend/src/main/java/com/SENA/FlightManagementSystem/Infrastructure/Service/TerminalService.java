package com.SENA.FlightManagementSystem.Infrastructure.Service;

import com.SENA.FlightManagementSystem.Infrastructure.Entity.Terminal;
import com.SENA.FlightManagementSystem.Infrastructure.IRepository.ITerminalRepository;
import com.SENA.FlightManagementSystem.Infrastructure.IService.ITerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalService extends AInfrastructureBaseService<Terminal> implements ITerminalService {

    @Autowired
    private ITerminalRepository repository;

    @Override
    protected ITerminalRepository getRepository() {
        return repository;
    }
}
