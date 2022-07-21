package com.example.carInventoryControl.model.states;

import org.springframework.data.annotation.Id;

public class carNotAvailable implements StateCar {

    @Id
    private String id;
    
    @Override
    public StateCar rentCar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StateCar devolutionCar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StateCar sendForMaintenance() {
        // TODO Auto-generated method stub
        return null;
    }

}
