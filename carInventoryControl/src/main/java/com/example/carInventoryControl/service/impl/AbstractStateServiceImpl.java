package com.example.carInventoryControl.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.carInventoryControl.model.states.AbstractState;
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
    public AbstractState getStateForClass(String _class) {

        return abstractStateRepository.findBy_class(_class);

    }

}
