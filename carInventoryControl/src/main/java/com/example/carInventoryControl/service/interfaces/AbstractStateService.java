package com.example.carInventoryControl.service.interfaces;

import java.util.List;

import com.example.carInventoryControl.model.states.AbstractState;

public interface AbstractStateService {

    List<AbstractState> findAll();

    AbstractState getStateForClass(String _class);

}
