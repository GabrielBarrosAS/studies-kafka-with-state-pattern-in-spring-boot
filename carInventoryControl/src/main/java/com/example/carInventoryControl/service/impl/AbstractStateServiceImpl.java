package com.example.carInventoryControl.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.carInventoryControl.model.states.AbstractState;
import com.example.carInventoryControl.model.states.impl.CarAvailable;
import com.example.carInventoryControl.model.states.impl.CarInMaintenance;
import com.example.carInventoryControl.model.states.impl.CarNotAvailable;
import com.example.carInventoryControl.repository.AbstractStateRepository;
import com.example.carInventoryControl.service.interfaces.AbstractStateService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AbstractStateServiceImpl implements AbstractStateService {

    private final AbstractStateRepository abstractStateRepository;

    @Override
    public List<AbstractState> findAll() {

        return abstractStateRepository.findAll();
    }

    @Override
    public AbstractState getCarAvaliableState() {

        AbstractState a = abstractStateRepository.findBy_class(CarAvailable.class.getTypeName());
        return a;
    }

    @Override
    public AbstractState getCarNotAvaliableState() {

        return abstractStateRepository.findBy_class(CarNotAvailable.class.getTypeName());
    }

    @Override
    public AbstractState getCarInMaintenance() {

        return abstractStateRepository.findBy_class(CarInMaintenance.class.getTypeName());
    }

}
