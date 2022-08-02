package com.example.carInventoryControl.model.states.impl;

import com.example.carInventoryControl.model.states.AbstractState;
import com.example.carInventoryControl.model.states.StateMethods;

import lombok.Builder;

@Builder
public class CarNotAvailable extends AbstractState implements StateMethods {

    @Override
    public StateMethods rentCar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StateMethods devolutionCar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StateMethods sendForMaintenance() {
        // TODO Auto-generated method stub
        return null;
    }

}
