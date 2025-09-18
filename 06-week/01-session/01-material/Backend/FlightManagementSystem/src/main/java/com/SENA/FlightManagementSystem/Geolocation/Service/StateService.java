package com.SENA.FlightManagementSystem.Geolocation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.State;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepository;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IStateRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.IStateService;

@Service
public class StateService extends ABaseService<State> implements IStateService {

    @Autowired
    private IStateRepository repository;

    @Override
    protected IBaseRepository<State, String> getRepository() {
        return repository;
    }

    @Override
    public List<State> findByStateTrue() throws Exception {
        return repository.findByStatusTrue();
    }

    @Override
    public List<State> findByCountryId(String countryId) throws Exception {
        return repository.findByCountryIdAndStatusTrue(countryId);
    }
}
